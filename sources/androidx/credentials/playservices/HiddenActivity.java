package androidx.credentials.playservices;

import X.C16880lQ;
import X.C35461aI;
import X.C35491aL;
import X.C35531aP;
import X.C35581aU;
import X.C65803Ps7;
import X.C67641Qgf;
import X.C67646Qgk;
import X.C67675QhD;
import X.C67797QjB;
import X.C67798QjC;
import X.C67800QjE;
import X.C67811QjP;
import X.C67813QjR;
import X.C67887Qkd;
import X.C67996QmO;
import X.C68515Qul;
import X.ETK;
import X.ExecutorC46398IIw;
import X.InterfaceC67677QhF;
import X.InterfaceC67679QhH;
import X.InterfaceC67935QlP;
import X.InterfaceC88472Yns;
import X.X1D;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IDqS13S0101000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class HiddenActivity extends Activity {
    public static final Companion Companion = new Companion();
    public static final String TAG = HiddenActivity.class.getName();
    public boolean mWaitingForActivityResult;
    public ResultReceiver resultReceiver;

    public void androidx_credentials_playservices_HiddenActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        androidx_credentials_playservices_HiddenActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    private final void handleBeginSignIn() {
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (beginSignInRequest != null) {
            C67646Qgk LJ = new C67798QjC((Activity) this, new C67675QhD()).LJ(beginSignInRequest);
            final IDqS13S0101000 iDqS13S0101000 = new IDqS13S0101000(this, intExtra, 0);
            InterfaceC67677QhF interfaceC67677QhF = new InterfaceC67677QhF() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda3
                @Override // X.InterfaceC67677QhF
                public final void onSuccess(Object obj) {
                    HiddenActivity.handleBeginSignIn$lambda$6$lambda$4(InterfaceC88472Yns.this, obj);
                }
            };
            LJ.getClass();
            ExecutorC46398IIw executorC46398IIw = C67641Qgf.LIZ;
            LJ.LJFF(executorC46398IIw, interfaceC67677QhF);
            LJ.LIZLLL(executorC46398IIw, new InterfaceC67679QhH() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda4
                @Override // X.InterfaceC67679QhH
                public final void onFailure(Exception exc) {
                    HiddenActivity.handleBeginSignIn$lambda$6$lambda$5(HiddenActivity.this, exc);
                }
            });
            return;
        }
        finish();
    }

    private final void handleCreatePassword() {
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (savePasswordRequest != null) {
            C67797QjB c67797QjB = new C67797QjB(this, new C67813QjR());
            C68515Qul LJJJJL = SavePasswordRequest.LJJJJL(savePasswordRequest);
            LJJJJL.LIZIZ = c67797QjB.LJIIJ;
            SavePasswordRequest savePasswordRequest2 = new SavePasswordRequest(LJJJJL.LIZ, LJJJJL.LIZIZ, LJJJJL.LIZJ);
            C67887Qkd c67887Qkd = new C67887Qkd();
            c67887Qkd.LIZJ = new Feature[]{C67811QjP.LIZJ};
            c67887Qkd.LIZ = new C67996QmO(c67797QjB, savePasswordRequest2);
            c67887Qkd.LIZIZ = false;
            c67887Qkd.LIZLLL = 1536;
            C67646Qgk LIZLLL = c67797QjB.LIZLLL(0, c67887Qkd.LIZ());
            final IDqS13S0101000 iDqS13S0101000 = new IDqS13S0101000(this, intExtra, 1);
            InterfaceC67677QhF interfaceC67677QhF = new InterfaceC67677QhF() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda5
                @Override // X.InterfaceC67677QhF
                public final void onSuccess(Object obj) {
                    HiddenActivity.handleCreatePassword$lambda$10$lambda$8(InterfaceC88472Yns.this, obj);
                }
            };
            LIZLLL.getClass();
            ExecutorC46398IIw executorC46398IIw = C67641Qgf.LIZ;
            LIZLLL.LJFF(executorC46398IIw, interfaceC67677QhF);
            LIZLLL.LIZLLL(executorC46398IIw, new InterfaceC67679QhH() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda6
                @Override // X.InterfaceC67679QhH
                public final void onFailure(Exception exc) {
                    HiddenActivity.handleCreatePassword$lambda$10$lambda$9(HiddenActivity.this, exc);
                }
            });
            return;
        }
        finish();
    }

    private final void handleCreatePublicKeyCredential() {
        final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (publicKeyCredentialCreationOptions != null) {
            final C67800QjE c67800QjE = new C67800QjE(this);
            C67887Qkd c67887Qkd = new C67887Qkd();
            c67887Qkd.LIZ = new InterfaceC67935QlP(c67800QjE, publicKeyCredentialCreationOptions) { // from class: X.Qm5
                public final /* synthetic */ PublicKeyCredentialCreationOptions LJLIL;

                {
                    this.LJLIL = publicKeyCredentialCreationOptions;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC67935QlP
                public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
                    PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions2 = this.LJLIL;
                    BinderC68010Qmc binderC68010Qmc = new BinderC68010Qmc((C67649Qgn) obj);
                    C67976Qm4 c67976Qm4 = (C67976Qm4) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(c67976Qm4.LJLILLLLZI);
                    obtain.writeStrongBinder(binderC68010Qmc);
                    if (publicKeyCredentialCreationOptions2 == null) {
                        obtain.writeInt(0);
                    } else {
                        obtain.writeInt(1);
                        publicKeyCredentialCreationOptions2.writeToParcel(obtain, 0);
                    }
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        c67976Qm4.LJLIL.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                    } finally {
                        obtain.recycle();
                        obtain2.recycle();
                    }
                }
            };
            c67887Qkd.LIZLLL = 5407;
            C67646Qgk LIZLLL = c67800QjE.LIZLLL(0, c67887Qkd.LIZ());
            final IDqS13S0101000 iDqS13S0101000 = new IDqS13S0101000(this, intExtra, 2);
            InterfaceC67677QhF interfaceC67677QhF = new InterfaceC67677QhF() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda1
                @Override // X.InterfaceC67677QhF
                public final void onSuccess(Object obj) {
                    HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$0(InterfaceC88472Yns.this, obj);
                }
            };
            LIZLLL.getClass();
            ExecutorC46398IIw executorC46398IIw = C67641Qgf.LIZ;
            LIZLLL.LJFF(executorC46398IIw, interfaceC67677QhF);
            LIZLLL.LIZLLL(executorC46398IIw, new InterfaceC67679QhH() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda2
                @Override // X.InterfaceC67679QhH
                public final void onFailure(Exception exc) {
                    HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity.this, exc);
                }
            });
            return;
        }
        finish();
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public static void androidx_credentials_playservices_HiddenActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(HiddenActivity hiddenActivity) {
        hiddenActivity.androidx_credentials_playservices_HiddenActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                hiddenActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void androidx_credentials_playservices_HiddenActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(HiddenActivity hiddenActivity) {
        androidx_credentials_playservices_HiddenActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(hiddenActivity);
        try {
            hiddenActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    private final void restoreState(Bundle bundle) {
        if (bundle != null) {
            this.mWaitingForActivityResult = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(bundle);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (LLJJIJIIJIL != null) {
            int hashCode = LLJJIJIIJIL.hashCode();
            if (hashCode != -441061071) {
                if (hashCode != 15545322) {
                    if (hashCode == 1246634622 && LLJJIJIIJIL.equals("CREATE_PASSWORD")) {
                        handleCreatePassword();
                        return;
                    }
                } else if (LLJJIJIIJIL.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                    handleCreatePublicKeyCredential();
                    return;
                }
            } else if (LLJJIJIIJIL.equals("BEGIN_SIGN_IN")) {
                handleBeginSignIn();
                return;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.mWaitingForActivityResult);
        super.onSaveInstanceState(outState);
    }

    public static final void handleBeginSignIn$lambda$6$lambda$4(InterfaceC88472Yns tmp0, Object obj) {
        o.LJIIIZ(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void handleBeginSignIn$lambda$6$lambda$5(HiddenActivity this$0, Exception e) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(e, "e");
        String name = C35581aU.class.getName();
        if ((e instanceof ETK) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((ETK) e).getStatusCode()))) {
            name = C35531aP.class.getName();
        }
        ResultReceiver resultReceiver = this$0.resultReceiver;
        o.LJI(resultReceiver);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("During begin sign in, failure response from one tap: ");
        LIZ.append(e.getMessage());
        this$0.setupFailure(resultReceiver, name, X1D.LIZIZ(LIZ));
    }

    public static final void handleCreatePassword$lambda$10$lambda$8(InterfaceC88472Yns tmp0, Object obj) {
        o.LJIIIZ(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void handleCreatePassword$lambda$10$lambda$9(HiddenActivity this$0, Exception e) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(e, "e");
        String name = C35491aL.class.getName();
        if ((e instanceof ETK) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((ETK) e).getStatusCode()))) {
            name = C35461aI.class.getName();
        }
        ResultReceiver resultReceiver = this$0.resultReceiver;
        o.LJI(resultReceiver);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("During save password, found password failure response from one tap ");
        LIZ.append(e.getMessage());
        this$0.setupFailure(resultReceiver, name, X1D.LIZIZ(LIZ));
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$0(InterfaceC88472Yns tmp0, Object obj) {
        o.LJIIIZ(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity this$0, Exception e) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(e, "e");
        String name = C35491aL.class.getName();
        if ((e instanceof ETK) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((ETK) e).getStatusCode()))) {
            name = C35461aI.class.getName();
        }
        ResultReceiver resultReceiver = this$0.resultReceiver;
        o.LJI(resultReceiver);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("During create public key credential, fido registration failure: ");
        LIZ.append(e.getMessage());
        this$0.setupFailure(resultReceiver, name, X1D.LIZIZ(LIZ));
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(i2, bundle);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    public final void setupFailure(ResultReceiver resultReceiver, String str, String str2) {
        Bundle m = HiddenActivity$$ExternalSyntheticOutline0.m("FAILURE_RESPONSE", true, "EXCEPTION_TYPE", str);
        m.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Integer.MAX_VALUE, m);
        finish();
    }
}
