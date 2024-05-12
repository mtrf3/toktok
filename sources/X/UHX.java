package X;

import Y.IDCListenerS209S0100000_13;
import Y.IDDListenerS152S0100000_13;
import Y.IDHandlerS13S0100000;
import Y.IDcS172S0100000_13;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class UHX implements InterfaceC77539Ubv {
    public static final /* synthetic */ int LJI = 0;
    public final Context LIZ;
    public final C77453UaX LIZIZ;
    public LiveDialog LIZJ;
    public boolean LIZLLL;
    public UHY LJ;
    public C13E LJFF;

    public abstract ExchangeDialogVM LIZJ();

    public abstract boolean LJI();

    public static boolean LJFF() {
        WalletStruct walletStruct = C32355Cmt.LIZ.LJLIL;
        if (walletStruct != null && walletStruct.isPeriodicPayout) {
            return true;
        }
        return false;
    }

    public final void LIZIZ() {
        int i;
        Context context = this.LIZ;
        if (context != null) {
            C47071t1 c47071t1 = new C47071t1(context);
            if (LIZLLL().LJI) {
                c47071t1.LJ(R.drawable.ct3);
            }
            c47071t1.LJIILJJIL = false;
            c47071t1.LIZJ = LIZLLL().LIZ;
            c47071t1.LJII(LIZLLL().LIZIZ);
            c47071t1.LJIILIIL = LIZLLL().LJIIIZ;
            c47071t1.LJIILLIIL = new DialogInterfaceOnShowListenerC76926UHa(this);
            c47071t1.LJJII = new UHZ(this);
            c47071t1.LJIIZILJ = new IDDListenerS152S0100000_13(this, 17);
            if (this.LIZLLL) {
                i = 2;
            } else {
                i = 1;
            }
            AnonymousClass175 anonymousClass175 = new AnonymousClass175();
            C39471gl c39471gl = new C39471gl();
            c39471gl.LIZ = C15380j0.LJIILJJIL(LIZLLL().LIZLLL);
            c39471gl.LIZJ = new IDcS172S0100000_13(this, 25);
            anonymousClass175.LIZ(new C39481gm(c39471gl));
            C39491gn c39491gn = new C39491gn();
            c39491gn.LIZ = C15380j0.LJIILJJIL(LIZLLL().LIZJ);
            c39491gn.LIZJ = new IDcS172S0100000_13(this, 26);
            anonymousClass175.LIZ(new C39501go(c39491gn));
            anonymousClass175.LIZIZ = i;
            c47071t1.LIZJ(new AnonymousClass176(anonymousClass175));
            boolean z = LIZLLL().LJFF;
            View view = LIZLLL().LJII;
            LinearLayout linearLayout = new LinearLayout(this.LIZ);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            if (view != null) {
                linearLayout.addView(view);
            }
            if (z) {
                View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cuh, C16880lQ.LLZIL(this.LIZ), null);
                CompoundButton compoundButton = (CompoundButton) LLLZIIL.findViewById(R.id.b_d);
                compoundButton.setText(LIZLLL().LJ);
                if (view == null) {
                    TextView textView = (TextView) LLLZIIL.findViewById(R.id.d0z);
                    textView.setText(LIZLLL().LIZIZ);
                    C87277YNd.LJJIJ(textView);
                }
                compoundButton.setOnCheckedChangeListener(new IDCListenerS209S0100000_13(this, 7));
                linearLayout.addView(LLLZIIL);
            }
            if (linearLayout.getChildCount() > 0) {
                c47071t1.LJI(linearLayout);
            }
            LiveDialog LIZ = c47071t1.LIZ();
            this.LIZJ = LIZ;
            if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-7145346771553156366")).LIZ) {
                return;
            }
            LIZ.show();
        }
    }

    public final UHY LIZLLL() {
        UHY uhy = this.LJ;
        if (uhy != null) {
            return uhy;
        }
        o.LJIJI("dialogParams");
        throw null;
    }

    @Override // X.InterfaceC77539Ubv
    public final void LJII() {
        C13E c13e;
        if (this.LJFF == null) {
            Context context = this.LIZ;
            if (context != null) {
                c13e = new C13E(context);
            } else {
                c13e = null;
            }
            this.LJFF = c13e;
        }
        C13E c13e2 = this.LJFF;
        if (c13e2 != null) {
            IDHandlerS13S0100000 iDHandlerS13S0100000 = c13e2.LIZIZ;
            Message obtain = Message.obtain();
            obtain.what = 10;
            iDHandlerS13S0100000.sendMessageDelayed(obtain, 500L);
        }
    }

    @Override // X.InterfaceC77539Ubv
    public final void LJIJ() {
        C13E c13e = this.LJFF;
        if (c13e != null) {
            c13e.LIZIZ.removeMessages(10);
            C29306Beo.LJJJJ(c13e.LIZ);
        }
    }

    public static String LJ(String source) {
        o.LJIIIZ(source, "source");
        int hashCode = source.hashCode();
        if (hashCode != -982480788) {
            if (hashCode != 1206987122) {
                if (hashCode == 1913428154 && source.equals("redpacket_new")) {
                    String LJIILJJIL = C15380j0.LJIILJJIL(R.string.l5w);
                    o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_expand_sendTreasure)");
                    return LJIILJJIL;
                }
            } else if (source.equals("star_comment")) {
                String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.o5f);
                o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_starcmt_name)");
                return LJIILJJIL2;
            }
        } else if (source.equals("portal")) {
            String LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.l5v);
            o.LJIIIIZZ(LJIILJJIL3, "getString(R.string.pm_expand_sendPortal)");
            return LJIILJJIL3;
        }
        String LJIILJJIL4 = C15380j0.LJIILJJIL(R.string.l5u);
        o.LJIIIIZZ(LJIILJJIL4, "getString(R.string.pm_expand_sendGift)");
        return LJIILJJIL4;
    }

    public UHX(Context context, C77453UaX liveExchangeParam) {
        o.LJIIIZ(liveExchangeParam, "liveExchangeParam");
        this.LIZ = context;
        this.LIZIZ = liveExchangeParam;
        this.LIZJ = null;
    }
}
