package com.ss.android.ugc.aweme.shoutouts;

import X.C163186ao;
import X.C163656bZ;
import X.C2U8;
import X.C42326GjK;
import X.C43212Gxc;
import X.C44272HZc;
import X.C65803Ps7;
import X.C6F4;
import X.GBO;
import X.GGS;
import X.GSU;
import X.H7R;
import X.HEP;
import X.InterfaceC80245VeT;
import X.QD3;
import X.U1F;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes3.dex */
public final class ShoutOutsPublishActivity extends GBO {
    public C163186ao LJLJI;
    public VideoPublishEditModel LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.GBO
    public final C43212Gxc LLFII() {
        GGS.LIZ.getClass();
        return GGS.LIZJ;
    }

    public final void LLIIIJ() {
        GSU gsu;
        VideoPublishEditModel videoPublishEditModel;
        if (this.LJLJJI == null) {
            return;
        }
        C163186ao c163186ao = this.LJLJI;
        if (c163186ao != null && (gsu = c163186ao.LJLLILLLL) != null && (videoPublishEditModel = c163186ao.LJLIL) != null) {
            videoPublishEditModel.mShoutOutsData.setDesc(String.valueOf(gsu.getText()));
            c163186ao.LJLIL.mShoutOutsData.setPrice(c163186ao.LLJJ().getPrice());
            c163186ao.LJLIL.mShoutOutsData.setBuyerMoneyDes(c163186ao.LLJJ().getBuyerMoneyDes());
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LJLJJI;
        o.LJI(videoPublishEditModel2);
        String desc = videoPublishEditModel2.mShoutOutsData.getDesc();
        VideoPublishEditModel videoPublishEditModel3 = this.LJLJJI;
        o.LJI(videoPublishEditModel3);
        ShoutoutPrice price = videoPublishEditModel3.mShoutOutsData.getPrice();
        VideoPublishEditModel videoPublishEditModel4 = this.LJLJJI;
        o.LJI(videoPublishEditModel4);
        C2U8.LIZ(new C6F4(desc, price, videoPublishEditModel4.mShoutOutsData.getBuyerMoneyDes()));
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        U1F.LIZJ(this, 1);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        LLIIIJ();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C42326GjK.LIZ.getClass();
        C42326GjK.LIZ(this);
        EventBus LIZJ = EventBus.LIZJ();
        if (LIZJ.LJI(this)) {
            LIZJ.LJIJ(this);
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onResume", true);
        super.onResume();
        EventBus LIZJ = EventBus.LIZJ();
        if (!LIZJ.LJI(this)) {
            LIZJ.LJIILJJIL(this);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onCreate", true);
        super.onCreate(bundle);
        U1F.LJFF(this, 1);
        setContentView(R.layout.f8);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        Intent intent = getIntent();
        c42326GjK.getClass();
        C42326GjK.LIZJ(this, intent, bundle);
        Intent intent2 = getIntent();
        if (intent2.getBooleanExtra("shout_out_from_dl", false)) {
            Serializable serializableExtra = intent2.getSerializableExtra("shout_out_data");
            o.LJII(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shoutouts.ShoutOutsData");
            LLIIIILZ(null, (ShoutOutsData) serializableExtra);
        } else {
            VideoPublishEditModel LJIIJ = H7R.LJIIJ(intent2);
            this.LJLJJI = LJIIJ;
            LLIIIILZ(LJIIJ, null);
        }
        EventBus LIZJ = EventBus.LIZJ();
        if (!LIZJ.LJI(this)) {
            LIZJ.LJIILJJIL(this);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onCreate", false);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEvent(C163656bZ event) {
        o.LJIIIZ(event, "event");
        C163186ao c163186ao = this.LJLJI;
        if (c163186ao != null) {
            ShoutoutPrice price = event.LJLIL;
            MoneyDes moneyDes = event.LJLILLLLZI;
            o.LJIIIZ(price, "price");
            if (c163186ao.LJLLILLLL == null || price.getMoneyDes() == null) {
                return;
            }
            c163186ao.LLJJ().setPrice(price);
            c163186ao.LLJJ().setBuyerMoneyDes(moneyDes);
            c163186ao.LLJJIJI();
            c163186ao.LLJILJILJ().setEnabled(true);
            VideoPublishEditModel videoPublishEditModel = c163186ao.LJLIL;
            if (videoPublishEditModel == null) {
                return;
            }
            videoPublishEditModel.mShoutOutsData = c163186ao.LLJJ();
        }
    }

    public final void LLIIIILZ(VideoPublishEditModel videoPublishEditModel, ShoutOutsData shoutOutsData) {
        this.LJLJI = new C163186ao(videoPublishEditModel, shoutOutsData);
        HEP LIZ = C44272HZc.LIZ(this, C163186ao.class);
        LIZ.LJI = false;
        LIZ.LJII = new InterfaceC80245VeT() { // from class: X.6bY
            @Override // X.InterfaceC80245VeT
            public final WM7 LIZ(ClassLoader classLoader, String className) {
                o.LJIIIZ(classLoader, "<anonymous parameter 0>");
                o.LJIIIZ(className, "className");
                if (o.LJ(C163186ao.class.getName(), className)) {
                    return ShoutOutsPublishActivity.this.LJLJI;
                }
                return null;
            }
        };
        LIZ.LIZLLL = false;
        LIZ.LJ = false;
        LIZ.LJFF = R.id.dm_;
        LIZ.LIZ();
    }
}
