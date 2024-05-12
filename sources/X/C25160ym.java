package X;

import com.bytedance.ies.ugc.ttkvstorageimpl.settings.TTKVStorageSettings;

/* renamed from: X.0ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25160ym {
    public final EnumC10900bm LIZ = EnumC10900bm.KEVA;
    public final EnumC09550Zb LIZIZ = EnumC09550Zb.SINGLE_PROCESS;
    public final C1VA LIZJ;

    public C25160ym(String str, C09170Xp c09170Xp, String str2) {
        C1VA c1va;
        if (C19460pa.LIZIZ == null) {
            C19460pa.LIZIZ = TTKVStorageSettings.LIZ().getSettings();
        }
        C52962KqU c52962KqU = C19460pa.LIZIZ;
        if (c52962KqU != null && c52962KqU.LJLILLLLZI) {
            c1va = C1VA.LIZ;
        } else {
            c1va = null;
        }
        this.LIZJ = c1va;
    }
}
