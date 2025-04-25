import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.math.BigDecimal;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.time.Duration;
import java.text.DateFormat;
import java.util.regex.Pattern;


public class Main {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Result: " + getAlphaNumericString(6, true));
        System.out.println("Result: " + getAlphaNumericString(64, false));
        
        /*String phone = "331395313";
        
        if (phone.length() > 10)
            phone = phone.substring(phone.length() - 10);
        
        System.out.println("Phone: " + phone);
        
        List<String> tel = List.of("2133920283","3108014116","6194543788","6642355869","9512397707", "3313953137", "16196009936", "664-169-08-67", "831 133 6230");
        List<String> result = new ArrayList<>();
        
        if (result.isEmpty())
            result = new ArrayList<>(tel);
        
        System.out.println(result.size());*/
        
        System.out.println(formatDateInLocal(new Date(), "es"));
        
        
        //calculateTimeinHours();
        
        /*
        getNewDate();
        
        String text = "Dog bites man";
        System.out.println("lista_original :" + text);
        System.out.println("lista_nueva    :" + reverseList(text));
        
        text = "1 2 3 4 5";
        System.out.println("lista_original :" + text);
        System.out.println("lista_nueva    :" + reverseList(text));*/
        
        /*
        System.out.println("Moves: " + solution("07:30", "08:00"));
        System.out.println("Moves: " + solution("23:45", "08:00"));
        System.out.println("Moves: " + solution("08:15", "07:13"));
        System.out.println("Moves: " + solution("08:45", "08:00"));
        System.out.println("Moves: " + solution("13:48", "14:10"));
        System.out.println("Moves: " + solution("13:01", "00:00"));

        
        /*
        List<String> phone = List.of("2133920283","3108014116","6194543788","6642355869","9512397707", "52", "1", "3313953137", "16196009936", "664-169-08-67", "831 133 6230");
        for (String p : phone)
            System.out.println("New: " + getPhoneCountryCode(p.replaceAll("[{}/^.,; :!*+&_$#?-]*", "")));
        
        String fecha = "1954-01-11";
        int edad = 60;
        System.out.println(isAdultOrSenior(fecha, edad) ? "WEB6060" : "WEB9999");
        
        List<String> ACCOUNTS = new ArrayList<>();
        ACCOUNTS.add("0088");
        ACCOUNTS.add("0020H");
        ACCOUNTS.add("0088A");
        ACCOUNTS.add("9999");
        ACCOUNTS.add("6060");
        ACCOUNTS.add("4075");
        ACCOUNTS.add("473E");
        ACCOUNTS.add("473FAM");
        ACCOUNTS.add("9996");
        ACCOUNTS.add("9995");
        ACCOUNTS.add("8041");
        ACCOUNTS.add("WEB9999");
        ACCOUNTS.add("WEB6060");
        
        String company = "0033CR";
        System.out.println(ACCOUNTS.contains(company) ? company : "ACCOUNT_0000");
        
        BigDecimal bd = new BigDecimal("100.00");
        System.out.println(bd.stripTrailingZeros().scale() >= 0);
        
        BigDecimal bd1 = new BigDecimal("100.01");
        System.out.println(bd1.stripTrailingZeros().scale() >= 0);
        
        String purchase = "25/Dic./2023";
        System.out.println(purchase.replace(".", ""));
        
        System.out.println(capitalize("leon luis", "margallan diaz"));
        System.out.println(capitalize("jose mario", "perez velazquez"));
        System.out.println(capitalize("iveth", "garcia mora"));
        System.out.println(capitalize("ilse", "perez"));
        System.out.println(capitalize("inna arleth", "perez"));
        System.out.println(capitalize("", "aguila hernandez"));
        System.out.println(capitalize("david", null));
        System.out.println(capitalize("leon", "luis"));
        System.out.println(capitalize(null, "margallan diaz"));
        */
        
        /*
        System.out.println("UUID: " + getUUIDforSerial(19));
        
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Hora (LocalDateTime):    " + String.valueOf(dateTime));
        System.out.println("Hora (formatDate):       " + formatDate(dateTime));
        System.out.println("Hora (getDateFromLocal): " + getDateFromLocalDateTime(dateTime));
        System.out.println("Hora (getNewDate):       " + getNewDate());
        */
        
