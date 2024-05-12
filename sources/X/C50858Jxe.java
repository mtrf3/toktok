package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;

/* renamed from: X.Jxe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50858Jxe {
    public long LIZ;

    public final void LIZ(DynamicPatch dynamicPatch) {
        String str;
        this.LIZ = System.currentTimeMillis();
        if (dynamicPatch == null || (str = dynamicPatch.schema) == null) {
            str = "";
        }
        C50856Jxc c50856Jxc = new C50856Jxc();
        c50856Jxc.LJIILL("type", "start_load");
        c50856Jxc.LJIIZILJ(2);
        c50856Jxc.LJIILL("schema", str);
        c50856Jxc.LJIILIIL();
    }
}
