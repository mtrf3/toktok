package X;

import Y.ARunnableS26S0300000_15;
import Y.IDxS312S0100000_15;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.PollApi;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Xw3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86431Xw3 extends RelativeLayout implements InterfaceC86439XwB {
    public final TextView LJLIL;
    public final ViewGroup LJLILLLLZI;
    public final C86433Xw5 LJLJI;
    public final TextView LJLJJI;
    public final TextView LJLJJL;
    public final ViewGroup LJLJJLL;
    public final C86433Xw5 LJLJL;
    public final TextView LJLJLJ;
    public final TextView LJLJLLL;
    public boolean LJLL;
    public String LJLLI;
    public final PollApi LJLLILLLL;
    public final C73318Sq2 LJLLJ;
    public long LJLLL;
    public C245649kW LJLLLL;
    public int LJLLLLLL;
    public float[] LJLZ;
    public final Paint LJZ;
    public final Path LJZI;
    public PollStruct LJZL;
    public InterfaceC86436Xw8 LL;
    public final FrameLayout LLD;
    public InteractStickerStruct LLF;
    public C86432Xw4 LLFF;
    public final C86435Xw7 LLFFF;

    public final void LJ() {
        String str;
        String str2;
        String str3;
        String str4;
        C223778qL c223778qL;
        C223778qL c223778qL2;
        C223778qL c223778qL3;
        C223778qL c223778qL4;
        C188727au c188727au = new C188727au();
        C245649kW c245649kW = this.LJLLLL;
        String str5 = null;
        if (c245649kW != null && (c223778qL4 = c245649kW.LJIIZILJ) != null) {
            str = c223778qL4.LIZJ;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        C245649kW c245649kW2 = this.LJLLLL;
        if (c245649kW2 != null && (c223778qL3 = c245649kW2.LJIIZILJ) != null) {
            str2 = c223778qL3.LIZIZ;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        C245649kW c245649kW3 = this.LJLLLL;
        if (c245649kW3 != null && (c223778qL2 = c245649kW3.LJIIZILJ) != null) {
            str3 = c223778qL2.LIZLLL;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("log_pb", str3);
        C245649kW c245649kW4 = this.LJLLLL;
        if (c245649kW4 != null && (c223778qL = c245649kW4.LJIIZILJ) != null) {
            str5 = c223778qL.LIZ;
        }
        c188727au.LJIIIZ("enter_from", str5);
        StickerAttrStruct LIZ = C223998qh.LIZ(this.LLF);
        if (LIZ == null || (str4 = LIZ.getPollStickerId()) == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("prop_id", str4);
        FMX.LJIIL("guest_poll_click", c188727au.LIZ);
    }

    public final int getPollStatus() {
        Long l;
        Long l2;
        Long l3;
        List<PollStruct.OptionsBean> options;
        PollStruct.OptionsBean optionsBean;
        List<PollStruct.OptionsBean> options2;
        PollStruct.OptionsBean optionsBean2;
        if (this.LJLL) {
            return 3;
        }
        PollStruct pollStruct = this.LJZL;
        Long l4 = null;
        if (pollStruct != null) {
            l = Long.valueOf(pollStruct.getSelectOptionId());
        } else {
            l = null;
        }
        PollStruct pollStruct2 = this.LJZL;
        if (pollStruct2 != null && (options2 = pollStruct2.getOptions()) != null && (optionsBean2 = (PollStruct.OptionsBean) ListProtector.get(options2, 0)) != null) {
            l2 = Long.valueOf(optionsBean2.getOptionId());
        } else {
            l2 = null;
        }
        if (o.LJ(l, l2)) {
            return 1;
        }
        PollStruct pollStruct3 = this.LJZL;
        if (pollStruct3 != null) {
            l3 = Long.valueOf(pollStruct3.getSelectOptionId());
        } else {
            l3 = null;
        }
        PollStruct pollStruct4 = this.LJZL;
        if (pollStruct4 != null && (options = pollStruct4.getOptions()) != null && (optionsBean = (PollStruct.OptionsBean) ListProtector.get(options, 1)) != null) {
            l4 = Long.valueOf(optionsBean.getOptionId());
        }
        if (o.LJ(l3, l4)) {
            return 2;
        }
        return 0;
    }

    @Override // X.InterfaceC86439XwB
    /* renamed from: getStatus, reason: collision with other method in class */
    public Integer mo47getStatus() {
        return Integer.valueOf(this.LJLLLLLL);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLLJ.dispose();
    }

    public final InterfaceC86438XwA getAnimEndListener() {
        return this.LLFFF;
    }

    public final C245649kW getInteractStickerParams() {
        return this.LJLLLL;
    }

    public final InteractStickerStruct getInteractStickerStruct() {
        return this.LLF;
    }

    public final Path getPath() {
        return this.LJZI;
    }

    public final C86432Xw4 getPbListener() {
        return this.LLFF;
    }

    public final float[] getPoints() {
        return this.LJLZ;
    }

    public final FrameLayout getPollView() {
        return this.LLD;
    }

    public final int getStatus() {
        return this.LJLLLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86431Xw3(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLLI = "";
        PollApi.LIZ.getClass();
        Object create = C86395XvT.LIZIZ.createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(PollApi.class);
        o.LJIIIIZZ(create, "retrofitService.createNe…eate(PollApi::class.java)");
        this.LJLLILLLL = (PollApi) create;
        this.LJLLJ = new C73318Sq2();
        this.LJZ = new Paint();
        this.LJZI = new Path();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dt_, this, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) LLLLIILL;
        this.LLD = frameLayout;
        this.LLFF = new C86432Xw4(this);
        View findViewById = frameLayout.findViewById(R.id.hwj);
        o.LJIIIIZZ(findViewById, "pollView.findViewById(R.id.poll_title)");
        TextView textView = (TextView) findViewById;
        this.LJLIL = textView;
        View findViewById2 = frameLayout.findViewById(R.id.j5e);
        o.LJIIIIZZ(findViewById2, "pollView.findViewById(R.id.rl_question1)");
        ViewGroup viewGroup = (ViewGroup) findViewById2;
        this.LJLILLLLZI = viewGroup;
        View findViewById3 = frameLayout.findViewById(R.id.hwb);
        o.LJIIIIZZ(findViewById3, "pollView.findViewById(R.id.poll_question_1)");
        C86433Xw5 c86433Xw5 = (C86433Xw5) findViewById3;
        this.LJLJI = c86433Xw5;
        View findViewById4 = frameLayout.findViewById(R.id.l4y);
        o.LJIIIIZZ(findViewById4, "pollView.findViewById(R.id.text_question_1)");
        this.LJLJJI = (TextView) findViewById4;
        View findViewById5 = frameLayout.findViewById(R.id.hlg);
        o.LJIIIIZZ(findViewById5, "pollView.findViewById(R.id.percent_question_1)");
        TextView textView2 = (TextView) findViewById5;
        this.LJLJJL = textView2;
        View findViewById6 = frameLayout.findViewById(R.id.j5f);
        o.LJIIIIZZ(findViewById6, "pollView.findViewById(R.id.rl_question2)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById6;
        this.LJLJJLL = viewGroup2;
        View findViewById7 = frameLayout.findViewById(R.id.hwc);
        o.LJIIIIZZ(findViewById7, "pollView.findViewById(R.id.poll_question_2)");
        C86433Xw5 c86433Xw52 = (C86433Xw5) findViewById7;
        this.LJLJL = c86433Xw52;
        View findViewById8 = frameLayout.findViewById(R.id.l4z);
        o.LJIIIIZZ(findViewById8, "pollView.findViewById(R.id.text_question_2)");
        this.LJLJLJ = (TextView) findViewById8;
        View findViewById9 = frameLayout.findViewById(R.id.hlh);
        o.LJIIIIZZ(findViewById9, "pollView.findViewById(R.id.percent_question_2)");
        TextView textView3 = (TextView) findViewById9;
        this.LJLJLLL = textView3;
        textView2.setAlpha(0.0f);
        textView3.setAlpha(0.0f);
        c86433Xw5.setStatusView(this);
        c86433Xw52.setStatusView(this);
        c86433Xw5.setClickListener(this.LLFF);
        c86433Xw52.setClickListener(this.LLFF);
        C16360ka.LJIJ(viewGroup, KL2.LIZJ(getContext(), 4.0f));
        C16360ka.LJIJ(viewGroup2, KL2.LIZJ(getContext(), 4.0f));
        Typeface typefaceByFontName = AVExternalServiceImpl.LIZ().typeFaceService().getTypefaceByFontName("");
        if (typefaceByFontName != null) {
            textView.setTypeface(typefaceByFontName);
        }
        frameLayout.setLayoutDirection(3);
        if (C90193gN.LIZIZ(getContext())) {
            viewGroup.setLayoutDirection(1);
            viewGroup2.setLayoutDirection(1);
        } else {
            viewGroup.setLayoutDirection(0);
            viewGroup2.setLayoutDirection(0);
        }
        addView(frameLayout);
        this.LLFFF = new C86435Xw7(this);
    }

    public final String LIZ(String str) {
        if (str == null) {
            return "";
        }
        Paint paint = new Paint();
        Rect rect = new Rect();
        paint.setTypeface(Typeface.DEFAULT);
        paint.setTextSize(KL2.LJIIZILJ(getContext(), 15.0f));
        int length = str.length() - 1;
        int length2 = str.length() - 1;
        while (true) {
            if (-1 >= length2) {
                break;
            }
            paint.getTextBounds(str, 0, length2, rect);
            if (KL2.LIZJ(getContext(), 49.0f) + KL2.LIZJ(getContext(), 20.0f) + rect.width() < this.LJLJI.getWidth()) {
                length = length2;
                break;
            }
            length2--;
        }
        if (length < str.length() - 1) {
            StringBuilder LIZ = X1D.LIZ();
            String substring = str.substring(0, length);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            LIZ.append(substring);
            LIZ.append("...");
            return X1D.LIZIZ(LIZ);
        }
        return str;
    }

    public final void LIZLLL(String str) {
        String str2;
        String str3;
        String str4;
        Long l;
        C245649kW c245649kW = this.LJLLLL;
        Long l2 = null;
        if (c245649kW == null || (str2 = c245649kW.LJII) == null || str2.length() == 0) {
            return;
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C245649kW c245649kW2 = this.LJLLLL;
        if (c245649kW2 != null) {
            str3 = c245649kW2.LJII;
            str4 = c245649kW2.LJIIIIZZ;
            l = Long.valueOf(c245649kW2.LJIIIZ);
        } else {
            str3 = null;
            str4 = null;
            l = null;
        }
        String valueOf = String.valueOf(l);
        C245649kW c245649kW3 = this.LJLLLL;
        if (c245649kW3 != null) {
            l2 = Long.valueOf(c245649kW3.LJIIJ);
        }
        o.LJI(l2);
        long longValue = l2.longValue();
        if (str3 == null || str3.length() == 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ad vote click event : ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        JSONObject jSONObject = new JSONObject();
        try {
            C73340SqO.LJIL().getClass();
            NN1.LJJJJL(context, str3, jSONObject);
        } catch (JSONException e) {
            C36922EeM.LIZ(e);
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.opt("ad_extra_data");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        try {
            jSONObject2.put("poll_click_area", str);
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (JSONException e2) {
            C36922EeM.LIZ(e2);
        }
        C247179mz.LIZIZ(context, "poll_sticker_click", str4, valueOf, longValue, jSONObject);
    }

    public final void LJFF(Long l) {
        PollStruct pollStruct;
        long j;
        if (l == null || (pollStruct = this.LJZL) == null || Long.valueOf(pollStruct.getPollId()) == null) {
            return;
        }
        PollApi pollApi = this.LJLLILLLL;
        PollStruct pollStruct2 = this.LJZL;
        if (pollStruct2 != null) {
            j = pollStruct2.getPollId();
        } else {
            j = 0;
        }
        pollApi.poll(j, l.longValue()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS312S0100000_15(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LJLL) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (C223998qh.LJ(context) && this.LJLZ != null) {
            this.LJZI.reset();
            Path path = this.LJZI;
            float[] fArr = this.LJLZ;
            o.LJI(fArr);
            float f = fArr[0];
            float[] fArr2 = this.LJLZ;
            o.LJI(fArr2);
            path.moveTo(f, fArr2[1]);
            Path path2 = this.LJZI;
            float[] fArr3 = this.LJLZ;
            o.LJI(fArr3);
            float f2 = fArr3[2];
            float[] fArr4 = this.LJLZ;
            o.LJI(fArr4);
            path2.lineTo(f2, fArr4[3]);
            Path path3 = this.LJZI;
            float[] fArr5 = this.LJLZ;
            o.LJI(fArr5);
            float f3 = fArr5[6];
            float[] fArr6 = this.LJLZ;
            o.LJI(fArr6);
            path3.lineTo(f3, fArr6[7]);
            Path path4 = this.LJZI;
            float[] fArr7 = this.LJLZ;
            o.LJI(fArr7);
            float f4 = fArr7[4];
            float[] fArr8 = this.LJLZ;
            o.LJI(fArr8);
            path4.lineTo(f4, fArr8[5]);
            this.LJZI.close();
            if (canvas != null) {
                canvas.drawPath(this.LJZI, this.LJZ);
            }
        }
    }

    public final void setInteractStickerParams(C245649kW c245649kW) {
        this.LJLLLL = c245649kW;
    }

    public final void setInteractStickerStruct(InteractStickerStruct interactStickerStruct) {
        this.LLF = interactStickerStruct;
    }

    public final void setPbListener(C86432Xw4 c86432Xw4) {
        o.LJIIIZ(c86432Xw4, "<set-?>");
        this.LLFF = c86432Xw4;
    }

    public final void setPoints(float[] fArr) {
        this.LJLZ = fArr;
    }

    public final void setStatus(int i) {
        this.LJLLLLLL = i;
    }

    public final float LIZJ(int i, int i2) {
        float f;
        float f2;
        List<PollStruct.OptionsBean> options;
        PollStruct.OptionsBean optionsBean;
        List<PollStruct.OptionsBean> options2;
        PollStruct.OptionsBean optionsBean2;
        List<PollStruct.OptionsBean> options3;
        PollStruct.OptionsBean optionsBean3;
        PollStruct pollStruct = this.LJZL;
        float f3 = 0.0f;
        if (pollStruct != null && (options3 = pollStruct.getOptions()) != null && (optionsBean3 = (PollStruct.OptionsBean) ListProtector.get(options3, 0)) != null) {
            f = (float) optionsBean3.getPollCount();
        } else {
            f = 0.0f;
        }
        PollStruct pollStruct2 = this.LJZL;
        if (pollStruct2 != null && (options2 = pollStruct2.getOptions()) != null && (optionsBean2 = (PollStruct.OptionsBean) ListProtector.get(options2, 1)) != null) {
            f2 = (float) optionsBean2.getPollCount();
        } else {
            f2 = 0.0f;
        }
        float f4 = i2;
        float f5 = f + f2 + f4;
        if (f5 == 0.0f) {
            if (this.LJLL) {
                return 101.0f;
            }
            return 50.0f;
        }
        PollStruct pollStruct3 = this.LJZL;
        if (pollStruct3 != null && (options = pollStruct3.getOptions()) != null && (optionsBean = (PollStruct.OptionsBean) ListProtector.get(options, i)) != null) {
            f3 = (float) optionsBean.getPollCount();
        }
        return ((f3 + f4) / f5) * 100;
    }

    public final void LJII(C86433Xw5 c86433Xw5, TextView textView, TextView textView2, int i) {
        float width = ((c86433Xw5.getWidth() - textView.getWidth()) / 2) - KL2.LIZJ(getContext(), 20.0f);
        if (C90193gN.LIZIZ(getContext())) {
            width = -width;
        }
        c86433Xw5.setProgress(i);
        textView2.setAlpha(1.0f);
        textView.setTranslationX(-width);
    }

    public final void LIZIZ(C86433Xw5 c86433Xw5, TextView textView, TextView textView2, int i, boolean z) {
        float width = ((c86433Xw5.getWidth() - textView.getWidth()) / 2) - KL2.LIZJ(getContext(), 20.0f);
        if (C90193gN.LIZIZ(getContext())) {
            width = -width;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(c86433Xw5, "progress", 0, i);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, "translationX", 0.0f, -width);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofInt);
        animatorSet.setDuration(300L);
        animatorSet.addListener(new C86434Xw6(z, this));
        animatorSet.start();
    }

    public final void LJI(PollStruct pollStruct, boolean z, String str, InterfaceC86436Xw8 interfaceC86436Xw8, InteractStickerStruct interactStickerStruct) {
        String str2;
        this.LJZL = pollStruct;
        this.LJLL = z;
        this.LJLLI = str;
        this.LL = interfaceC86436Xw8;
        this.LLF = interactStickerStruct;
        String str3 = null;
        if (pollStruct != null) {
            str2 = pollStruct.getQuestion();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            this.LJLIL.setVisibility(8);
        } else {
            this.LJLIL.setVisibility(0);
            TextView textView = this.LJLIL;
            if (pollStruct != null) {
                str3 = pollStruct.getQuestion();
            }
            textView.setText(str3);
        }
        this.LJLJJI.post(new ARunnableS26S0300000_15(this, pollStruct, interfaceC86436Xw8, 8));
    }
}
