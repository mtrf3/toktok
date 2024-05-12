package X;

import Y.ARunnableS15S0101000_11;
import android.view.View;
import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.6om, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractViewOnClickListenerC171846om implements View.OnClickListener {
    public static final /* synthetic */ int LJLJJI = 0;
    public final long LJLIL = 500;
    public boolean LJLILLLLZI = true;
    public final ARunnableS15S0101000_11 LJLJI = new ARunnableS15S0101000_11(8, this, 9);

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        EnumC135185Sg LJJIL;
        o.LJIIIZ(v, "v");
        if (this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
            v.postDelayed(this.LJLJI, this.LJLIL);
            NewCutPlayerActivity newCutPlayerActivity = ((C171926ou) this).LJLJJL;
            if (newCutPlayerActivity.LJLJLLL == 0) {
                InterfaceC132665Io interfaceC132665Io = newCutPlayerActivity.LJLJJLL;
                if (interfaceC132665Io == null) {
                    LJJIL = null;
                } else {
                    LJJIL = interfaceC132665Io.LJJIL();
                }
                if (LJJIL == EnumC135185Sg.ANY) {
                    return;
                }
                XKX.LIZLLL(newCutPlayerActivity, EXS.LIZ, null, new C171836ol(newCutPlayerActivity, null), 2);
            }
        }
    }
}