        /*
        String sass = "004231019/0001";
        String folio = sass.replace("/", "-");
        System.out.println(folio);
        */
        
        /*
        HashMap<Integer, String> cuenta = new HashMap<>();
        cuenta.put(26,  "0088");
        cuenta.put(277, "0020H");
        cuenta.put(283, "0088A");
        cuenta.put(323, "9999");
        cuenta.put(324, "6060");
        cuenta.put(326, "4075");
        cuenta.put(336, "473E");
        cuenta.put(338, "473FAM");
        cuenta.put(704, "9996");
        cuenta.put(705, "9995");
        cuenta.put(840, "8041");
        cuenta.put(929, "WEB9999");
        cuenta.put(930, "WEB6060");
        
        String company = "323";
        String result = cuenta.get(Integer.parseInt(company));
        System.out.println("result: " + result);*/
        
        
        //System.out.println(getNoRepeatableCharacter());
        
        /*
        List<String> estudios = Arrays.asList("506, 527".split(","));
        estudios.stream().forEach(System.out::println);
        
        for(int index = 0; index < estudios.size(); index++) {
            System.out.println("-" + estudios.get(index).trim() + "-");
        }
        
        List<String> ids1 = new ArrayList<>();
        List<String> ids2 = Arrays.asList("506, 527".split(","));
        List<String> ids3 = null;
        
        System.out.println("ids1: " + ids1);
        System.out.println("ids2: " + ids2);
        System.out.println("ids3: " + ids3);*/
        
        /*
        String searchTerm = "Tu Guia 36 Tu Guia Alfa Plus";
        Set<String> words = Arrays.stream(searchTerm.split("\\s+")).collect(Collectors.toSet());
        words.forEach(word -> System.out.println(word));*/
        
        /*
        String name = "null";
        String test = null;
        System.out.println(name.equals(test));
        int folioSASS = 1559110;
        System.out.println("Folio: " + String.valueOf(folioSASS));*/
        
        /*
        String fecha = "2005-09-26";
        LocalDate dob = LocalDate.parse(fecha);
        System.out.println(fecha + " -  Eres: " + (calculateAge(dob) ? "Mayor de edad " : "Menor de edad"));
        
        
        String fecha1 = "2005-09-27";
        LocalDate dob1 = LocalDate.parse(fecha1);
        System.out.println(fecha1 + " -  Eres: " + (calculateAge(dob1) ? "Mayor de edad " : "Menor de edad"));
        
        String fecha2 = "2005-09-28";
        LocalDate dob2 = LocalDate.parse(fecha2);
        System.out.println(fecha2 + " -  Eres: " + (calculateAge(dob2) ? "Mayor de edad " : "Menor de edad"));*/
        
        /*
        List<String> lista = Arrays.asList("1,2,5".split(","));
        lista.stream().forEach( x -> System.out.println("item: " + x));
        
        String name = "anita";
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println(name);
        System.out.println(name.toUpperCase());*/
        
        /*
        String firstName = "Jose";
        String middleName = null;
        String fullName = firstName;
        fullName = fullName.concat((middleName == null || middleName == "") ? "" : " " + middleName );


        String str = "  Hello+- ^J_ava+ -Programmer^^^--^^^+!         ";
        str = str.trim();
        str = str.replaceAll("[{}/^.,;:!*+&_$#?-]*", "");
        System.out.println("-" + str + "-");
        
        String[] myArray = {"Paciente","PACIENTE","CERTUSADMIN","certusadmin","CertusAdmin","Certus Admin"};
        String x = "certusadmin";
        
        boolean found = Arrays.stream(myArray).anyMatch(x::equals);
        System.out.println( found ? "Sí existe" : "No existe" );
        String nombre = "ARMANDO";
        String nombreCompleto = "MORENO ZARATE ARMANDO";
        System.out.println( "Apellidos: " + reverseWord(nombre, nombreCompleto));
        String correo = "     MARIO.PEREZ@WIZELINE.COM        ";
        System.out.println("-" + correo + "-");
        System.out.println("-" + correo.trim().toLowerCase() + "-");*/
        
