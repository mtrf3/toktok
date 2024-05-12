package com.ss.android.ugc.aweme.effectcreator.text;

import X.AbstractActivityC162676Zz;
import X.C1539962p;
import X.C1554968j;
import X.C1556068u;
import X.C16880lQ;
import X.C1DH;
import X.C43073GvN;
import X.C43212Gxc;
import X.C48841JEv;
import X.C60903NvH;
import X.C65803Ps7;
import X.C68M;
import X.C68W;
import X.C69B;
import X.C6YM;
import X.C78127UlP;
import X.C78613UtF;
import X.C78866UxK;
import X.C79045V0n;
import X.C83547Wqd;
import X.C93566aSw;
import X.C94441ah3;
import X.C94809amz;
import X.EnumC43650HBe;
import X.EnumC93888aY8;
import X.InterfaceC83564Wqu;
import X.InterfaceC93565aSv;
import X.ORZ;
import X.RunnableC93755aVz;
import X.XKX;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TextEditActivity extends AbstractActivityC162676Zz implements InterfaceC83564Wqu, InterfaceC93565aSv {
    public static final /* synthetic */ int LJLLJ = 0;
    public C83547Wqd LJLJLLL;
    public C93566aSw LJLL;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final String LJLLI = C43073GvN.LIZ(C60903NvH.LJIIJJI().LJJIJL().getPathService(), new CreativeInfo(null, 0, null, 7, null), EnumC43650HBe.SAVE_TO_LOCAL, "/ck_text_sticker", 8).getAbsolutePath();

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIIZ(boolean z) {
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJI() {
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJLIL(boolean z) {
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardModify(int i) {
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.effectcreator.text.TextEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.GBO
    public final C43212Gxc LLFII() {
        C43212Gxc c43212Gxc = new C43212Gxc(R.color.b5, false, 4);
        c43212Gxc.LJLJJL = true;
        return c43212Gxc;
    }

    @Override // X.AbstractActivityC162676Zz
    public final int LLIIIILZ() {
        Integer LJI = C79045V0n.LJI(R.attr.ee, this);
        if (LJI != null) {
            return LJI.intValue();
        }
        return 0;
    }

    @Override // X.InterfaceC93565aSv
    public final void onCancel() {
        if (!isFinishing()) {
            setResult(0);
            finish();
        }
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C83547Wqd c83547Wqd = this.LJLJLLL;
        if (c83547Wqd != null) {
            c83547Wqd.LIZ();
        }
        TextEditImpl.Companion.getClass();
        TextEditImpl.textPageState.setValue(EnumC93888aY8.DISMISS);
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.effectcreator.text.TextEditActivity", "onResume", true);
        super.onResume();
        C93566aSw c93566aSw = this.LJLL;
        if (c93566aSw != null && c93566aSw.LJLL && c93566aSw.LJLLI != null) {
            C94441ah3 c94441ah3 = c93566aSw.LJLILLLLZI;
            if (c94441ah3 != null) {
                c94441ah3.requestFocus();
            } else {
                o.LJIJI("simpleEditText");
                throw null;
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.effectcreator.text.TextEditActivity", "onResume", false);
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

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardHide(int i) {
        C93566aSw c93566aSw = this.LJLL;
        if (c93566aSw != null) {
            c93566aSw.LIZLLL(0);
        }
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardShow(int i) {
        C93566aSw c93566aSw = this.LJLL;
        if (c93566aSw != null) {
            c93566aSw.LIZLLL(i);
        }
    }

    @Override // X.AbstractActivityC162676Zz, X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View view;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.effectcreator.text.TextEditActivity", "onCreate", true);
        super.onCreate(bundle);
        C6YM.LIZ();
        C69B.LIZJ();
        C68M.LJIIJ().LJIJ(this);
        setContentView(R.layout.dul);
        C83547Wqd LJIIJ = C78866UxK.LJIIJ(this);
        LJIIJ.LIZIZ(this);
        this.LJLJLLL = LJIIJ;
        C93566aSw c93566aSw = (C93566aSw) findViewById(R.id.nm6);
        c93566aSw.setTextStickerUpdateListener(this);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "key_text");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        int intExtra = getIntent().getIntExtra("key_mode", -1);
        int intExtra2 = getIntent().getIntExtra("key_color", -1);
        int intExtra3 = getIntent().getIntExtra("key_aline", 2);
        String fontType = C16880lQ.LLJJIJIIJIL(getIntent(), "key_font");
        if (fontType == null) {
            fontType = C68M.LJIIJ().LJII();
        }
        List<TextStickerTextWrap> LIZLLL = C68W.LIZLLL(LLJJIJIIJIL);
        if (((fontType == null || fontType.length() == 0) && (fontType = C68M.LJIIJ().LJII()) == null) || fontType.length() == 0) {
            fontType = "default";
        }
        o.LJIIIZ(fontType, "fontType");
        c93566aSw.LJLJL = -1;
        C1554968j c1554968j = c93566aSw.LJLLLLLL;
        if (c1554968j != null) {
            c1554968j.LIZIZ(C68M.LJIIJ().LJIIIZ());
            C94441ah3 c94441ah3 = c93566aSw.LJLILLLLZI;
            if (c94441ah3 != null) {
                C1DH.LJJIJIL(c94441ah3);
                C94441ah3 c94441ah32 = c93566aSw.LJLILLLLZI;
                if (c94441ah32 != null) {
                    c94441ah32.setTextSize(28);
                    C1556068u c1556068u = c93566aSw.LJLJI;
                    if (c1556068u != null) {
                        c1556068u.LIZIZ();
                    }
                    String LJFF = C68W.LJFF(LIZLLL);
                    List<InteractTextStructWrap> LLJILJILJ = ORZ.LLJILJILJ(C68W.LJI(LIZLLL));
                    c93566aSw.LLD = LLJILJILJ;
                    C94441ah3 c94441ah33 = c93566aSw.LJLILLLLZI;
                    if (c94441ah33 != null) {
                        c94441ah33.setTextStructWrapList(LLJILJILJ);
                        C94441ah3 c94441ah34 = c93566aSw.LJLILLLLZI;
                        if (c94441ah34 != null) {
                            c94441ah34.LJII(LJFF.length(), LJFF);
                            C1556068u c1556068u2 = c93566aSw.LJLJI;
                            if (c1556068u2 != null) {
                                c1556068u2.setSelectColorView(intExtra2);
                            }
                            c93566aSw.LJLJJLL = intExtra;
                            c93566aSw.LJLJLJ = intExtra3;
                            c93566aSw.LJLJLLL = intExtra2;
                            C68M.LJIIJ().LJIJJLI(c93566aSw.getScene(), fontType);
                            c93566aSw.LIZ();
                            C94441ah3 c94441ah35 = c93566aSw.LJLILLLLZI;
                            if (c94441ah35 != null) {
                                c94441ah35.setFontType(C68M.LJIIJ().LJ(c93566aSw.getScene()));
                                C94441ah3 c94441ah36 = c93566aSw.LJLILLLLZI;
                                if (c94441ah36 != null) {
                                    c94441ah36.LJI(intExtra, intExtra2);
                                    C94441ah3 c94441ah37 = c93566aSw.LJLILLLLZI;
                                    if (c94441ah37 != null) {
                                        c94441ah37.setAligin(c93566aSw.LJLJLJ);
                                        C1554968j c1554968j2 = c93566aSw.LJLLLLLL;
                                        if (c1554968j2 != null) {
                                            c1554968j2.LIZJ();
                                            c93566aSw.LIZIZ();
                                            c93566aSw.LIZJ(C68M.LJIIJ().LJFF(c93566aSw.getScene()));
                                            if (!c93566aSw.LJZL && (view = c93566aSw.LJLZ) != null) {
                                                view.setBackground(C78127UlP.LIZIZ(C1539962p.LIZIZ().LIZ().LIZ));
                                            }
                                            if (c93566aSw.LJLL && c93566aSw.LJLLI != null) {
                                                C94441ah3 c94441ah38 = c93566aSw.LJLILLLLZI;
                                                if (c94441ah38 != null) {
                                                    c94441ah38.requestFocus();
                                                } else {
                                                    o.LJIJI("simpleEditText");
                                                    throw null;
                                                }
                                            }
                                            c93566aSw.post(new RunnableC93755aVz(c93566aSw, LLJJIJIIJIL));
                                            this.LJLL = c93566aSw;
                                            TextEditImpl.Companion.getClass();
                                            TextEditImpl.textPageState.setValue(EnumC93888aY8.SHOW);
                                            ActivityAgent.onTrace("com.ss.android.ugc.aweme.effectcreator.text.TextEditActivity", "onCreate", false);
                                            return;
                                        }
                                        o.LJIJI("selectFontLayout");
                                        throw null;
                                    }
                                    o.LJIJI("simpleEditText");
                                    throw null;
                                }
                                o.LJIJI("simpleEditText");
                                throw null;
                            }
                            o.LJIJI("simpleEditText");
                            throw null;
                        }
                        o.LJIJI("simpleEditText");
                        throw null;
                    }
                    o.LJIJI("simpleEditText");
                    throw null;
                }
                o.LJIJI("simpleEditText");
                throw null;
            }
            o.LJIJI("simpleEditText");
            throw null;
        }
        o.LJIJI("selectFontLayout");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        String str;
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        Intent intent = getIntent();
        C93566aSw c93566aSw = this.LJLL;
        if (c93566aSw != null) {
            str = c93566aSw.getEditTextStr();
        } else {
            str = null;
        }
        intent.putExtra("key_text", str);
    }

    @Override // X.InterfaceC93565aSv
    public final void LJLL(String text, int i, int i2, String str, int i3, C94441ah3 c94441ah3) {
        ViewGroup viewGroup;
        o.LJIIIZ(text, "text");
        c94441ah3.scrollTo(0, 0);
        ViewParent parent = c94441ah3.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(c94441ah3, viewGroup);
        }
        if (!isFinishing()) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C94809amz(this, c94441ah3, text, i2, str, i3, i, null), 3);
        }
    }
}
