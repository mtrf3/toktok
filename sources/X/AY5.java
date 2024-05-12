package X;

import Y.ACListenerS30S0101000_13;
import Y.ARunnableS14S0101000_10;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class AY5 extends DialogC26391AXj {
    public static final /* synthetic */ int LJLJJI = 0;
    public final RecyclerView LJLIL;
    public final Handler LJLILLLLZI;
    public boolean LJLJI;

    public final void LJ() {
        if (IWF.LJJLIIIIJ().isPlaying()) {
            IWF.LJJLIIIIJ().LJIILJJIL();
            this.LJLJI = true;
        } else {
            this.LJLILLLLZI.postDelayed(new ARunnableS14S0101000_10(4, this, 0), 1000L);
        }
    }

    @Override // X.DialogC26391AXj
    public final void customerWidthAndHeight() {
        this.mWidth = (int) KL2.LIZJ(EF7.LIZIZ(), 280.0f);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        if (this.LJLJI) {
            IWF.LJJLIIIIJ().LIZIZ();
            this.LJLJI = false;
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            LJ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AY5(Context context, String[] strArr) {
        super(context, R.style.a5j, false, true);
        setContentView(R.layout.uw);
        this.LJLIL = (RecyclerView) findViewById(R.id.fu6);
        C16880lQ.LJIIJ(new ACListenerS30S0101000_13(1, this, 0), findViewById(R.id.b3r));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.AY6
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return i == 84;
            }
        });
        ArrayList arrayList = new ArrayList();
        java.util.Map<String, G36> localeMap = SettingServiceImpl.LIZ().getLocaleMap();
        HashMap hashMap = new HashMap();
        for (G36 g36 : localeMap.values()) {
            hashMap.put(g36.LIZ(), g36);
        }
        for (String str : strArr) {
            Object obj = hashMap.get(str);
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        this.LJLIL.setLayoutManager(new WrapLinearLayoutManager());
        this.LJLIL.LJII(new C116644hw(1, C17N.LJIILL(0.5d), ColorProtector.parseColor("#20161823")), -1);
        this.LJLIL.setAdapter(new C9YP(context, arrayList, this));
        this.LJLILLLLZI = new Handler();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_hot");
        FMX.LJIIL("show_language_popup", c188727au.LIZ);
    }
}