        /*
        String price = "0.00";
        BigDecimal total3ra = new BigDecimal(price);
        BigDecimal zero = new BigDecimal("0.00");
        
        System.out.println("total: " + total3ra.toString());
        System.out.println("zero:  " + zero.toString());
        System.out.println("equals: " + BigDecimal.ZERO.equals(total3ra));
        System.out.println("compareTo: " + zero.compareTo(total3ra));
        
        String str = "05";
        int num = Integer.parseInt(str);
        System.out.println("'" + num + "'");*/
        
        /*
        ayuno(Arrays.asList("AYU00,AYU01,AYU03,AYU04,AYU05,AYU06,AYU07,AYU07,AYU08,AYU12".split(",")));
        ayuno(Arrays.asList("AYU00,AYU03,AYU04,AYU05,AYU06,AYU07,AYU07,AYU08".split(",")));
        ayuno(Arrays.asList("AYU01,AYU03,AYU04,AYU05,AYU06,AYU07,AYU07".split(",")));
        ayuno(Arrays.asList("AYU00,AYU01,AYU08,AYU12".split(",")));
        ayuno(Arrays.asList("AYU00,AYU01".split(",")));
        ayuno(Arrays.asList("AYU08,AYU12".split(",")));
        ayuno(Arrays.asList("AYU00".split(",")));
        ayuno(Arrays.asList("AYU01".split(",")));*/
        
        /*
        String codigo = "AA-001";
        System.out.println(codigo + "-" + getNextCode("1"));
        System.out.println(codigo + "-" + getNextCode("20"));
        System.out.println(codigo + "-" + getNextCode("300"));
        System.out.println(codigo + "-" + getNextCode("4000"));
        System.out.println(codigo + "-" + getNextCode("99999"));
        System.out.println(codigo + "-" + getNextCode("600000"));
        String orderByQuery = "Habilitado DESC, Codigo";
        String query = "SELECT * FROM dbo.SearchStudyView ORDER BY :orderByQuery OFFSET :pageNumber * :rowsOfPage ROWS FETCH NEXT :rowsOfPage ROWS ONLY;";
        query = query.replace(":orderByQuery", orderByQuery);
        System.out.println(query);*/
        
        /*
        String[] msg = {
            "Undefined index: @FormaPago | /var/www/html/api/cfdi/timbrar.php ([159])",
            "Error -1 al timbrar: 'El campo RFC del receptor debe contener el valor XAXX010101000.'",
            "Error 301 al timbrar: 'XML mal formado o con estructura inválida: cvc-minInclusive-valid: Value '0.00' is not facet-valid with respect to minInclusive '0.000001' for type '#AnonType_BaseTrasladoTrasladosImpuestosConceptoConceptosComprobante'.  - Elemento:  Traslado'",
            "comprobante con folio: CDEV752 ya se encuentra registrado",
            "Cannot read properties of undefined (reading 'categoria') | TypeError: Cannot read properties of undefined (reading 'categoria') at creaEstructuraDetalle (/var/www/tech-mid/api/cfdi.js:900:41) at runMicrotasks (<anonymous>) at processTicksAndRejections (node:internal/process/task_queues:96:5) at async /var/www/tech-mid/api/cfdi.js:1193:18"
        };
        for (String errorMessage : msg) {
            HashMap<Integer, String> result = getErrorMessage(errorMessage);
            System.out.println("Message: " + result.get(0));
            System.out.println("Error: " + result.get(1));
        }*/
        
        /*
        System.out.println("Generated Code: " + getNewCode("clase"));*/
        
        /*
        String str = "Ayuno 12 horas.;";
        StringBuilder analitosString = new StringBuilder(str);
        analitosString.deleteCharAt(analitosString.length() - 1);
        System.out.println("-- " + str);
        System.out.println("-- " + analitosString.toString());
        
        getIndications();
        
        System.out.println("Generated Code: " + getNewCode("HECTOR"));
        
        System.out.println(getCode("SAL00"));*/
        
        /*
        String gender = "Femeninox";
        if (!("Masculino".equals(gender) || "Femenino".equals(gender)))
            System.out.println("No es igual a ninguno");
        else
            System.out.println(gender);*/
        
        /*
        List<Integer> studies = new ArrayList<>();
        studies.add(10001);
        studies.add(10040);
        studies.add(10043);
        studies.add(10020);
        System.out.println("toString(): " + studies.toString());
        String newTxt = studies.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println("joining: " + newTxt);*/
        
