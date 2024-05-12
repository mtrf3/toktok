package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.hybrid.spark.schema.SparkSchemaModifier;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkCardSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;

/* renamed from: X.FoI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40086FoI extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C40086FoI LJLIL = new C40086FoI();

    public C40086FoI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C39890Fl8 c39890Fl8 = C39890Fl8.LJ;
        if (C39890Fl8.LIZ != null) {
            FCG fcg = FCH.LIZIZ;
            fcg.LIZLLL();
            fcg.LIZJ();
        }
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        c40342FsQ.getClass();
        if (C40343FsR.LJI != null) {
            c40342FsQ.LJIIIZ();
        }
        if (C39890Fl8.LIZJ != null) {
            c39890Fl8.LIZIZ();
        }
        C40342FsQ.LJFF();
        synchronized (c40342FsQ) {
            if (!C40343FsR.LJIIIZ.get()) {
                try {
                    Class.forName(SparkActivity.class.getName());
                    Class.forName(SparkPopup.class.getName());
                    Class.forName(SparkFragment.class.getName());
                    Class.forName(SparkPopup.class.getName());
                    Class.forName(DialogC60912NvQ.class.getName());
                    Class.forName(BottomSheetBehavior.class.getName());
                    Class.forName(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.class.getName());
                    Class.forName(SparkSchemaParam.class.getName());
                    Class.forName(SparkPopupSchemaParam.class.getName());
                    Class.forName(SparkCardSchemaParam.class.getName());
                    Class.forName(C109464Ri.class.getName());
                    Class.forName(SparkContext.class.getName());
                    Class.forName(C60809Ntl.class.getName());
                    Class.forName(C117144ik.class.getName());
                    Class.forName(SparkSchemaModifier.class.getName());
                    Class.forName(C60792NtU.class.getName());
                    Class.forName(C31999Ch9.class.getName());
                    Class.forName(VMM.class.getName());
                    Class.forName(HybridSchemaParam.class.getName());
                    Class.forName(C39891Fl9.class.getName());
                    Class.forName(C60671NrX.class.getName());
                    Class.forName(C38518F9u.class.getName());
                    Class.forName(C60728NsS.class.getName());
                    Class.forName(C60737Nsb.class.getName());
                    Class.forName(M2H.class.getName());
                    C3C5.m7constructorimpl(Class.forName(C39836FkG.class.getName()));
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
                C40343FsR.LJIIIZ.set(true);
            }
        }
        return C76800UCe.LIZ;
    }
}
