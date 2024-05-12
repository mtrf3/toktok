package X;

/* loaded from: classes7.dex */
public final class EPN implements InterfaceC66022Pve {
    @Override // X.InterfaceC66022Pve
    public final String LIZ(Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        String[] strArr2 = new String[strArr.length];
        int i = 0;
        for (String str : strArr) {
            if (str != null) {
                strArr2[i] = str;
                i++;
            }
        }
        if (i == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder("╔═══════════════════════════════════════════════════════════════════════════════════════════════════\n");
        for (int i2 = 0; i2 < i; i2++) {
            String str2 = strArr2[i2];
            StringBuilder sb2 = new StringBuilder(str2.length() + 10);
            String[] split = str2.split("\n");
            int length = split.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (i3 != 0) {
                    sb2.append("\n");
                }
                String str3 = split[i3];
                sb2.append((char) 9553);
                sb2.append(str3);
            }
            sb.append(sb2.toString());
            if (i2 != i - 1) {
                sb.append("\n╟───────────────────────────────────────────────────────────────────────────────────────────────────\n");
            } else {
                sb.append("\n╚═══════════════════════════════════════════════════════════════════════════════════════════════════");
            }
        }
        return sb.toString();
    }
}