        /*
        System.out.println(getResultado(null));
        System.out.println(getResultado(""));
        System.out.println(getResultado(" "));
        System.out.println(getResultado("SASS"));
        System.out.println(getResultado("PENDIENTE DE MUESTRA"));
        System.out.println(getResultado("COMPLETO"));
        System.out.println(getResultado("CANCELADO"));
        System.out.println(getResultado("EN PROCESO"));*/
        
        /*
        String lista = "ALC24,INS01,LAB02,ORI02,ORI05";
        List<String> indicaciones = Stream.of(lista.split(",", -1)).collect(Collectors.toList());
        System.out.println("lista: " + lista);
        System.out.println("indicaciones: " + indicaciones.toString());
        indicaciones.remove("ALC24");
        System.out.println("indicaciones (coma): " + indicaciones.toString());
        
        String kidsIndications = String.join(",", indicaciones);
        System.out.println("kidsIndications: " + kidsIndications);*/
        
        /*
        String folio = "1479697.0";
        String folio1 = "1479695";
        if (folio.indexOf(".") > 0)
            folio = folio.substring(0, folio.indexOf("."));
        System.out.println("Folio: " + folio);
        if (folio1.indexOf(".") > 0)
            folio1 = folio1.substring(0, folio1.indexOf("."));
        System.out.println("Folio: " + folio1);
        Integer sucursal1 = null;
        Integer sucursal2 = 0;
        Integer sucursal3 = 20;
        boolean flag1 = null != sucursal1 && 0 > sucursal1;
        boolean flag2 = null != sucursal2 && 0 > sucursal2;
        boolean flag3 = null != sucursal3 && 0 > sucursal3;
        
        System.out.println( "Sucursal1: " + flag1 );
        System.out.println( "Sucursal1: " + flag2 );
        System.out.println( "Sucursal1: " + flag3 );
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Hora: " + String.valueOf(dateTime));
        System.out.println("Hora: " + formatDate(dateTime));
        Date d = new Date(1675200691);
        Date d2 = new Date(1675200691 * 1000);
        System.out.println("Fecha: " + d);
        System.out.println("Fecha: " + d2);*/
        
        
        /*
        String apellido = "saenz muñoz de alba";
        String lastName = "GARCIAMORA";
        
        System.out.println("Apellido: -" + getLastNameOmnichannel(apellido) + "-");
        System.out.println("lastName: " + getLastNameOmnichannel(lastName));
        System.out.println("lastName: " + getLastNameOmnichannel(null)); */
    
        /*
        List<String> lista = Arrays.asList("1,2,5".split(","));
        System.out.println("lista.size(): " + lista.size());
        System.out.println("lista.isEmpty(): " + lista.isEmpty());
        
        List<String> lista1 = new ArrayList();
        System.out.println("lista1.size(): " + lista1.size());
        System.out.println("lista1.isEmpty(): " + lista1.isEmpty());*/
        
        /*
        LocalDate fecha = LocalDate.of(1982, 10, 9);
        System.out.println("isSenior: " + isSenior(fecha));
        LocalDate fecha1 = LocalDate.of(1963, 9, 21);
        System.out.println("isSenior: " + isSenior(fecha1));*/
        
