package X;

import Y.IDTListenerS122S0100000_14;
import Y.IDiS275S0100000_14;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.aweme.views.IDlS65S0100000_14;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Wab, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82553Wab extends FrameLayout implements InterfaceC46304IFg {
    public TextView LJLIL;
    public TextView LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public C62846OlW LJLJJL;
    public TextView LJLJJLL;
    public TextView LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public C81290VvK LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public View LJLLJ;
    public C8ID LJLLL;
    public boolean LJLLLL;
    public C170736mz LJLLLLLL;
    public final int LJLZ;
    public InterfaceC82571Wat LJZ;
    public C82554Wac LJZI;
    public C82550WaY LJZL;
    public final ActivityC45651qj LL;
    public int LLD;
    public final C82568Waq LLF;
    public C78281Unt LLFF;
    public int LLFFF;
    public ObjectAnimator LLFII;
    public ObjectAnimator LLFZ;
    public C173166qu LLI;
    public C82622Wbi LLIFFJFJJ;
    public InterfaceC47391Iip LLII;
    public EnumC82565Wan LLIIII;

    @Override // X.InterfaceC46304IFg
    public final void LJJIFFI(InterfaceC46305IFh interfaceC46305IFh) {
    }

    @Override // X.InterfaceC46304IFg
    public final void LJJLIIIJJIZ(InterfaceC82549WaX interfaceC82549WaX) {
    }

    @Override // X.InterfaceC46304IFg
    public final void onResumePlay(String str) {
    }

    private int getItemWidth() {
        if (this.LLD <= 0) {
            int i = 0;
            C82547WaV c82547WaV = (C82547WaV) this.LJZL.LJJIIZI(0);
            if (c82547WaV != null) {
                ViewGroup viewGroup = c82547WaV.LJLJL;
                if (viewGroup != null) {
                    i = viewGroup.getMeasuredWidth();
                }
                this.LLD = i;
            }
        }
        return this.LLD;
    }

    public final void LIZJ() {
        C82561Waj c82561Waj;
        Video video;
        C82547WaV LIZIZ = LIZIZ(this.LJLLILLLL);
        if (LIZIZ != null && (c82561Waj = LIZIZ.LJLJLLL) != null && !c82561Waj.isPlaying() && (video = LIZIZ.LJLL) != null) {
            LIZIZ.LJLJLLL.tryResume(video);
            LIZIZ.LJLLLL = false;
            LIZIZ.LJLLLLLL = System.currentTimeMillis();
        }
    }

    public final void LJ() {
        C8ID c8id = this.LJLLL;
        if (c8id != null) {
            c8id.setVisibility(8);
        }
        this.LJLLJ.setVisibility(0);
        this.LJLILLLLZI.setVisibility(0);
        this.LJLIL.setVisibility(0);
        this.LJZI.setNoScroll(false);
        C82550WaY c82550WaY = this.LJZL;
        if (c82550WaY != null) {
            LJI(c82550WaY.LJJIIZ(this.LJLLILLLL));
        } else {
            LIZ(true);
        }
        this.LJLL.LIZIZ();
        this.LJLLLL = false;
        InterfaceC82571Wat interfaceC82571Wat = this.LJZ;
        if (interfaceC82571Wat != null) {
            InterfaceC82548WaW LJJIIZ = this.LJZL.LJJIIZ(0);
            C82552Waa c82552Waa = (C82552Waa) interfaceC82571Wat;
            if (LJJIIZ == null) {
                C60903NvH.LJIIJJI().LJJIIZI().LJIIZILJ("ITemplate should not be null");
            } else {
                if (LJJIIZ.LJII() != EnumC43998HOo.MV_TEMPLATE && LJJIIZ.LJII() != EnumC43998HOo.CUT_SAME) {
                    return;
                }
                c82552Waa.LJIIJJI(LJJIIZ, 0);
            }
        }
    }

    public final void LJFF() {
        int i = this.LJLLILLLL;
        InterfaceC82548WaW LJJIIZ = this.LJZL.LJJIIZ(i);
        C82547WaV LIZIZ = LIZIZ(i);
        if (LJJIIZ == null) {
            return;
        }
        if (LJJIIZ.LJII() == EnumC43998HOo.MV_TEMPLATE) {
            MvThemeData mvThemeData = (MvThemeData) LJJIIZ;
            Effect effect = mvThemeData.effect;
            HashMap hashMap = new HashMap();
            C173166qu c173166qu = this.LLI;
            if (c173166qu != null) {
                hashMap.put("shoot_way", c173166qu.LJFF);
                hashMap.put("creation_id", this.LLI.LJ);
            }
            hashMap.put("from", C78855Ux9.LJLJL);
            if (effect != null) {
                hashMap.put("template_id", effect.getEffectId());
            }
            C82568Waq c82568Waq = this.LLF;
            C82557Waf c82557Waf = new C82557Waf(this, LIZIZ, i, mvThemeData);
            if (c82568Waq.LIZ == null || effect == null) {
                c82557Waf.onFail(effect, new ExceptionResult(-10001));
                return;
            }
            if (effect.getUnzipPath() != null) {
                String unzipPath = effect.getUnzipPath();
                if (C39579Fg7.LIZIZ(unzipPath) && TEVideoUtils.nativeCheckMVResourceIntegrity(unzipPath) == 0) {
                    c82557Waf.onSuccess(effect);
                    return;
                }
            }
            InterfaceC84498XEg interfaceC84498XEg = c82568Waq.LIZ;
            o.LJI(interfaceC84498XEg);
            interfaceC84498XEg.fetchEffect(effect, new C44366Hb8("mv", new C82572Wau(c82568Waq, c82557Waf), false, hashMap));
            return;
        }
        InterfaceC82571Wat interfaceC82571Wat = this.LJZ;
        if (interfaceC82571Wat == null) {
            return;
        }
        ((C82552Waa) interfaceC82571Wat).LIZIZ(LJJIIZ, 1, this.LJLLILLLL);
    }

    public String getCurTemplateId() {
        InterfaceC82548WaW LJJIIZ = this.LJZL.LJJIIZ(this.LJLLILLLL);
        if (LJJIIZ != null && LJJIIZ.LJII() == EnumC43998HOo.MV_TEMPLATE) {
            MvThemeData mvThemeData = (MvThemeData) LJJIIZ;
            if (!TextUtils.isEmpty(mvThemeData.LJIIJJI())) {
                return mvThemeData.LJIIJJI();
            }
        }
        return "";
    }

    public int getCurTemplateType() {
        InterfaceC82548WaW LJJIIZ = this.LJZL.LJJIIZ(this.LJLLILLLL);
        if (LJJIIZ != null) {
            EnumC43998HOo LJII = LJJIIZ.LJII();
            EnumC43998HOo enumC43998HOo = EnumC43998HOo.MV_TEMPLATE;
            if (LJII == enumC43998HOo) {
                return enumC43998HOo.getValue();
            }
        }
        return EnumC43998HOo.CUT_SAME.getValue();
    }

    public int getDataCount() {
        return this.LJZL.getCount();
    }

    public final void LIZ(boolean z) {
        if (z) {
            C81290VvK c81290VvK = this.LJLL;
            c81290VvK.setText(c81290VvK.getContext().getResources().getString(R.string.pwl));
            this.LJLL.setClickable(true);
        } else {
            C81290VvK c81290VvK2 = this.LJLL;
            c81290VvK2.setText(c81290VvK2.getContext().getResources().getString(R.string.bzh));
            this.LJLL.setClickable(false);
        }
    }

    public final C82547WaV LIZIZ(int i) {
        if (this.LJZL.getCount() > 0 && i >= 0 && i < this.LJZL.getCount()) {
            return (C82547WaV) this.LJZL.LJJIIZI(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.util.List<? extends X.InterfaceC82548WaW> r7) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82553Wab.LIZLLL(java.util.List):void");
    }

    public final void LJI(InterfaceC82548WaW interfaceC82548WaW) {
        boolean z;
        if (interfaceC82548WaW == null || !interfaceC82548WaW.isValid()) {
            LIZ(true);
            return;
        }
        if (interfaceC82548WaW.LJII() == EnumC43998HOo.MV_TEMPLATE) {
            C82568Waq c82568Waq = this.LLF;
            Effect effect = ((MvThemeData) interfaceC82548WaW).effect;
            InterfaceC84498XEg interfaceC84498XEg = c82568Waq.LIZ;
            if (interfaceC84498XEg != null && effect != null) {
                try {
                    z = interfaceC84498XEg.LJIJ(effect);
                } catch (Exception unused) {
                }
                LIZ(!z);
                return;
            }
            z = false;
            LIZ(!z);
            return;
        }
        LIZ(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @QD3
    public void handleSelectEvent(C82562Wak c82562Wak) {
        if (c82562Wak.LJLIL == EnumC82563Wal.START) {
            this.LLIIII = c82562Wak.LJLILLLLZI;
        } else {
            EnumC82565Wan enumC82565Wan = this.LLIIII;
            if (enumC82565Wan != null && c82562Wak.LJLILLLLZI != enumC82565Wan) {
                return;
            }
        }
        if (C82566Wao.LIZ[c82562Wak.LJLILLLLZI.ordinal()] != 1 || c82562Wak.LJLIL != EnumC82563Wal.SCROLL) {
            return;
        }
        float f = c82562Wak.LJLJJI;
        this.LJZI.scrollTo((int) ((c82562Wak.LJLJI + f) * (getItemWidth() + this.LLFFF)), 0);
        if (c82562Wak.LJLJI != this.LJZI.getCurrentItem() && f < 0.01d) {
            this.LJZI.setCurrentItem(c82562Wak.LJLJI);
        }
        UserVisibleHintGroupScene LJJIIZI = this.LJZL.LJJIIZI(c82562Wak.LJLJI);
        if (LJJIIZI == null) {
            return;
        }
        this.LLFF.LIZ(LJJIIZI.mView, f);
        int i = c82562Wak.LJLJI + 1;
        if (i >= this.LJZL.getCount()) {
            return;
        }
        this.LLFF.LIZ(this.LJZL.LJJIIZI(i).mView, 1.0f - f);
    }

    public void setDiContainer(C82622Wbi c82622Wbi) {
        this.LLIFFJFJJ = c82622Wbi;
        String LJI = ((ShortVideoContext) c82622Wbi.LJ(ShortVideoContext.class, null)).LJI();
        String str = ((ShortVideoContext) this.LLIFFJFJJ.LJ(ShortVideoContext.class, null)).shootWay;
        if (str == null) {
            str = "";
        }
        this.LLI = new C173166qu(0L, 0, "", LJI, str, "", 0);
        this.LJZL.LJLJL = c82622Wbi;
        this.LLII = ((InterfaceC47196Ifg) c82622Wbi.LJ(InterfaceC47196Ifg.class, null)).getAVAppPlayingVideoViewProxy();
    }

    public void setMvEffectPlatform(InterfaceC84498XEg interfaceC84498XEg) {
        this.LLF.LIZ = interfaceC84498XEg;
    }

    public void setMvThemeClickListener(InterfaceC82571Wat interfaceC82571Wat) {
        this.LJZ = interfaceC82571Wat;
    }

    public C82553Wab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLF = new C82568Waq();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null) {
                this.LL = LJJIFFI;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        this.LJLZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
        setClipChildren(false);
        setBackgroundColor(ColorProtector.parseColor("#C0000000"));
        C16880lQ.LLLZIIL(R.layout.bl9, C16880lQ.LLZIL(context), this);
        this.LJLIL = (TextView) findViewById(R.id.l67);
        this.LJLILLLLZI = (TextView) findViewById(R.id.l65);
        this.LJLL = (C81290VvK) findViewById(R.id.kcp);
        this.LJLLJ = findViewById(R.id.btt);
        this.LJLJJI = findViewById(R.id.a_y);
        this.LJLJI = findViewById(R.id.a_w);
        this.LJLJJLL = (TextView) findViewById(R.id.aa0);
        this.LJLJJL = (C62846OlW) findViewById(R.id.a_v);
        this.LJLJL = (TextView) findViewById(R.id.a_x);
        this.LJLLL = (C8ID) findViewById(R.id.g8p);
        this.LJLJLJ = findViewById(R.id.hid);
        this.LJLJLLL = findViewById(R.id.nd1);
        this.LJLL.setOnClickListener(new ViewOnClickListenerC13880ga(new IDlS65S0100000_14(this, 2)));
        this.LJLLLLLL = (C170736mz) findViewById(R.id.gv5);
        Typeface LIZLLL = C8HI.LIZJ().LIZLLL("medium");
        if (LIZLLL != null) {
            this.LJLL.setTypeface(LIZLLL);
        }
        C16880lQ.LJJJZ(this.LJLLLLLL, new IDlS65S0100000_14(this, 3));
        this.LJLIL.setSelected(true);
        this.LJLILLLLZI.setSelected(true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LJLJLJ.getLayoutParams();
        layoutParams.topMargin = (int) (KL2.LIZJ(getContext(), 68.5f) + C81184Vtc.LJFF(getContext()));
        this.LJLJLJ.setLayoutParams(layoutParams);
        C82554Wac c82554Wac = (C82554Wac) findViewById(R.id.gnz);
        this.LJZI = c82554Wac;
        c82554Wac.setOffscreenPageLimit(3);
        C81258Vuo c81258Vuo = new C81258Vuo(this.LJZI.getContext());
        C82554Wac c82554Wac2 = this.LJZI;
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(c82554Wac2, c81258Vuo);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        c81258Vuo.LIZ = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        this.LLFF = new C78281Unt();
        int LIZJ = (int) KL2.LIZJ(this.LL, 16.0f);
        this.LLFFF = LIZJ;
        this.LJZI.setPageMargin(LIZJ);
        this.LJZI.setPageTransformer(true, this.LLFF);
        this.LJZI.setBounceScrollListener(new C82567Wap(this));
        this.LJZI.addOnPageChangeListener(new IDiS275S0100000_14(this, 5));
        this.LJZI.setHandleClickChange(true);
        this.LJLJLLL.setOnTouchListener(new IDTListenerS122S0100000_14(this, 4));
        this.LJLL.setBackgroundColor(this.LJLZ);
    }
}
