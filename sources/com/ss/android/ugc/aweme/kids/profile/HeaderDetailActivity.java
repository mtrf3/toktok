package com.ss.android.ugc.aweme.kids.profile;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C38354F3m;
import X.C38891fp;
import X.C39579Fg7;
import X.C62846OlW;
import X.C65803Ps7;
import X.C78765Uvh;
import X.C79238V7y;
import X.C81705W4v;
import X.C81810W8w;
import X.InterfaceC72332sf;
import X.InterfaceC78716Uuu;
import X.V92;
import X.VA9;
import X.W5I;
import X.W5O;
import X.W5P;
import X.W6J;
import Y.ACListenerS28S0100000_8;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class HeaderDetailActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLJJL = 0;
    public InterfaceC72332sf LJLIL;
    public float LJLILLLLZI;
    public String[] LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.d6);
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

    public final W5O LLFII(String str) {
        int i;
        int i2;
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        imageDecodeOptionsBuilder.LJ = false;
        C81810W8w c81810W8w = new C81810W8w(imageDecodeOptionsBuilder);
        W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
        LIZLLL.LJ = c81810W8w;
        Uri parse = UriProtector.parse(str);
        if (C39579Fg7.LIZIZ(parse.getPath())) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(parse.getPath(), options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            if (i3 > 720 || i4 > 1280) {
                int i5 = i3 >> 1;
                int i6 = i4 >> 1;
                i = 1;
                while (i5 / i > 720 && i6 / i > 1280) {
                    i <<= 1;
                }
            } else {
                i = 1;
            }
            int[] iArr = {i3 >> i, i4 >> i};
            int i7 = iArr[0];
            if (i7 > 0 && (i2 = iArr[1]) > 0) {
                LIZLLL.LIZJ = new C79238V7y(i7, i2);
            }
        }
        W5O LIZ = LIZLLL.LIZ();
        o.LJIIIIZZ(LIZ, "builder.build()");
        return LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        UrlModel userAvatar;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bgo);
        overridePendingTransition(R.anim.d5, R.anim.d6);
        getIntent().getParcelableExtra("extra_zoom_info");
        this.LJLJI = getIntent().getStringArrayExtra("uri");
        this.LJLILLLLZI = getIntent().getFloatExtra("wh_ratio", 1.0f);
        Serializable serializableExtra = getIntent().getSerializableExtra("user");
        o.LJII(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.api.account.model.IKidsUser");
        this.LJLIL = (InterfaceC72332sf) serializableExtra;
        ((FixedRatioFrameLayout) _$_findCachedViewById(R.id.dmz)).setWhRatio(this.LJLILLLLZI);
        ((V92) ((VA9) _$_findCachedViewById(R.id.my9)).getHierarchy()).LJIILJJIL(InterfaceC78716Uuu.LJJL);
        C62846OlW c62846OlW = (C62846OlW) _$_findCachedViewById(R.id.my9);
        String[] strArr = this.LJLJI;
        if (c62846OlW != null) {
            ArrayList arrayList = new ArrayList();
            if (strArr != null && strArr.length != 0) {
                o.LJI(strArr);
                for (String str2 : strArr) {
                    if (!C38354F3m.LJ(str2)) {
                        arrayList.add(LLFII(str2));
                    }
                }
            }
            InterfaceC72332sf interfaceC72332sf = this.LJLIL;
            REQUEST request = 0;
            if (interfaceC72332sf != null && (userAvatar = interfaceC72332sf.getUserAvatar()) != null) {
                List<String> urlList = userAvatar.getUrlList();
                o.LJIIIIZZ(urlList, "model.urlList");
                W6J LIZ = W5I.LIZ();
                Iterator<String> it = urlList.iterator();
                while (it.hasNext()) {
                    str = it.next();
                    if (LIZ.LJII(UriProtector.parse(str))) {
                        break;
                    }
                }
            }
            str = null;
            if (!TextUtils.isEmpty(str)) {
                request = LLFII(str);
            }
            if (C38891fp.LJJI(arrayList)) {
                C78765Uvh.LIZ(c62846OlW, R.drawable.b0p);
            } else {
                C81705W4v LIZJ = W5I.LIZJ();
                LIZJ.LJFF(true, arrayList.toArray(new W5O[0]));
                LIZJ.LJIIL = c62846OlW.getController();
                if (request != 0) {
                    LIZJ.LJ = request;
                }
                c62846OlW.setController(LIZJ.LIZ());
            }
        }
        _$_findCachedViewById(R.id.j83).setBackgroundColor(-16777216);
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.j83), new ACListenerS28S0100000_8(this, 15));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity", "onCreate", false);
    }
}