        /*
        System.out.println("Fecha: " + getDateFromCodigoToma("003230222/002").toString());
        System.out.println("Now:   " + LocalDateTime.now().toString());*/
    }
    
    static String capitalize(String firstName, String lastName) {
        if (firstName == null || firstName.isEmpty())
            return "";
        String name = firstName.concat((lastName == null || lastName.isEmpty()) ? "" : " " + lastName);
        String[] words = name.split(" ");
        StringBuilder capitalizedName = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                capitalizedName.append(capitalizedWord).append(" ");
            }
        }

        if (capitalizedName.length() > 0)
            capitalizedName.deleteCharAt(capitalizedName.length() - 1);

        return capitalizedName.toString();
    }
    
    static String getNoRepeatableCharacter() {
        String text = "CAOOBBAC";
        Set<String> letters = new HashSet<>();
        int index = 0;
        char letter = ' ';
        boolean found = false;
        
        for (; index < text.length(); index++) {
            letter = text.charAt(index);
            System.out.println("letter: " + letter);
            if (index == text.length())
                break;
                
            String subText = text.substring(index + 1);
            System.out.println("subText: " + subText);
            
            System.out.println("Set: " + letters);
            
            if (subText.indexOf(letter) < 0) {
                System.out.println("Contains: " + letters.contains(String.valueOf(letter)));
                if (!letters.contains(String.valueOf(letter))) {
                    found = true;
                    break;
                }
            }
            letters.add(String.valueOf(letter));
            System.out.println();
        }
        
        if (found)
            return "Letter " + letter + " at position: " + index + " DOES NOT repeat";
        else
            return "Ninguna letra se repite";
    }
    
    static boolean isSenior(LocalDate fecha) {
        LocalDate curDate = LocalDate.now();
        if (fecha != null) {
            int diff = Period.between(fecha, curDate).getYears();
            return diff >= 60;
        }
        
        return false;
    }
    
    // 024230512/0005
    static LocalDateTime getDateFromCodigoToma(String codigoToma) {
        if (codigoToma == null)
            return LocalDateTime.now();
    
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yy");
        int currentYear = Integer.parseInt(formatter.format(currentDate)) + 1;

        int yy = Integer.parseInt(codigoToma.substring(3, 5));
        int mm = Integer.parseInt(codigoToma.substring(5, 7));
        int dd = Integer.parseInt(codigoToma.substring(7, 9));
        yy += (yy <= currentYear) ? 2000 : 1900;

        return LocalDateTime.of(yy, mm, dd, 0, 0);
    }
    
    static String getLastNameOmnichannel(String lastName) {
        if (lastName == "" || lastName == null)
            return "NANAIS";
        
        int index = lastName.indexOf(" ");
        String result = (index <= 0) ? lastName : lastName.substring(0, index);
        
        return result;
    }
    
    static String formatDate(LocalDateTime dateTime) {
        if (dateTime == null) {
            return "N/A";
        }
        var dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd' 'HH:mm:ss");
        return dateTime.format(dateTimeFormatter);

    }
    
    static int getResultado(String status) {
        int sin_registro = 7;
        if (status == null || status.isBlank())
            return sin_registro;
        
        HashMap<String, Integer> estatus = new HashMap<>();
        estatus.put("PENDIENTE DE MUESTRA", 1);
        estatus.put("EN PROCESO", 2);
        estatus.put("INCOMPLETO", 3);
        estatus.put("COMPLETO", 4);
        estatus.put("CANCELADO", 5);
        estatus.put("COMPLETO POR VALIDAR", 6);
        
        if (estatus.containsKey(status))
            return estatus.get(status);
        
        return sin_registro;
    }
    
    static String getCode(String code) {
        var newCode = code.substring(0, 3);
        var number = Integer.parseInt(code.substring(3, 5)) + 1;
        var length = String.valueOf(number).length();
        return length == 2 ? newCode + number : newCode + "0" + number;

    }
    
    static void getIndications () {
        HashMap<String, String> indications = new HashMap<>();
        indications.put("ABS01", "Nada de abstinencia");
        indications.put("ALC24", "No tomar alcohol 24 hrs antes del estudio");
        indications.put("BIO01", "Tomar biotina");
        indications.put("SEX69", "Tener mucho sexo");
        
        String ind = "ABS01,ALC24,BIO01";
         List<String> codigos = List.of(ind.split(","));
        StringBuilder laLista = new StringBuilder();
        
        for (String code : codigos) {
            laLista.append(indications.get(code)).append(";");
        }
        
        System.out.println(laLista.toString());
        
    }
    
    
    static String getNewCode(String type) {
        List<String> lista = new ArrayList<>();
        lista.add("ABS");
        lista.add("ACE");
        lista.add("ALC");
        lista.add("ALI");
        lista.add("ANB");
        lista.add("ANT");
        lista.add("ASE");
        lista.add("AYS");
        lista.add("AYU");
        lista.add("BIP");
        lista.add("BIO");
        lista.add("CLA");
        lista.add("MDC");
        lista.add("COT");
        lista.add("COR");
        lista.add("CRE");
        lista.add("DIA");
        lista.add("DOS");
        lista.add("EJE");
        lista.add("ENF");
        lista.add("EST");
        lista.add("ESS");
        lista.add("EXP");
        lista.add("GEN");
        lista.add("HGO");
        lista.add("IDE");
        lista.add("INS");
        lista.add("INT");
        lista.add("KIT");
        lista.add("LAB");
        lista.add("MAM");
        lista.add("MEC");
        lista.add("MED");
        lista.add("MEN");
        lista.add("MUE");
        lista.add("NOA");
        lista.add("ORI");
        lista.add("OVU");
        lista.add("PER");
        lista.add("QR");
        lista.add("REF");
        lista.add("SUD");
        lista.add("ULT");
        lista.add("VAC");
        lista.add("VIT");
        lista.add("HEC");
        lista.add("MAR");
        lista.add("PRU");
        lista.add("OLO");
        lista.add("GJO");
        lista.add("HEC");
        
        String codigo;
        if (type.length() == 2 || type.length() == 3)
            codigo = type.toUpperCase();
        else 
            codigo = type.substring(0,3).toUpperCase();
        System.out.println(codigo);
        
        int end = type.length() - 1;
        int index = 2;
        boolean flag = true;
        System.out.println("-- " + index + "-" + end + "-" + flag + "-" + codigo);
        
        while (lista.contains(codigo) && flag) {
            index++;
            codigo = (codigo.substring(0, 2) + type.charAt(index)).toUpperCase();
            if (index == end)
                flag = false;
            System.out.println("-- " + index + "-" + end + "-" + flag + "-" + codigo);
        }

        return codigo;
    }
 
    
    static HashMap<Integer, String> getErrorMessage(String errorMessage) {
        HashMap<Integer, String> result = new HashMap<>();
        String message = "";
        String error = "";
    
        if (errorMessage.contains("Error -1 al timbrar")) {
            message = "Por favor revisa tu información fiscal en Mi Cuenta o comunícate con nosotros para poderte ayudar a generar tu factura correctamente.";
            error = "El mensaje que recibimos del PAC fue: " + errorMessage.substring(22, errorMessage.length() - 2);
        } else if (errorMessage.contains("comprobante con folio")) {
            message = "Por favor comunícate con nosotros para poderte ayudar a aclarar o solucionar este problema.";
            error = "El mensaje que recibimos del PAC fue: " + errorMessage;
        } else {
            message = "Por favor comunícate con nosotros para poderte ayudar a generar tu factura correctamente.";
        }
        result.put(0, message);
        result.put(1, error);
            
        return result;
    }
    
    static String getNextCode(String total) {
        int newTotal = Integer.parseInt(total) + 1;
        total = String.valueOf(newTotal);
        StringBuilder sb = new StringBuilder();
        sb.append("0".repeat(6-total.length()));
        sb.append(total);

        return sb.toString();
    }
    
    static void ayuno (List<String> ayunos) {
        String AYU_00 = "AYU00";
        String AYU_01 = "AYU01";
        List<String> listaC = new ArrayList();
        for (int index = 0; index < ayunos.size(); index++) {
            if (AYU_00.equals(ayunos.get(index)) || AYU_01.equals(ayunos.get(index)) || index == ayunos.size() - 1)
                listaC.add(ayunos.get(index));
        }
        System.out.println("listaC: " + listaC.toString());
    }
    
    static String reverseWord (String name, String lastname) {
        int index = lastname.indexOf(name) - 1;
        
        return '-' + lastname.substring(0,index) + '-';
    }
    
    // function to generate a random string of length n
    static String getAlphaNumericString(int n, boolean withUppercase) {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "0123456789"
            + "abcdefghijklmnopqrstuvxyz";
 
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
 
        for (int i = 0; i < n; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int)(AlphaNumericString.length() * Math.random());
 
            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }
 
        if (withUppercase)
            return sb.toString().toUpperCase();
        
        return sb.toString();
    }
    
    static String getUUIDforSerial(int n) {
        // chose a Character random from this String
        String numericString = "0123456789";
 
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
 
        for (int i = 0; i < n; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int)(numericString.length() * Math.random());
 
            // add Character one by one in end of sb
            sb.append(numericString.charAt(index));
        }
        
        return sb.toString();
    }
    
    static boolean calculateAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        //calculates the amount of time between two dates and returns the years
        if ((dob != null) && (curDate != null)) {
            int diff = Period.between(dob, curDate).getYears();
            if (diff >= 18)
                return true;
        }
        return false;
    }
    
    static Date getDateFromLocalDateTime(LocalDateTime localDateTime ) {
        Instant instant = localDateTime.toInstant(ZoneOffset.ofHours(-6));
        long epochMillis = instant.toEpochMilli();
        
        return new Date(epochMillis);
    }
    
    static Date getNewDate() {
        String codigoToma = "003230222/002";        

        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yy");
        int currentYear = Integer.parseInt(formatter.format(currentDate));

        int yy = Integer.parseInt(codigoToma.substring(3, 5));
        int mm = Integer.parseInt(codigoToma.substring(5, 7));
        int dd = Integer.parseInt(codigoToma.substring(7, 9));
        yy += (yy <= currentYear) ? 2000 : 1900;
        
        System.out.println(dd + "-" + mm + "-" + yy);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, dd);
        calendar.set(Calendar.MONTH, mm - 1);
        calendar.set(Calendar.YEAR, yy);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        return calendar.getTime();
    }
    
    static boolean isAdultOrSenior(String fecha, int edad) {
        if (fecha == null || edad < 1)
            return false;

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
        LocalDate dob = LocalDate.parse(fecha, formatter);
        LocalDate curDate = LocalDate.now();

        return Period.between(dob, curDate).getYears() >= edad;
    }
    
    static String getPhoneCountryCode(String phone) {
        List<String> californiaCodes = List.of("209","213","310","323","408","415","424","442","510","530","559","562","619","626","650","657","661","669","707","714","747","760","805","818","831","858","909","916","925","949","951");
        if(null == phone || phone.length() != 10)
            return phone;

        if (californiaCodes.contains(phone.substring(0,3)))
            return "1" + phone;

        return "52" + phone;
    }
    
    static int solution(String setTime, String timeToSet) {
        String[] set = setTime.split(":");
        String[] to = timeToSet.split(":");
        
        // Revisar ticks para Hora
        int toH = Integer.parseInt(to[0]);
        int setH = Integer.parseInt(set[0]);
        int hh1 = Math.abs(toH - setH);
        int hh2 = Math.abs(24 - hh1);
        
        // Revisar ticks para Minutos
        int toM = Integer.parseInt(to[1]);
        int setM = Integer.parseInt(set[1]);
        int mm1;
        int mm2;
        if (toM > setM) {
            mm1 = toM - setM;
            mm2 = 60 - mm1;
        } else {
            mm1 = setM - toM;
            mm2 = 60 - mm1;
        }
        int total = (hh1 < hh2 ? hh1 : hh2) + (mm1 < mm2 ? mm1 : mm2);
        
        return total;
    }
    
    static String reverseList(String sentence) {
        List<String> lista = List.of(sentence.split(" "));
        StringBuilder sb = new StringBuilder();
    
        if (lista.size() > 1) {
            for(int i = lista.size()-1; i >= 0; i--) {
                sb.append(lista.get(i)).append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
        } else if (lista.size() == 1)
        sb.append(lista.get(0));
    
        return sb.toString();
    }
    
    
    static void calculateTimeinHours() {
        String str = "2023-12-28 11:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
        
        long timeElapsed = Duration.between(dateTime, LocalDateTime.now()).toHours();
        System.out.println("Time:  " + str);
        System.out.println("Now:   " + LocalDateTime.now());
        System.out.println("Hours: " + timeElapsed);
    }
    
    static String formatDateInLocal(Date date, String language) {
        if (date == null) {
            return "N/A";
        }

        final String DATE_FORMAT_EN_MMM_D_YYYY = "MMM/d/yyyy";
        final String DATE_FORMAT_ES_D_MMM_YYYY = "d/MMM/yyyy";
        DateFormat formatter = null;
        if ("en".equals(language)) {
            formatter = new SimpleDateFormat(DATE_FORMAT_EN_MMM_D_YYYY);
        } else if ("es".equals(language)) {
            formatter = new SimpleDateFormat(DATE_FORMAT_ES_D_MMM_YYYY);
        }
        String newDate = formatter != null ? formatter.format(date) : "N/A";
        return Pattern.compile("[a-zA-Z]+\\.?").matcher(newDate).replaceFirst(m -> {
            String s = m.group();
            return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        });
    }
    
}
