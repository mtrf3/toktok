package X;

import Y.ARunnableS32S0200000_13;
import Y.ARunnableS45S0100000_9;
import Y.ARunnableS49S0100000_13;
import Y.IDComparatorS41S0000000_13;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.bytedance.android.livesdk.dataChannel.LowDevicePerfScalableChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayDismissTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayPriceColorSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiHostGiftTrayOptSetting;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Ukc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78078Ukc extends AbstractC78073UkX {
    public InterfaceC78108Ul6 LJZL;
    public long LL;
    public ViewGroup LLD;
    public TextView LLF;
    public boolean LLFF;
    public final ARunnableS49S0100000_13 LLFFF;
    public final ARunnableS49S0100000_13 LLFII;
    public final C78077Ukb LLFZ;

    public final int[] getIconViewDimensions() {
        int i;
        int[] iArr = new int[2];
        C2A4 mGiftIconIv = getMGiftIconIv();
        int i2 = -1;
        if (mGiftIconIv != null) {
            i = mGiftIconIv.getWidth();
        } else {
            i = -1;
        }
        iArr[0] = i;
        C2A4 mGiftIconIv2 = getMGiftIconIv();
        if (mGiftIconIv2 != null) {
            i2 = mGiftIconIv2.getHeight();
        }
        iArr[1] = i2;
        return iArr;
    }

    @Override // X.AbstractC78073UkX
    public final void LJIIJJI() {
        super.LJIIJJI();
        TextView textView = (TextView) findViewById(R.id.ms1);
        this.LLF = textView;
        if (textView != null) {
            textView.setTypeface(C8HI.LIZJ().LIZLLL("bold"), 2);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.dvj);
        this.LLD = viewGroup;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final boolean LJIILIIL() {
        DataChannel dataChannel;
        C30134BsA c30134BsA;
        if (ScalableDowngradeSetting.disableGiftNotifyAnim() && (dataChannel = getDataChannel()) != null && (c30134BsA = (C30134BsA) dataChannel.kv0(LowDevicePerfScalableChannel.class)) != null && c30134BsA.LIZIZ.ordinal() <= EnumC30098Bra.LEVEL_CRITICAL.ordinal()) {
            return true;
        }
        return false;
    }

    public final void LJIILL() {
        Integer num;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator withEndAction;
        TextPaint paint;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("try show critical at combo ");
        C78072UkW mGiftMsg = getMGiftMsg();
        Object obj = null;
        if (mGiftMsg != null) {
            num = Integer.valueOf(mGiftMsg.LJIIIZ);
        } else {
            num = null;
        }
        LIZ.append(num);
        Logger.i("BAGS", X1D.LIZIZ(LIZ));
        C78072UkW mGiftMsg2 = getMGiftMsg();
        if (mGiftMsg2 != null) {
            C47121t6 firstGiftOrForYouTextView = getFirstGiftOrForYouTextView();
            if ((firstGiftOrForYouTextView != null && firstGiftOrForYouTextView.getVisibility() == 0) || !(!mGiftMsg2.LJIJJLI.isEmpty())) {
                return;
            }
            if (C31120CJg.LJIIIZ()) {
                Iterator it = ORZ.LLILII(new IDComparatorS41S0000000_13(18), mGiftMsg2.LJIJJLI).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (mGiftMsg2.LJIIIZ >= ((C78087Ukl) next).LIZ) {
                        obj = next;
                        break;
                    }
                }
                C78087Ukl c78087Ukl = (C78087Ukl) obj;
                if (c78087Ukl == null) {
                    return;
                }
                long j = c78087Ukl.LIZJ;
                if (j <= 1) {
                    return;
                }
                TextView textView = this.LLF;
                if (textView != null) {
                    textView.setText(C15380j0.LJIILL(R.string.kf2, Long.valueOf(j)));
                }
                TextView textView2 = this.LLF;
                if (textView2 != null && (paint = textView2.getPaint()) != null) {
                    float measureText = paint.measureText(C15380j0.LJIILL(R.string.kf2, Long.valueOf(c78087Ukl.LIZJ)));
                    if (measureText != 0.0f) {
                        float LIZ2 = C15380j0.LIZ(36.0f) + C15380j0.LIZ(24.0f) + findViewById(R.id.ahc).getMeasuredWidth() + measureText;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("gift tray width over screen giftTrayViewWidth = ");
                        LIZ3.append(LIZ2);
                        C0NB.LIZIZ("MaxLength", X1D.LIZIZ(LIZ3));
                        if (LIZ2 >= C15380j0.LJIIL()) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("gift tray width over screen giftTrayViewWidth = ");
                            LIZ4.append(LIZ2);
                            C0NB.LIZIZ("BAGS", X1D.LIZIZ(LIZ4));
                            ((TextView) findViewById(R.id.jo8)).setMaxWidth(C15380j0.LIZ(86.0f) - ((int) (LIZ2 - C15380j0.LJIIL())));
                        }
                    }
                }
                ViewGroup viewGroup = this.LLD;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = this.LLD;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(1.0f);
                }
                C83741Wtl c83741Wtl = new C83741Wtl(0.33f, 0.0f, 0.67f, 1.0f);
                ViewGroup viewGroup3 = this.LLD;
                if (viewGroup3 != null && (animate = viewGroup3.animate()) != null && (scaleX = animate.scaleX(1.3f)) != null && (scaleY = scaleX.scaleY(1.3f)) != null && (duration = scaleY.setDuration(100L)) != null && (interpolator = duration.setInterpolator(c83741Wtl)) != null && (withEndAction = interpolator.withEndAction(new ARunnableS32S0200000_13(this, c83741Wtl, 135))) != null) {
                    withEndAction.start();
                }
                Handler handler = getHandler();
                if (handler != null) {
                    handler.removeCallbacks(this.LLFII);
                }
                Handler handler2 = getHandler();
                if (handler2 != null) {
                    handler2.postDelayed(this.LLFII, 2000L);
                }
                mGiftMsg2.LJIJJLI.remove(c78087Ukl);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("critical_show", "1");
                C32661Crp.LJI("gift_critical_strike_msg_show", jSONObject);
                return;
            }
            mGiftMsg2.LJIJJLI.clear();
            Handler handler3 = getHandler();
            if (handler3 != null) {
                handler3.removeCallbacks(this.LLFII);
            }
            ViewGroup viewGroup4 = this.LLD;
            if (viewGroup4 == null) {
                return;
            }
            viewGroup4.setVisibility(8);
        }
    }

    public final Runnable getCancelCriticalDisplay() {
        return this.LLFII;
    }

    public final long getShowTrayStartTime() {
        return this.LL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78078Ukc(Context context) {
        super(context);
        new LinkedHashMap();
        this.LLFFF = new ARunnableS49S0100000_13(this, 261);
        this.LLFII = new ARunnableS49S0100000_13(this, 260);
        this.LLFZ = new C78077Ukb(this, context);
    }

    @Override // X.AbstractC78073UkX
    public final EnumC78089Ukn LIZLLL(boolean z) {
        EnumC78089Ukn.Companion.getClass();
        if (z) {
            if (LiveMultiHostGiftTrayOptSetting.INSTANCE.isTinyGiftTray()) {
                return EnumC78089Ukn.MULTI_HOST_SMALL;
            }
            if (LiveMultiHostGiftTrayOptSetting.INSTANCE.isMediumGiftTray()) {
                return EnumC78089Ukn.MULTI_HOST_MEDIUM;
            }
        }
        return EnumC78089Ukn.ONE_HOST_MEDIUM_V3;
    }

    public final void LJIIL(C78112UlA c78112UlA) {
        HashSet<C78087Ukl> hashSet;
        Integer num;
        View mCombLayoutView;
        if (this.LLFF) {
            return;
        }
        EnumC78098Ukw enumC78098Ukw = c78112UlA.LIZIZ;
        if (enumC78098Ukw == EnumC78098Ukw.ENTER) {
            this.LL = System.currentTimeMillis();
            Handler handler = getHandler();
            if (handler != null) {
                handler.postDelayed(this.LLFFF, LiveGiftTrayDismissTimeoutSetting.INSTANCE.getValue() * 1000);
            }
            setGiftMessage(c78112UlA.LIZ);
            setCurrAnimator(C78079Ukd.LIZLLL(this, this.LLFZ, c78112UlA.LIZ, getDataChannel()));
            AbstractC78073UkX.LJIIIIZZ(this);
            setAlpha(1.0f);
            if (getMCombLayoutView() != null && (mCombLayoutView = getMCombLayoutView()) != null) {
                mCombLayoutView.setVisibility(8);
            }
            AnimatorSet currAnimator = getCurrAnimator();
            if (currAnimator != null) {
                currAnimator.start();
                return;
            }
            return;
        }
        if (enumC78098Ukw == EnumC78098Ukw.COMBO) {
            setMGiftMsg(c78112UlA.LIZ);
            C78072UkW mGiftMsg = getMGiftMsg();
            AnimatedDrawable2 animatedDrawable2 = null;
            if (mGiftMsg != null) {
                num = Integer.valueOf(mGiftMsg.LIZJ());
            } else {
                num = null;
            }
            LJIIJ(String.valueOf(num));
            if (getMCombLayoutView() != null) {
                setCurrAnimator(C78079Ukd.LIZJ(getMCombLayoutView(), this.LLFZ, getMGiftMsg(), getDataChannel()));
                AnimatorSet currAnimator2 = getCurrAnimator();
                if (currAnimator2 != null) {
                    currAnimator2.start();
                }
            } else if (getMCombCountTv() != null) {
                setCurrAnimator(C78079Ukd.LIZJ(getMCombCountTv(), this.LLFZ, getMGiftMsg(), getDataChannel()));
                AnimatorSet currAnimator3 = getCurrAnimator();
                if (currAnimator3 != null) {
                    currAnimator3.start();
                }
            }
            LJIILL();
            C78072UkW mGiftMsg2 = getMGiftMsg();
            if (mGiftMsg2 == null || mGiftMsg2.LJI != 3) {
                return;
            }
            C0NB.LIZIZ("LiveGiftTrayViewV2", "mGiftIconIv?.animate()?.start()");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("animated");
            C2A4 mGiftIconIv = getMGiftIconIv();
            if (mGiftIconIv != null) {
                animatedDrawable2 = mGiftIconIv.getAnimatedDrawable2();
            }
            LIZ.append(animatedDrawable2);
            C0NB.LIZIZ("LiveGiftTrayViewV2", X1D.LIZIZ(LIZ));
            Handler handler2 = getHandler();
            if (handler2 == null) {
                return;
            }
            handler2.post(new ARunnableS49S0100000_13(this, 262));
            return;
        }
        if (enumC78098Ukw != EnumC78098Ukw.EXIT) {
            return;
        }
        Handler handler3 = getHandler();
        if (handler3 != null) {
            handler3.removeCallbacks(this.LLFFF);
        }
        C78072UkW mGiftMsg3 = getMGiftMsg();
        if (mGiftMsg3 != null && (hashSet = mGiftMsg3.LJIJJLI) != null) {
            ORS.LJJLIIJ(hashSet, C78103Ul1.LJLIL);
        }
        C78110Ul8.LIZ.LIZJ(getMIndex(), getMGiftMsg(), Long.valueOf(System.currentTimeMillis() - this.LL), false, false);
        setCurrAnimator(C78079Ukd.LJ(this, this.LLFZ, c78112UlA.LIZ, getDataChannel()));
        AnimatorSet currAnimator4 = getCurrAnimator();
        if (currAnimator4 == null) {
            return;
        }
        currAnimator4.start();
    }

    public final void LJIILJJIL(boolean z) {
        Long l;
        int i;
        int i2;
        String str;
        int LIZIZ;
        boolean z2;
        int i3;
        int LIZ;
        C78105Ul3 c78105Ul3 = EnumC78089Ukn.Companion;
        EnumC78089Ukn currentStyle = getCurrentStyle();
        getDataChannel();
        c78105Ul3.getClass();
        if (C78105Ul3.LIZ(currentStyle)) {
            C29306Beo.LJJLJLI(getMGiftIconIv());
            C47121t6 firstGiftOrForYouTextView = getFirstGiftOrForYouTextView();
            if (firstGiftOrForYouTextView != null) {
                firstGiftOrForYouTextView.setText(getForYouText());
            }
            C29306Beo.LJJLJLI(getFirstGiftOrForYouTextView());
            InterfaceC78108Ul6 interfaceC78108Ul6 = this.LJZL;
            if (interfaceC78108Ul6 != null) {
                interfaceC78108Ul6.LIZ(getMGiftMsg());
                return;
            }
            return;
        }
        List<View> LJJIJIL = C47261Igj.LJJIJIL(getMGiftIconIv());
        ArrayList arrayList = new ArrayList();
        GiftManager inst = GiftManager.inst();
        C78072UkW mGiftMsg = getMGiftMsg();
        if (mGiftMsg != null) {
            l = Long.valueOf(mGiftMsg.LJJJJIZL);
        } else {
            l = null;
        }
        if (inst.getFreqLimitOption(l) != null) {
            arrayList.addAll(C47261Igj.LJII(getMCombCountTv(), getMCombMultiple()));
        } else {
            LJJIJIL.addAll(C47261Igj.LJII(getMCombCountTv(), getMCombMultiple()));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view != null) {
                view.setVisibility(8);
            }
        }
        C78072UkW mGiftMsg2 = getMGiftMsg();
        if (mGiftMsg2 != null) {
            i = mGiftMsg2.LJIIIZ;
        } else {
            i = 0;
        }
        C78072UkW mGiftMsg3 = getMGiftMsg();
        if (mGiftMsg3 != null) {
            i2 = mGiftMsg3.LJJJJLI;
        } else {
            i2 = 0;
        }
        int i4 = i * i2;
        java.util.Map<String, List<String>> value = LiveGiftTrayPriceColorSetting.INSTANCE.getValue();
        String str2 = "1";
        float f = 0.3f;
        for (String str3 : value.keySet()) {
            if (CastIntegerProtector.parseInt(str3) <= i4 && CastIntegerProtector.parseInt(str3) > CastIntegerProtector.parseInt(str2)) {
                f = 1.0f;
                str2 = str3;
            }
        }
        List<String> list = value.get(str2);
        if (list != null) {
            str = (String) ORZ.LJLLLL(list);
        } else {
            str = null;
        }
        Integer LIZLLL = C78080Uke.LIZLLL(str);
        if (LIZLLL != null) {
            LIZIZ = LIZLLL.intValue();
        } else {
            LIZIZ = C15380j0.LIZIZ(R.color.a02);
        }
        float[] fArr = new float[8];
        Arrays.fill(fArr, 120.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(LIZIZ);
        shapeDrawable.getPaint().setAlpha(O6R.LJJIIZ(f * 255));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        shapeDrawable.getPaint().setAntiAlias(true);
        setFirstGiftOrForYouTextBackground(shapeDrawable);
        C47121t6 firstGiftOrForYouTextView2 = getFirstGiftOrForYouTextView();
        if (firstGiftOrForYouTextView2 == null) {
            return;
        }
        C29306Beo.LJJLJLI(firstGiftOrForYouTextView2);
        InterfaceC78107Ul5 c78104Ul2 = new C78104Ul2(this);
        if (!z) {
            c78104Ul2 = this.LLFZ;
        }
        if (getCurrentStyle() == EnumC78089Ukn.MULTI_HOST_MEDIUM) {
            z2 = true;
        } else {
            z2 = false;
        }
        CharSequence forYouText = getForYouText();
        boolean LJIIZILJ = C15380j0.LJIIZILJ();
        if (LJIIZILJ) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        firstGiftOrForYouTextView2.setText(forYouText);
        C78079Ukd.LJFF(firstGiftOrForYouTextView2);
        for (View view2 : LJJIJIL) {
            if (view2 != null) {
                view2.setAlpha(0.0f);
                view2.setVisibility(0);
            }
        }
        ObjectAnimator LIZ2 = C0F0.LIZ(firstGiftOrForYouTextView2, View.ALPHA, new float[]{0.0f, 1.0f}, 66L, "ofFloat(firstGiftView, V…         .setDuration(66)");
        LIZ2.setInterpolator(new C83741Wtl(0.0f, 0.0f, 1.0f, 1.0f));
        AnimatorSet LIZIZ2 = C78079Ukd.LIZIZ(firstGiftOrForYouTextView2);
        LIZIZ2.setStartDelay(33L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(1333L);
        ObjectAnimator LIZ3 = C0F0.LIZ(firstGiftOrForYouTextView2, View.SCALE_X, new float[]{1.0f, 0.5f}, 270L, "ofFloat(firstGiftView, V…, 0.50f).setDuration(270)");
        LIZ3.setInterpolator(new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f));
        ObjectAnimator LIZ4 = C0F0.LIZ(firstGiftOrForYouTextView2, View.SCALE_Y, new float[]{1.0f, 0.5f}, 270L, "ofFloat(firstGiftView, V…, 0.50f).setDuration(270)");
        LIZ4.setInterpolator(new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f));
        if (z2) {
            LIZ = C15380j0.LIZ(30.0f);
        } else {
            LIZ = C15380j0.LIZ(55.0f);
        }
        ObjectAnimator LIZ5 = C0F0.LIZ(firstGiftOrForYouTextView2, View.TRANSLATION_X, new float[]{0.0f, i3 * LIZ}, 270L, "ofFloat(\n            fir…        .setDuration(270)");
        LIZ5.setInterpolator(new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f));
        ObjectAnimator LIZ6 = C0F0.LIZ(firstGiftOrForYouTextView2, View.TRANSLATION_Y, new float[]{0.0f, -C15380j0.LIZ(6.0f)}, 270L, "ofFloat(\n            fir…        .setDuration(270)");
        LIZ6.setInterpolator(new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f));
        animatorSet.addListener(new C78123UlL(animatorSet, firstGiftOrForYouTextView2, LJIIZILJ));
        animatorSet.playTogether(LIZ3, LIZ4, LIZ5, LIZ6);
        int size = LJJIJIL.size();
        ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[size];
        int size2 = LJJIJIL.size();
        for (int i5 = 0; i5 < size2; i5++) {
            objectAnimatorArr[i5] = C78079Ukd.LIZ((View) ListProtector.get(LJJIJIL, i5));
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setStartDelay(1403L);
        animatorSet2.playTogether((Animator[]) Arrays.copyOf(objectAnimatorArr, size));
        animatorSet2.setDuration(260L);
        Handler handler = firstGiftOrForYouTextView2.getHandler();
        if (handler != null) {
            handler.postDelayed(new ARunnableS45S0100000_9((Object) firstGiftOrForYouTextView2, 267), 1503L);
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        if (z) {
            animatorSet3.addListener(new C78097Ukv(EnumC78092Ukq.FIRST, c78104Ul2));
        } else {
            animatorSet3.addListener(new C78097Ukv(EnumC78092Ukq.COMB, c78104Ul2));
        }
        animatorSet3.playTogether(LIZ2, LIZIZ2, animatorSet, animatorSet2);
        setCurrAnimator(animatorSet3);
        AnimatorSet currAnimator = getCurrAnimator();
        if (currAnimator == null) {
            return;
        }
        currAnimator.start();
    }

    public final void setDisplayCallback(InterfaceC78108Ul6 interfaceC78108Ul6) {
        this.LJZL = interfaceC78108Ul6;
    }

    public final void setShowTrayStartTime(long j) {
        this.LL = j;
    }
}
