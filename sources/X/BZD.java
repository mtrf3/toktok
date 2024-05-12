package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BZD extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ Context LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BZD(float f, int i, Context context, boolean z) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = f;
        this.LJLJJI = context;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str = "front";
        if (this.LJLIL) {
            int i = this.LJLILLLLZI;
            float f = this.LJLJI;
            if (!BZC.LIZ(i)) {
                InterfaceC30442Bx8.LLLLLLLLLL.LIZ(0L);
                InterfaceC30442Bx8.LLLLLLLZIL.LIZ(0L);
                BZC.LIZ.clear();
            } else {
                BZI LIZ = C28787BRn.LIZ("dirty_lens_detection_go_live");
                LIZ.LJIIZILJ();
                if (i != 1) {
                    str = "back";
                }
                LIZ.LJIJJ(str, "camera_type");
                LIZ.LJIL("score", Float.valueOf(f));
                LIZ.LJJIIJZLJL();
                InterfaceC30442Bx8.LLLLLLLLLL.LIZ(0L);
                InterfaceC30442Bx8.LLLLLLLZIL.LIZ(0L);
                BZC.LIZ.clear();
            }
        } else {
            int i2 = this.LJLILLLLZI;
            float f2 = this.LJLJI;
            if (!BZC.LIZ(i2)) {
                BZI LIZ2 = C28787BRn.LIZ("dirty_lens_detection");
                LIZ2.LJIIZILJ();
                if (i2 != 1) {
                    str = "back";
                }
                LIZ2.LJIJJ(str, "camera_type");
                LIZ2.LJIL("score", Float.valueOf(f2));
                LIZ2.LJJIIJZLJL();
            }
            Context context = this.LJLJJI;
            int i3 = this.LJLILLLLZI;
            float f3 = this.LJLJI;
            o.LJIIIZ(context, "context");
            C15610jN.LIZ().post(new BZE(f3, i3, context));
        }
        return C76800UCe.LIZ;
    }
}
