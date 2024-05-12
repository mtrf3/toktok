package com.bytedance.android.live.kyc;

import X.AbstractC73638SvC;
import X.C03880Dg;
import X.C0PT;
import X.C0PX;
import X.C0U3;
import X.C15490jB;
import X.C16880lQ;
import X.C1HN;
import X.C29701Eo;
import X.C29S;
import X.C31482CXe;
import X.C39202Fa2;
import X.C47121t6;
import X.C65300Pk0;
import X.C65803Ps7;
import X.C73969T1h;
import X.C77678UeA;
import X.C87277YNd;
import X.DialogC06950Pb;
import X.InterfaceC64592gB;
import X.InterfaceC66992k3;
import X.InterfaceC77724Ueu;
import X.T16;
import Y.IDAListenerS69S0100000;
import Y.IDCListenerS135S0100000;
import Y.IDfS124S0200000;
import Y.IDfS292S0100000;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.kyc.KYCCameraActivity;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import q03.IDaS480S0100000;

/* loaded from: classes.dex */
public final class KYCCameraActivity extends C29S {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public C0PX LJLIL;
    public C29701Eo LJLILLLLZI;
    public TextView LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public JSONObject LJLJJLL;
    public boolean LJLJL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public boolean LJLJLJ = true;
    public final List<byte[]> LJLJLLL = new ArrayList();
    public C1HN LJLL = new C0PT() { // from class: X.1HN
        @Override // X.C0PT
        public final void LIZ(byte[] photoByteArray) {
            o.LJIIIZ(photoByteArray, "photoByteArray");
            ((ArrayList) KYCCameraActivity.this.LJLJLLL).add(photoByteArray);
            KYCCameraActivity kYCCameraActivity = KYCCameraActivity.this;
            if (kYCCameraActivity.LJLJL) {
                if (((ArrayList) kYCCameraActivity.LJLJLLL).size() == 1) {
                    KYCCameraActivity kYCCameraActivity2 = KYCCameraActivity.this;
                    C29701Eo c29701Eo = kYCCameraActivity2.LJLILLLLZI;
                    if (c29701Eo != null) {
                        c29701Eo.playAnimation();
                    }
                    TextView textView = kYCCameraActivity2.LJLJI;
                    if (textView != null) {
                        textView.setText(kYCCameraActivity2.getString(R.string.m5h));
                    }
                    kYCCameraActivity2.LJLJLJ = false;
                    C0PX c0px = kYCCameraActivity2.LJLIL;
                    if (c0px != null) {
                        c0px.LJFF = false;
                    }
                    C0U3.LIZJ(kYCCameraActivity2.LLFII(), kYCCameraActivity2.getPageName(), kYCCameraActivity2.LJLJJLL);
                    return;
                }
                KYCCameraActivity kYCCameraActivity3 = KYCCameraActivity.this;
                kYCCameraActivity3.LLFZ(kYCCameraActivity3.LJLJLLL, true);
                return;
            }
            kYCCameraActivity.LLFZ(kYCCameraActivity.LJLJLLL, true);
        }
    };

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    public final String LLFII() {
        if (this.LJLJJL == 3) {
            return "double_side";
        }
        return "single_side";
    }

