package X;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes12.dex */
public final class PPH {
    public final String[] LIZ;

    public PPH() {
        String[] strArr = {"^", "~", "&", "|", "<<", ">>", "+", "-", "*", "/", "%", "++", "--", ".", ",", ":", ";", "(", ")", "{", "}", "[", "]", "?", "!", "<", ">", "<=", ">=", "==", "!=", "&&", "||", "=", "/**", "**/", "->"};
        this.LIZ = strArr;
        Arrays.sort(strArr, new Comparator<T>() { // from class: X.4tG
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String str = (String) obj;
                String str2 = (String) obj2;
                if (str.length() == str2.length()) {
                    return 0;
                }
                if (str.length() > str2.length()) {
                    return -1;
                }
                return 1;
            }
        });
        this.LIZ = strArr;
    }
}
