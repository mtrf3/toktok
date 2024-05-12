package X;

import com.bytedance.geckox.OptionCheckUpdateParams;

/* renamed from: X.OCq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61524OCq extends VJO {
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ java.util.Map LJLJLJ;
    public final /* synthetic */ OptionCheckUpdateParams LJLJLLL;
    public final /* synthetic */ C61520OCm LJLL;

    public final void LIZ() {
        OC6.LIZ("gecko-debug-tag", "start check update...", this.LJLJL);
        try {
            try {
            } catch (Exception e) {
                OC6.LJ("gecko-debug-tag", "Gecko update failed:", e);
            }
        } finally {
            this.LJLL.LJ(this.LJLJLLL, this.LJLJLJ);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61524OCq(C61520OCm c61520OCm, int i, String str, java.util.Map map, OptionCheckUpdateParams optionCheckUpdateParams) {
        super(i);
        this.LJLL = c61520OCm;
        this.LJLJL = str;
        this.LJLJLJ = map;
        this.LJLJLLL = optionCheckUpdateParams;
    }
}
