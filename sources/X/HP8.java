package X;

import android.content.Context;
import android.content.res.Resources;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HP8 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ C43933HMb LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HP8(Context context, int i, int i2, int i3, C43933HMb c43933HMb) {
        super(0);
        this.LJLIL = context;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = c43933HMb;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str;
        Context context = this.LJLIL;
        if (context == null) {
            return;
        }
        switch (this.LJLILLLLZI) {
            case -11:
            case -1:
                if (this.LJLJI == -1) {
                    C5S1 c5s1 = new C5S1(this.LJLIL);
                    c5s1.LIZJ(R.string.th1);
                    c5s1.LJ();
                    return;
                }
                Resources resources = context.getResources();
                if (resources != null) {
                    str = resources.getString(R.string.th6, Integer.valueOf(this.LJLJI / 1000));
                    if (str != null) {
                        C5S1 c5s12 = new C5S1(this.LJLIL);
                        c5s12.LIZLLL(str);
                        c5s12.LJ();
                    }
                } else {
                    str = null;
                }
                C41865Gbt.LIZ(new HP9(this.LJLILLLLZI, this.LJLJJL, this.LJLJI, str));
                return;
            case -10:
                C5S1 c5s13 = new C5S1(this.LJLIL);
                c5s13.LIZJ(R.string.bqu);
                c5s13.LJ();
                return;
            case -9:
            default:
                C5S1 c5s14 = new C5S1(this.LJLIL);
                c5s14.LIZJ(R.string.th4);
                c5s14.LJ();
                return;
            case -8:
                C5S1 c5s15 = new C5S1(this.LJLIL);
                c5s15.LIZJ(R.string.tgq);
                c5s15.LJ();
                return;
            case -7:
                C5S1 c5s16 = new C5S1(this.LJLIL);
                c5s16.LIZJ(R.string.tgr);
                c5s16.LJ();
                return;
            case -6:
                if (this.LJLJJI == -1) {
                    C5S1 c5s17 = new C5S1(this.LJLIL);
                    c5s17.LIZJ(R.string.i_t);
                    c5s17.LJ();
                    return;
                }
                C5S1 c5s18 = new C5S1(this.LJLIL);
                String string = this.LJLIL.getString(R.string.emy);
                o.LJIIIIZZ(string, "context.getString(R.stri…m_video_max_length_toast)");
                String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.LJLJJI / 1000)}, 1));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                c5s18.LIZLLL(LLLZ);
                c5s18.LJ();
                return;
            case -5:
                C5S1 c5s19 = new C5S1(this.LJLIL);
                c5s19.LIZJ(R.string.tgs);
                c5s19.LJ();
                return;
            case -4:
                C5S1 c5s110 = new C5S1(this.LJLIL);
                c5s110.LIZJ(R.string.h46);
                c5s110.LJ();
                return;
            case -3:
                C5S1 c5s111 = new C5S1(this.LJLIL);
                c5s111.LIZJ(R.string.th3);
                c5s111.LJ();
                return;
            case -2:
                C5S1 c5s112 = new C5S1(this.LJLIL);
                c5s112.LIZJ(R.string.th2);
                c5s112.LJ();
                return;
        }
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}