    public final String getPageName() {
        if (this.LJLJLJ) {
            return "profile_image_side";
        }
        return "back_image_side";
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        C0U3.LIZ(LLFII(), getPageName(), this.LJLJJLL);
        C0U3.LIZIZ(LLFII(), getPageName(), "cancel", this.LJLJJLL);
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C0PX c0px = this.LJLIL;
        if (c0px != null) {
            c0px.LIZ();
        }
        this.LJLL = null;
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        C0PX c0px = this.LJLIL;
        if (c0px != null) {
            if (HandlerThreadOptSetting.INSTANCE.enable()) {
                c0px.LJIIZILJ = null;
                return;
            }
            HandlerThread handlerThread = c0px.LJIJ;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            try {
                HandlerThread handlerThread2 = c0px.LJIJ;
                if (handlerThread2 != null) {
                    handlerThread2.join();
                }
                c0px.LJIJ = null;
                c0px.LJIIZILJ = null;
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
        C0PX c0px = this.LJLIL;
        if (c0px != null) {
            if (HandlerThreadOptSetting.INSTANCE.enable()) {
                c0px.LJIIZILJ = new Handler(C39202Fa2.LIZ.LIZIZ());
                return;
            }
            HandlerThread handlerThread = new HandlerThread("Camera Background");
            c0px.LJIJ = handlerThread;
            handlerThread.start();
            HandlerThread handlerThread2 = c0px.LJIJ;
            if (handlerThread2 == null) {
                return;
            }
            c0px.LJIIZILJ = new Handler(handlerThread2.getLooper());
        }
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.cu6);
        boolean z3 = false;
        this.LJLJJI = getIntent().getIntExtra("key_kyc_photo_type", 0);
        this.LJLJJL = getIntent().getIntExtra("key_kyc_photo_side", 0);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "key_kyc_track_events");
        if (LLJJIJIIJIL != null && LLJJIJIIJIL.length() > 0) {
            try {
                this.LJLJJLL = new JSONObject(LLJJIJIIJIL);
            } catch (Exception unused) {
            }
        }
        int i = this.LJLJJL;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJL = z;
        if (i != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLJLJ = z2;
        TextView textView = (TextView) findViewById(R.id.lq7);
        this.LJLJI = textView;
        if (this.LJLJJI == 0 || this.LJLJJL == 0) {
            if (textView != null) {
                C87277YNd.LJJIIZ(textView);
            }
        } else {
            if (textView != null) {
                C87277YNd.LJJIJ(textView);
            }
            if (this.LJLJJL == 2) {
                TextView textView2 = this.LJLJI;
                if (textView2 != null) {
                    textView2.setText(getString(R.string.m5h));
                }
            } else {
                TextView textView3 = this.LJLJI;
                if (textView3 != null) {
                    textView3.setText(getString(R.string.m5m));
                }
            }
        }
        getWindow().setStatusBarColor(-16777216);
        getWindow().setNavigationBarColor(-16777216);
        C16880lQ.LJIILLIIL((ImageView) _$_findCachedViewById(R.id.lq9), new IDaS480S0100000(this, 1));
        C16880lQ.LJIILLIIL((ImageView) _$_findCachedViewById(R.id.lq2), new IDCListenerS135S0100000(this, 61));
        C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.lq0), new IDCListenerS135S0100000(this, 62));
        if (this.LJLJL) {
            C29701Eo c29701Eo = (C29701Eo) findViewById(R.id.lq1);
            this.LJLILLLLZI = c29701Eo;
            if (c29701Eo != null) {
                c29701Eo.addAnimatorListener(new IDAListenerS69S0100000(this, 7));
            }
            C15490jB.LJIIL(this.LJLILLLLZI, "tiktok_live_wallet_resource", "kyc_4_card_flip_lottie.zip", "images", false, null, null, 96);
        }
        DialogC06950Pb dialogC06950Pb = new DialogC06950Pb(this, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/kyc/KYCGuidanceDialog", "show", dialogC06950Pb, new Object[0], "void", new C65300Pk0(false, "()V", "-4722183021946276898")).LIZ) {
            dialogC06950Pb.show();
        }
        C0U3.LJ(LLFII(), "photo_guidance", this.LJLJJLL);
        C31482CXe camera_preview = (C31482CXe) _$_findCachedViewById(R.id.b3f);
        o.LJIIIIZZ(camera_preview, "camera_preview");
        C0PX c0px = new C0PX(this, camera_preview, this.LJLL, this.LJLJL, this.LJLJJLL);
        if (this.LJLJJL != 2) {
            z3 = true;
        }
        c0px.LJFF = z3;
        this.LJLIL = c0px;
        C0U3.LIZJ(LLFII(), getPageName(), this.LJLJJLL);
    }

    public final void LLFZ(final List list, boolean z) {
        if (!z) {
            LLII(new ArrayList(), false);
        } else {
            AbstractC73638SvC.LJI(new InterfaceC66992k3() { // from class: X.1Iw
                /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
                
                    if (r2 != null) goto L16;
                 */
                @Override // X.InterfaceC66992k3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void subscribe(X.InterfaceC65052gv<java.util.List<X.OSZ<java.lang.String, java.lang.String>>> r19) {
                    /*
                        Method dump skipped, instructions count: 339
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C30821Iw.subscribe(X.2gv):void");
                }
            }).LJIJJ(C73969T1h.LIZIZ()).LJJIIJ(T16.LIZ()).LJJII(new IDfS292S0100000(this, 12), new IDfS292S0100000(this, 13));
        }
    }

    public final void LLII(List photoDatas, boolean z) {
        String str;
        o.LJIIIZ(photoDatas, "photoDatas");
        Iterator<InterfaceC77724Ueu> it = C77678UeA.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(photoDatas, z);
        }
        C77678UeA.LIZIZ.LJLIL.clear();
        String LLFII = LLFII();
        String pageName = getPageName();
        if (z) {
            str = "complete";
        } else {
            str = "cancel";
        }
        C0U3.LIZIZ(LLFII, pageName, str, this.LJLJJLL);
        finish();
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1001 || intent == null) {
            return;
        }
        final ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new ArrayList();
        }
        C0PX c0px = this.LJLIL;
        if (c0px != null) {
            c0px.LIZLLL();
        }
        AbstractC73638SvC.LJI(new InterfaceC66992k3(this) { // from class: X.1Ix
            public final /* synthetic */ KYCCameraActivity LJLILLLLZI;

            {
                this.LJLILLLLZI = this;
            }

            @Override // X.InterfaceC66992k3
            public final void subscribe(InterfaceC65052gv<List<byte[]>> interfaceC65052gv) {
                ArrayList arrayList = new ArrayList();
                List<android.net.Uri> list = parcelableArrayListExtra;
                KYCCameraActivity kYCCameraActivity = this.LJLILLLLZI;
                Iterator<android.net.Uri> it = list.iterator();
                while (it.hasNext()) {
                    byte[] LIZLLL = C31880CfE.LIZLLL(kYCCameraActivity, it.next());
                    if (LIZLLL != null) {
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(LIZLLL, 0, LIZLLL.length);
                        o.LJIIIIZZ(decodeByteArray, "decodeByteArray(\n       …                        )");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 15, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        o.LJIIIIZZ(byteArray, "baos.toByteArray()");
                        arrayList.add(byteArray);
                    }
                }
                ((C73578SuE) interfaceC65052gv).onSuccess(arrayList);
            }
        }).LJIJJ(C73969T1h.LIZIZ()).LJJIIJ(T16.LIZ()).LJJII(new IDfS124S0200000(parcelableArrayListExtra, this, 2), new InterfaceC64592gB() { // from class: X.1Iy
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }
}
