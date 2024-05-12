package com.bytedance.android.livesdk.browser.fragment;

import X.ActivityC45651qj;
import X.B83;
import X.BF2;
import X.BNI;
import X.C0K2;
import X.C0NB;
import X.C0NE;
import X.C10A;
import X.C141335gf;
import X.C15450j7;
import X.C16880lQ;
import X.C1A7;
import X.C1E4;
import X.C28733BPl;
import X.C29306Beo;
import X.C29336BfI;
import X.C29337BfJ;
import X.C29338BfK;
import X.C29374Bfu;
import X.C29383Bg3;
import X.C29929Bor;
import X.C29930Bos;
import X.C29991Fr;
import X.C29S;
import X.C30786C6k;
import X.C30882CAc;
import X.C31241CNx;
import X.C31886CfK;
import X.C31947CgJ;
import X.C31949CgL;
import X.C32789Ctt;
import X.C38113ExZ;
import X.C38354F3m;
import X.C3C5;
import X.C40690Fy2;
import X.C45243HpH;
import X.C60408NnI;
import X.C73737Swn;
import X.C73793Sxh;
import X.C73806Sxu;
import X.C73933Szx;
import X.C76800UCe;
import X.C76884UFk;
import X.C76885UFl;
import X.C79621VMr;
import X.C90903hW;
import X.CN1;
import X.CNM;
import X.CO0;
import X.CO1;
import X.CO3;
import X.CO4;
import X.CO5;
import X.CO8;
import X.COC;
import X.COL;
import X.COM;
import X.InterfaceC29111Bbf;
import X.InterfaceC29343BfP;
import X.InterfaceC29856Bng;
import X.InterfaceC31235CNr;
import X.JF2;
import X.KL2;
import X.O5Z;
import X.OFH;
import Y.ACListenerS24S0101000_5;
import Y.AfS36S0101000_5;
import Y.IDbS382S0100000_5;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ChooseImageMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EncryptedUploadMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.UploadPhotoV2Method;
import com.bytedance.android.livesdk.livesetting.hybrid.AllowHtmlVideoSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.WebviewDestroyModeSetting;
import com.bytedance.android.livesdk.lynx.ui.AbsHybridFragment;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class TTLiveBrowserFragment extends AbsHybridFragment implements InterfaceC31235CNr, View.OnClickListener, WeakHandler.IHandler, InterfaceC29343BfP {
    public static final /* synthetic */ int LLJJIJI = 0;
    public String LJLJLLL;
    public FullWebDialogFragment LJLLI;
    public View LJLLJ;
    public View LJLLL;
    public TextView LJLLLL;
    public CO1 LJLLLLLL;
    public View LJLZ;
    public WebChromeClient.CustomViewCallback LJZ;
    public O5Z LJZI;
    public FrameLayout LJZL;
    public View LL;
    public ViewGroup LLD;
    public View LLF;
    public View LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public String LLII;
    public String LLIIII;
    public int LLIIIILZ;
    public C29336BfI LLIIIL;
    public C31241CNx LLIIIZ;
    public C31949CgL LLIIJI;
    public ChooseImageMethod LLIIJLIL;
    public UploadPhotoV2Method LLIIL;
    public EncryptedUploadMethod LLIILII;
    public C76884UFk LLIILZL;
    public C76885UFl LLIIZ;
    public boolean LLIL;
    public long LLILIL;
    public boolean LLILL;
    public WeakHandler LLILLIZIL;
    public JSONObject LLILLL;
    public C31886CfK LLILZ;
    public boolean LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public boolean LLJ;
    public CO0 LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public String LLJJ;
    public String LJLL = "";
    public boolean LJLLILLLL = true;
    public boolean LLI = true;
    public boolean LLIFFJFJJ = true;
    public int LLIIIJ = -1;
    public boolean LLILII = true;
    public boolean LLILLJJLI = true;
    public Map<String, Object> LLJJI = new HashMap();
    public final ACListenerS24S0101000_5 LLJJIII = new ACListenerS24S0101000_5(0, this, 17);

    public final void wl() {
        O5Z o5z = this.LJZI;
        if (o5z != null) {
            o5z.clearCache(false);
            JSONObject jSONObject = this.LLILLL;
            if (jSONObject != null && jSONObject.length() > 0) {
                HashMap hashMap = new HashMap();
                C31947CgJ.LIZ(hashMap, this.LLILLL);
                C31947CgJ.LJI(this.LJZI, this.LLIZ, hashMap);
                return;
            }
            C31947CgJ.LJFF(this.LJZI, this.LLIZ, this.LLILZLL);
        }
    }

    public TTLiveBrowserFragment() {
        this.LJLJJI = CNM.LIZIZ();
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.AbsHybridFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        CO0 co0 = this.LLJI;
        if (co0 != null && this.LLILIL == 0) {
            co0.LIZ(3, 0, "");
        }
        if (!TextUtils.isEmpty(this.LLJJ)) {
            C0K2.LJII(0, this.LLJJ, this.LLJJI);
            this.LLJJ = null;
            this.LLJJI = null;
        }
        ((CopyOnWriteArrayList) C30882CAc.LIZJ().LIZ).remove(this);
        if (COC.LIZIZ == null) {
            synchronized (COC.class) {
                if (COC.LIZIZ == null) {
                    COC.LIZIZ = new COC();
                }
            }
        }
        COC.LIZIZ.LIZ.remove(mo49getActivity().hashCode());
        C31886CfK c31886CfK = this.LLILZ;
        if (c31886CfK != null) {
            c31886CfK.release();
        }
        if (this.LJZI != null) {
            try {
                C30882CAc LIZJ = C30882CAc.LIZJ();
                O5Z o5z = this.LJZI;
                LIZJ.getClass();
                if (o5z.getParent() instanceof ViewGroup) {
                    C16880lQ.LJLLL(o5z, (ViewGroup) o5z.getParent());
                }
                CO4.LIZ(o5z, true);
                this.LJZI.destroy();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        WeakHandler weakHandler = this.LLILLIZIL;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        O5Z o5z = this.LJZI;
        if (o5z != null) {
            o5z.onPause();
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        C31949CgL c31949CgL = this.LLIIJI;
        O5Z o5z2 = this.LJZI;
        if (mo49getActivity2 != null) {
            if (o5z2 != null && c31949CgL != null) {
                int value = WebviewDestroyModeSetting.INSTANCE.getValue();
                if (value != 1 && value == 0) {
                    if ((r0 = CO4.LIZIZ) < 0) {
                    }
                }
                ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(mo49getActivity2);
                if (LIZIZ != null && LIZIZ.isFinishing()) {
                    try {
                        C79621VMr.LIZ(o5z2, "about:blank");
                        if (CO4.LIZJ > 0) {
                            View rootView = o5z2.getRootView();
                            if (rootView instanceof ViewGroup) {
                                View childAt = ((ViewGroup) rootView).getChildAt(0);
                                childAt.setDrawingCacheEnabled(true);
                                Bitmap createBitmap = Bitmap.createBitmap(childAt.getDrawingCache());
                                childAt.setDrawingCacheEnabled(false);
                                ImageView imageView = new ImageView(LIZIZ);
                                imageView.setImageBitmap(createBitmap);
                                imageView.setVisibility(0);
                                ((ViewGroup) rootView).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (C0NB.LIZJ()) {
                        C0NB.LJIIJJI("WebViewTweaker", "tweak webview pause when finishing");
                    }
                }
            }
        }
        if (this.LLILLIZIL != null && mo49getActivity != null && !mo49getActivity.isFinishing()) {
            this.LLILLIZIL.sendEmptyMessageDelayed(10011, 120000L);
        }
        xl("container_disappear", new JSONObject());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "app");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("foreground", false);
            jSONObject.put("args", jSONObject2);
            xl("H5_appStateChange", jSONObject);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        O5Z o5z = this.LJZI;
        if (o5z != null) {
            o5z.getSettings().setBlockNetworkLoads(false);
            WeakHandler weakHandler = this.LLILLIZIL;
            if (weakHandler != null) {
                weakHandler.removeMessages(10011);
            }
        }
        super.onResume();
        O5Z o5z2 = this.LJZI;
        if (o5z2 != null) {
            o5z2.onResume();
        }
        O5Z o5z3 = this.LJZI;
        if (o5z3 != null && this.LLIIIJ != -1) {
            o5z3.reload();
        }
        xl("container_appear", new JSONObject());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "app");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("foreground", true);
            jSONObject.put("args", jSONObject2);
            xl("H5_appStateChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC29343BfP
    public final C29336BfI getShareInfo() {
        return this.LLIIIL;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.AbsHybridFragment
    public final View re() {
        return this.LJZI;
    }

    public static boolean vl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String path = new URL(str).getPath();
            if (!path.endsWith(".htm") && !path.endsWith(".html") && !path.endsWith(".css")) {
                if (!path.endsWith(".js")) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        O5Z o5z;
        if (message.what == 10011 && !this.mStatusActive && (o5z = this.LJZI) != null) {
            try {
                o5z.getSettings().setBlockNetworkLoads(true);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.AbsHybridFragment, X.InterfaceC31238CNu
    public final boolean onBackPressed(String str) {
        super.onBackPressed(str);
        CO5 co5 = this.LJLJJLL;
        if (co5 != null && co5.LJLIL != 1) {
            return true;
        }
        O5Z o5z = this.LJZI;
        if (o5z != null && o5z.canGoBack()) {
            this.LJZI.goBack();
            return true;
        }
        if (!"nav_bar_back_press".equals(str)) {
            return false;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity instanceof InterfaceC29111Bbf) {
            mo49getActivity.finish();
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.az6 || id == R.id.b02) {
            if (this.LLIIIL != null) {
                BNI un0 = ((IShareService) CN1.LIZ(IShareService.class)).un0();
                ActivityC45651qj mo49getActivity = mo49getActivity();
                C29929Bor c29929Bor = new C29929Bor();
                C29336BfI c29336BfI = this.LLIIIL;
                c29929Bor.LJIIJ = c29336BfI.LIZLLL;
                c29929Bor.LJIIL = c29336BfI.LIZIZ;
                c29929Bor.LJIILIIL = c29336BfI.LIZJ;
                c29929Bor.LJJIJIL = ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ab0();
                ((C29338BfK) un0).LIZ(mo49getActivity, new C29930Bos(c29929Bor), new CO8());
                return;
            }
            return;
        }
        if (id != R.id.b01) {
            return;
        }
        onBackPressed("nav_bar_back_press");
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.AbsHybridFragment, com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        super.onCreate(bundle);
        this.LLIIJI = C31949CgL.LIZ();
        ((InterfaceC29856Bng) ((C29374Bfu) B83.LIZ().LIZIZ()).LJIIIIZZ.LIZJ(C73933Szx.LIZLLL(this))).LIZIZ(new AfS36S0101000_5(2, this, 3));
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.getBoolean("from_notification", false);
        String string = arguments.getString("url");
        if (!TextUtils.isEmpty(string)) {
            Uri parse = UriProtector.parse(string);
            if (!this.LLFZ) {
                this.LLFZ = arguments.getBoolean("hide_status_bar", false);
            }
            if (!this.LLFII) {
                this.LLFII = arguments.getBoolean("hide_nav_bar", false);
            }
            if (!this.LLI) {
                this.LLI = arguments.getBoolean("hide_more", false);
            }
            this.LLFFF = arguments.getBoolean("shouldChangeBgResIntoTransparent", false);
            this.LLIIIILZ = arguments.getInt("bundle_web_view_background_color", ColorProtector.parseColor("#ffffff"));
            this.LJLJJL = arguments.getString("soft_input_mode", "");
            if (parse != null) {
                try {
                    if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "web_bg_color"))) {
                        this.LLIIIILZ = Color.parseColor(C40690Fy2.LIZ(UriProtector.getQueryParameter(parse, "web_bg_color")));
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                try {
                    if (UriProtector.getQueryParameter(parse, "hide_nav_bar") != null) {
                        if (CastIntegerProtector.parseInt(UriProtector.getQueryParameter(parse, "hide_nav_bar")) == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        this.LLFII = z4;
                    }
                    if (UriProtector.getQueryParameter(parse, "hide_status_bar") != null) {
                        if (CastIntegerProtector.parseInt(UriProtector.getQueryParameter(parse, "hide_status_bar")) == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.LLFZ = z3;
                    }
                    if (UriProtector.getQueryParameter(parse, "hide_more") != null) {
                        if (CastIntegerProtector.parseInt(UriProtector.getQueryParameter(parse, "hide_more")) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.LLI = z2;
                    }
                    if (UriProtector.getQueryParameter(parse, "hide_loading") != null) {
                        if (C1E4.LJJIFFI(UriProtector.getQueryParameter(parse, "hide_loading")) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.LLIFFJFJJ = z;
                    }
                    this.LLII = UriProtector.getQueryParameter(parse, "status_bar_color");
                    this.LLIIII = UriProtector.getQueryParameter(parse, "status_bar_bg_color");
                } catch (Throwable th) {
                    C0K2.LJII(1, "ttlive_uri_parsing_fail", C45243HpH.LIZ("urlString", string, "errorMsg", th.getMessage()));
                }
            }
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
            }
            this.LLILZLL = arguments2.getString("referer");
            this.LJLL = arguments2.getString("title");
            if (parse != null) {
                if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "title"))) {
                    this.LJLL = UriProtector.getQueryParameter(parse, "title");
                }
                if (UriProtector.getQueryParameter(parse, "bundle_sale_show_status") != null) {
                    this.LLIIIJ = CastIntegerProtector.parseInt(UriProtector.getQueryParameter(parse, "bundle_sale_show_status"));
                }
            }
        }
        if ("black".equals(this.LLII)) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                JF2.LJFF(mo49getActivity.getWindow());
            }
        } else if ("white".equals(this.LLII)) {
            JF2.LJ(mo49getActivity().getWindow());
        }
        if (!C38354F3m.LJ(this.LLIIII)) {
            try {
                int parseColor = Color.parseColor(this.LLIIII);
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                mo49getActivity2.getWindow().addFlags(67108864);
                View view = new View(mo49getActivity2);
                view.setLayoutParams(new LinearLayout.LayoutParams(-1, mo49getActivity2.getResources().getDimensionPixelSize(mo49getActivity2.getResources().getIdentifier("status_bar_height", "dimen", "android"))));
                view.setBackgroundColor(parseColor);
                ((ViewGroup) mo49getActivity2.getWindow().getDecorView()).addView(view);
                ViewGroup viewGroup = (ViewGroup) mo49getActivity2.findViewById(android.R.id.content);
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(viewGroup.getChildCount() - 1);
                viewGroup2.setFitsSystemWindows(true);
                viewGroup2.setClipToPadding(true);
            } catch (Exception unused) {
            }
        }
        if (this.LLFZ) {
            C15450j7.LIZIZ(mo49getActivity());
        }
        this.LLILLIZIL = new WeakHandler(this);
        this.LLILLJJLI = AllowHtmlVideoSetting.INSTANCE.getValue();
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            this.LLILZIL = arguments3.getBoolean("bundle_no_hw_acceleration", false);
            this.LLILL = arguments3.getBoolean("bundle_enable_app_cache", false);
            this.LLIZ = arguments3.getString("url");
            this.LLIZLLLIL = arguments3.getString("original_scheme");
            if (this.LLIZ == null) {
                this.LLIZ = "";
            }
            this.LLILZLL = arguments3.getString("referer");
            this.LLILII = arguments3.getBoolean("bundle_user_webview_title", true);
            String string2 = arguments3.getString("wap_headers");
            try {
                if (!C38354F3m.LJ(string2)) {
                    this.LLILLL = new JSONObject(string2);
                }
            } catch (JSONException unused2) {
            }
            this.LLIL = arguments3.getBoolean("bundle_load_no_cache", false);
        }
        if (!this.LLILZIL) {
            this.LLIIJI.getClass();
            this.LLILZIL = false;
        }
    }

    @Override // X.InterfaceC29343BfP
    public final void ql(C29336BfI c29336BfI) {
        this.LLIIIL = c29336BfI;
        this.LL.setVisibility(0);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C30786C6k.LIZ(this.LLD, this.LLIZ);
    }

    public final void xl(String str, JSONObject jSONObject) {
        if (this.LLILZ != null) {
            if (!jSONObject.has("code")) {
                try {
                    jSONObject.put("code", 1);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            C38113ExZ c38113ExZ = this.LLILZ.LJLILLLLZI;
            if (c38113ExZ.LJFF) {
                IllegalStateException illegalStateException = new IllegalStateException("JsBridge2 is already released!!!");
                if (C1A7.LJLIL) {
                    throw illegalStateException;
                }
            }
            c38113ExZ.LIZ.LJIILL(jSONObject, str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C31241CNx c31241CNx = this.LLIIIZ;
        if (c31241CNx != null) {
            c31241CNx.LJ(i, i2, intent);
        }
        UploadPhotoV2Method uploadPhotoV2Method = this.LLIIL;
        if (uploadPhotoV2Method != null) {
            uploadPhotoV2Method.onActivityResult(i, i2, intent);
        }
        ChooseImageMethod chooseImageMethod = this.LLIIJLIL;
        if (chooseImageMethod != null) {
            chooseImageMethod.onActivityResult(i, i2, intent);
        }
        EncryptedUploadMethod encryptedUploadMethod = this.LLIILII;
        if (encryptedUploadMethod != null) {
            encryptedUploadMethod.onActivityResult(i, i2, intent);
        }
        C76884UFk c76884UFk = this.LLIILZL;
        if (c76884UFk != null) {
            c76884UFk.onActivityResult(i, i2, intent);
        }
        C76885UFl c76885UFl = this.LLIIZ;
        if (c76885UFl != null) {
            c76885UFl.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARN: Type inference failed for: r0v82, types: [com.bytedance.android.live.core.widget.BaseDialogFragment, X.CAu] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        try {
            view = C16880lQ.LLLLIILL(inflater, R.layout.cv7, viewGroup, false);
            this.LJLLJ = view.findViewById(R.id.j83);
            this.LJLLL = view.findViewById(R.id.l_2);
            View findViewById = view.findViewById(R.id.l_a);
            view.findViewById(R.id.lkb).setVisibility(8);
            C16880lQ.LJIIJ(this.LLJJIII, this.LJLLL.findViewById(R.id.aeg));
            TextView textView = (TextView) this.LJLLL.findViewById(R.id.title);
            this.LJLLLL = textView;
            textView.setText(this.LJLL);
            this.LLD = (ViewGroup) view.findViewById(R.id.nia);
            this.LLF = view.findViewById(R.id.nib);
            this.LLFF = view.findViewById(R.id.ni_);
            this.LJZL = (FrameLayout) view.findViewById(R.id.kb7);
            int i = -1;
            this.LJZL.addView(new BF2(mo49getActivity()), new FrameLayout.LayoutParams(-2, -1));
            if (this.LLIFFJFJJ) {
                this.LJZL.setVisibility(8);
            }
            CO1 co1 = (CO1) view.findViewById(R.id.c2t);
            this.LJLLLLLL = co1;
            co1.setListener(new C32789Ctt(this));
            View findViewById2 = view.findViewById(R.id.az6);
            this.LL = findViewById2;
            C16880lQ.LJIIJ(this, findViewById2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLLLL.getLayoutParams();
            marginLayoutParams.leftMargin = (int) KL2.LIZJ(getContext(), 50.0f);
            marginLayoutParams.rightMargin = (int) KL2.LIZJ(getContext(), 50.0f);
            this.LJLLLL.setLayoutParams(marginLayoutParams);
            this.LJLLLL.setSingleLine(true);
            this.LJLLLL.setEllipsize(TextUtils.TruncateAt.END);
            if (this.LLFII) {
                this.LJLLL.setVisibility(8);
                findViewById.setVisibility(8);
                this.LJLLLL.setVisibility(8);
            }
            C73793Sxh<C29383Bg3> c73793Sxh = ((C29374Bfu) B83.LIZ().LIZIZ()).LJI;
            c73793Sxh.getClass();
            C73933Szx.LIZLLL(this).LIZIZ(new C73806Sxu(new C73737Swn(c73793Sxh), new C29991Fr())).LIZIZ(new AfS36S0101000_5(1, this, 14));
            C30882CAc LIZJ = C30882CAc.LIZJ();
            ((CopyOnWriteArrayList) LIZJ.LIZ).add(this);
            CO3.LIZ();
            this.LLJIJIL = System.currentTimeMillis();
            ((HashMap) this.LLJJI).put("webview_cache", 1);
            try {
                O5Z LJ = LIZJ.LJ(getContext());
                this.LJZI = LJ;
                OFH ofh = OFH.LIZLLL;
                String str = this.LJLJL;
                COL col = new COL(LJ, "web");
                ofh.getClass();
                OFH.LIZ(str, col);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            O5Z o5z = this.LJZI;
            if (o5z != null) {
                this.LLD.addView(o5z);
                this.LJZI.setScrollBarStyle(0);
                this.LJZI.setBackgroundColor(this.LLIIIILZ);
                if (!this.LLFFF) {
                    this.LLD.setBackgroundColor(this.LLIIIILZ);
                }
                CookieManager.getInstance().setAcceptCookie(true);
                this.LJZI.setVerticalScrollBarEnabled(false);
                C60408NnI c60408NnI = new C60408NnI(mo49getActivity());
                c60408NnI.LIZIZ = !this.LLILZIL;
                c60408NnI.LIZ(this.LJZI);
                this.LLIIIZ = new C31241CNx(this);
                if (this.LLIL) {
                    this.LJZI.getSettings().setCacheMode(2);
                } else {
                    WebSettings settings = this.LJZI.getSettings();
                    if (this.LLILL) {
                        i = 1;
                    }
                    settings.setCacheMode(i);
                }
                ((HashMap) this.LLJJI).put("page_cache", Integer.valueOf(this.LJZI.getSettings().getCacheMode()));
                C31886CfK LIZLLL = C31886CfK.LIZLLL(mo49getActivity(), this.LJZI, new COM(this), this.LLIIIZ);
                this.LLILZ = LIZLLL;
                ?? r0 = this.LJLIL;
                if (r0 != 0) {
                    r0.Vb(LIZLLL);
                }
                C31886CfK c31886CfK = this.LLILZ;
                if (c31886CfK != null) {
                    CO5 co5 = new CO5();
                    this.LJLJJLL = co5;
                    c31886CfK.LJLILLLLZI.LIZLLL("viewController", co5);
                }
                this.LLILZ.LJLILLLLZI.LIZJ("shareInfo", new IDbS382S0100000_5(this, 4));
                this.LLILZ.LJLILLLLZI.LIZJ("sharePanel", new IDbS382S0100000_5(this, 5));
                this.LLILZ.LJLILLLLZI.LIZJ("uploadPicture", new IDbS382S0100000_5(this, 6));
                this.LLILZ.LJLILLLLZI.LIZJ("chooseImage", new IDbS382S0100000_5(this, 7));
                this.LLILZ.LJLILLLLZI.LIZJ("upload", new IDbS382S0100000_5(this, 8));
                this.LLILZ.LJLILLLLZI.LIZJ("chooseImageForSub", new IDbS382S0100000_5(this, 9));
                this.LLILZ.LJLILLLLZI.LIZJ("editImageForSub", new IDbS382S0100000_5(this, 10));
                this.LLILZ.LJLILLLLZI.LIZJ("openCameraForSub", new IDbS382S0100000_5(this, 11));
                this.LLILZ.LJLJI.LIZIZ("share", new C29337BfJ(new WeakReference(getContext()), this));
                this.LLJILJILJ = System.currentTimeMillis();
                JSONObject jSONObject = this.LLILLL;
                if (jSONObject != null && jSONObject.length() > 0) {
                    HashMap hashMap = new HashMap();
                    C31947CgJ.LIZ(hashMap, this.LLILLL);
                    C31947CgJ.LJI(this.LJZI, this.LLIZ, hashMap);
                } else {
                    C31947CgJ.LJFF(this.LJZI, this.LLIZ, this.LLILZLL);
                }
                CO0 co0 = new CO0(this.LJLJLLL, this.LLIZ);
                this.LLJI = co0;
                co0.LIZ(0, 0, "");
            }
        } catch (Exception e2) {
            if (mo49getActivity() != null) {
                mo49getActivity().finish();
            }
            C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
            StackTraceElement[] stackTrace = e2.getStackTrace();
            LJIILIIL.getClass();
            C0NE.LJIIL(6, stackTrace);
            view = new View(getContext());
        }
        try {
            ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(view, this);
            C10A.LIZIZ(view, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return view;
    }
}
