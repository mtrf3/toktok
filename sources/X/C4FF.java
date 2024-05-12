package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4FF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FF implements C4FT {
    public static final C4FF LJLIL;
    public static final java.util.Map<String, String> LJLILLLLZI;
    public static final java.util.Map<String, String> LJLJI;
    public static C105734Cz LJLJJI;
    public static final C64962gm LJLJJL;
    public static XKQ LJLJJLL;
    public static final List<C4FT> LJLJL;

    static {
        C4FF c4ff = new C4FF();
        LJLIL = c4ff;
        LJLILLLLZI = new ConcurrentHashMap();
        LJLJI = new ConcurrentHashMap();
        LJLJJI = new C105734Cz(null, null);
        LJLJJL = C48841JEv.LIZ(C78613UtF.LIZJ);
        LJLJL = new ArrayList();
        C4FD.LJLJJI.add(c4ff);
    }

    public static void LJI() {
        ((ConcurrentHashMap) LJLILLLLZI).clear();
        ((ConcurrentHashMap) LJLJI).clear();
        if (LJLJJI.LIZIZ == null) {
            return;
        }
        Collection<List> values = new LinkedHashMap(LJLJJI.LIZIZ).values();
        o.LJIIIIZZ(values, "copy.values");
        int i = 0;
        for (List<Emoji> list : values) {
            o.LJIIIIZZ(list, "list");
            for (Emoji emoji : list) {
                String enDisplayName = C1GE.LIZLLL(emoji);
                if ((enDisplayName == null && (enDisplayName = emoji.getDisplayName()) == null) || enDisplayName.length() == 0) {
                    enDisplayName = emoji.getDisplayName();
                }
                o.LJIIIIZZ(enDisplayName, "enDisplayName");
                Locale locale = Locale.ROOT;
                String upperCase = enDisplayName.toUpperCase(locale);
                o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LJLILLLLZI;
                String str = (String) concurrentHashMap.get(upperCase);
                if (TextUtils.isEmpty(str)) {
                    concurrentHashMap.put(upperCase, String.valueOf(i));
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(',');
                    LIZ.append(i);
                    concurrentHashMap.put(upperCase, X1D.LIZIZ(LIZ));
                }
                String displayName = emoji.getDisplayName();
                o.LJIIIIZZ(displayName, "model.displayName");
                String upperCase2 = displayName.toUpperCase(locale);
                o.LJIIIIZZ(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) LJLJI;
                String str2 = (String) concurrentHashMap2.get(upperCase2);
                if (TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put(upperCase2, String.valueOf(i));
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str2);
                    LIZ2.append(',');
                    LIZ2.append(i);
                    concurrentHashMap2.put(upperCase2, X1D.LIZIZ(LIZ2));
                }
                i++;
            }
        }
    }

    public static List LJ(String str) {
        java.util.Map<String, String> map = LJLILLLLZI;
        if (((ConcurrentHashMap) map).isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        List LJFF = LJFF(str, LJLJI);
        if (LJFF == null) {
            return LJFF(str, map);
        }
        return LJFF;
    }

    @Override // X.C4FT
    public final void LIZJ(C105734Cz updateEmojiData) {
        o.LJIIIZ(updateEmojiData, "updateEmojiData");
        if (o.LJ(updateEmojiData, LJLJJI)) {
            return;
        }
        LJLJJI = updateEmojiData;
        XKX.LIZLLL(LJLJJL, null, null, new C4FL(null), 3);
    }

    public static void LIZ(boolean z, boolean z2) {
        if (C4LS.LIZ()) {
            return;
        }
        if (!o.LJ(C4FD.LJLILLLLZI, Boolean.FALSE) || z2) {
            C4FD.LJII(z);
        }
    }

    public static List LJFF(String str, java.util.Map map) {
        String str2;
        Collection<List<Emoji>> values;
        if (str != null) {
            str2 = str.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(str2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        } else {
            str2 = null;
        }
        String str3 = (String) ((ConcurrentHashMap) map).get(str2);
        if (str3 == null || TextUtils.isEmpty(str3)) {
            return null;
        }
        String[] strArr = (String[]) s.LJLJJL(str3, new String[]{","}, 0, 6).toArray(new String[0]);
        ArrayList arrayList = new ArrayList();
        for (String str4 : strArr) {
            int parseInt = CastIntegerProtector.parseInt(str4);
            LinkedHashMap<Resources, List<Emoji>> linkedHashMap = LJLJJI.LIZIZ;
            if (linkedHashMap != null && (values = linkedHashMap.values()) != null) {
                Iterator<List<Emoji>> it = values.iterator();
                int i = 0;
                while (true) {
                    if (it.hasNext()) {
                        List<Emoji> next = it.next();
                        if (next.size() + i > parseInt) {
                            Object obj = ListProtector.get(next, parseInt - i);
                            if (obj != null) {
                                arrayList.add(obj);
                            }
                        } else {
                            i += next.size();
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.C4FT
    public final void LIZIZ(Resources resource, List<? extends Emoji> list) {
        o.LJIIIZ(resource, "resource");
        if (list == null || list.isEmpty()) {
            Iterator it = ((ArrayList) LJLJL).iterator();
            while (it.hasNext()) {
                ((C4FT) it.next()).LIZIZ(resource, list);
            }
        } else {
            LinkedHashMap<Resources, List<Emoji>> linkedHashMap = LJLJJI.LIZIZ;
            if (linkedHashMap != null) {
                linkedHashMap.put(resource, list);
            }
            XKX.LIZLLL(LJLJJL, null, null, new C4FI(resource, list, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[PHI: r13
      0x0037: PHI (r13v11 java.lang.Object) = (r13v10 java.lang.Object), (r13v0 java.lang.Object) binds: [B:20:0x0112, B:13:0x0034] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.Yns, java.lang.Object, X.2sW] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bb -> B:23:0x00d3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r17, long r18, long r20, double r22, X.C4DY r24, X.C105744Da r25, X.InterfaceC67352kd r26) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4FF.LIZLLL(int, long, long, double, X.4DY, X.4Da, X.2kd):java.lang.Object");
    }
}
