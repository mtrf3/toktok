package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* renamed from: X.AUy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class ViewOnClickListenerC26328AUy implements View.OnClickListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;
    public final /* synthetic */ KeyEvent.Callback LJLJJL;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.LJLIL) {
            case 0:
                C86904Y8u c86904Y8u = (C86904Y8u) this.LJLJI;
                InterfaceC86908Y8y interfaceC86908Y8y = (InterfaceC86908Y8y) this.LJLJJI;
                ViewPager viewPager = (ViewPager) this.LJLJJL;
                int i = this.LJLILLLLZI;
                if (!c86904Y8u.LJLJL) {
                    return;
                }
                if (interfaceC86908Y8y != null) {
                    interfaceC86908Y8y.LIZJ(14);
                }
                viewPager.setCurrentItem(i);
                return;
            default:
                C86184Xs4 c86184Xs4 = (C86184Xs4) this.LJLJI;
                HashMap<String, String> hashMap = (HashMap) this.LJLJJI;
                Context context = (Context) this.LJLJJL;
                int i2 = this.LJLILLLLZI;
                c86184Xs4.LJIIL.LJFF(EnumC26325AUv.TAKE_PHOTO, hashMap);
                if (c86184Xs4.LJI()) {
                    return;
                }
                if (context != null && MSAdaptionService.LJIIL().LJI(context)) {
                    C16880lQ.LLZILL(Toast.makeText(context, context.getString(R.string.f1i), 0));
                    return;
                } else {
                    c86184Xs4.LJIIL(i2);
                    return;
                }
        }
    }

    public /* synthetic */ ViewOnClickListenerC26328AUy(Object obj, Object obj2, KeyEvent.Callback callback, int i, int i2) {
        this.LJLIL = i2;
        this.LJLJI = obj;
        this.LJLJJI = obj2;
        this.LJLJJL = callback;
        this.LJLILLLLZI = i;
    }
}
