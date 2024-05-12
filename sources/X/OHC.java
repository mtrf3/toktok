package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.lynxcard.DynamicCardViewHolder;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OHC extends AbstractC60811Ntn {
    public final /* synthetic */ DynamicCardViewHolder.IMSparkContext LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ DynamicCardViewHolder LJLJJI;
    public final /* synthetic */ OHD LJLJJL;

    public final boolean LJJL() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI.boundSparkView;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            return o.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getTag(R.id.ll), Boolean.TRUE);
        }
        return false;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        int i;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        o.LJIIIZ(view, "view");
        String str = DynamicCardViewHolder.LLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadFinish view = ");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLILLLLZI.boundSparkView;
        int i2 = 0;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
            i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append(" uuid = ");
        LIZ.append(this.LJLJI);
        LIZ.append(" isReuse = ");
        LIZ.append(LJJL());
        C34B.LJI(str, X1D.LIZIZ(LIZ));
        if (this.LJLILLLLZI.LJJIL()) {
            return;
        }
        DynamicCardViewHolder.IMSparkContext iMSparkContext = this.LJLILLLLZI;
        if (iMSparkContext.startTimeStamp != -1 && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = iMSparkContext.boundSparkView) != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZLLL() && !LJJL()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            DynamicCardViewHolder.IMSparkContext iMSparkContext2 = this.LJLILLLLZI;
            long j = elapsedRealtime - iMSparkContext2.startTimeStamp;
            iMSparkContext2.LJJIZ(true, j, 0);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onLoadFinish view = ");
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = this.LJLILLLLZI.boundSparkView;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 != null) {
                i2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3.hashCode();
            }
            LIZ2.append(i2);
            LIZ2.append(" uuid = ");
            b0.LJ(LIZ2, this.LJLJI, " duration= ", j);
            C34B.LJI(str, X1D.LIZIZ(LIZ2));
        }
        this.LJLILLLLZI.startTimeStamp = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        int i;
        long j;
        VNS vns;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        String str = DynamicCardViewHolder.LLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadStart view = ");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI.boundSparkView;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append(" uuid = ");
        LIZ.append(this.LJLJI);
        LIZ.append(" isReuse = ");
        LIZ.append(LJJL());
        C34B.LIZIZ(str, X1D.LIZIZ(LIZ));
        if (this.LJLILLLLZI.LJJIL()) {
            return;
        }
        super.LJJJJJL(view, url);
        boolean z = view instanceof C60726NsQ;
        if (z) {
            VNS vns2 = (VNS) view;
            if (vns2 != null) {
                vns2.removeLynxViewClient(this.LJLJJL);
            }
            if (z && (vns = (VNS) view) != null) {
                vns.addLynxViewClient(this.LJLJJL);
            }
        }
        DynamicCardViewHolder.IMSparkContext iMSparkContext = this.LJLILLLLZI;
        if (!LJJL()) {
            j = SystemClock.elapsedRealtime();
        } else {
            j = -1;
        }
        iMSparkContext.startTimeStamp = j;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        int i;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        String str = DynamicCardViewHolder.LLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadFailed view = ");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI.boundSparkView;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append(" uuid = ");
        LIZ.append(this.LJLJI);
        LIZ.append(" isReuse = ");
        LIZ.append(LJJL());
        LIZ.append(" hybridKitError = ");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("errorCode = ");
        LIZ2.append(c60704Ns4.LIZ);
        LIZ2.append(", errorReason = ");
        LIZ2.append(c60704Ns4.LIZIZ);
        LIZ.append(X1D.LIZIZ(LIZ2));
        C34B.LIZJ(str, X1D.LIZIZ(LIZ));
        if (this.LJLILLLLZI.LJJIL()) {
            return;
        }
        LJJJJ(view, url);
        if (this.LJLILLLLZI.startTimeStamp != -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            DynamicCardViewHolder.IMSparkContext iMSparkContext = this.LJLILLLLZI;
            iMSparkContext.LJJIZ(false, elapsedRealtime - iMSparkContext.startTimeStamp, c60704Ns4.LIZ);
        }
        DynamicCardViewHolder.IMSparkContext iMSparkContext2 = this.LJLILLLLZI;
        iMSparkContext2.startTimeStamp = -1L;
        if (o.LJ(iMSparkContext2.boundSparkView, this.LJLJJI.LLIIIJ)) {
            this.LJLJJI.o0();
        }
    }

    public OHC(DynamicCardViewHolder.IMSparkContext iMSparkContext, String str, DynamicCardViewHolder dynamicCardViewHolder, OHD ohd) {
        this.LJLILLLLZI = iMSparkContext;
        this.LJLJI = str;
        this.LJLJJI = dynamicCardViewHolder;
        this.LJLJJL = ohd;
    }
}
