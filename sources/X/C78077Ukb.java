package X;

import Y.ARunnableS45S0100000_9;
import Y.IDAListenerS2S0110000_4;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.FirstGiftQuickComment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ukb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78077Ukb implements InterfaceC78107Ul5 {
    public final /* synthetic */ C78078Ukc LIZ;
    public final /* synthetic */ Context LIZIZ;

    @Override // X.InterfaceC78107Ul5
    public final void LJFF() {
    }

    @Override // X.InterfaceC78107Ul5
    public final void LIZ() {
        String forYouText;
        C47121t6 firstGiftOrForYouTextView;
        String forYouText2;
        int i;
        String forYouText3;
        int i2;
        Long l;
        if (UC0.LJJIIZI(this.LIZ.getMGiftMsg()) || UC0.LJJL(this.LIZ.getMGiftMsg())) {
            C2A4 mGiftIconIv = this.LIZ.getMGiftIconIv();
            if (mGiftIconIv != null) {
                mGiftIconIv.setVisibility(4);
            }
            TextView mCombCountTv = this.LIZ.getMCombCountTv();
            if (mCombCountTv != null) {
                mCombCountTv.setVisibility(8);
            }
            C47121t6 mCombMultiple = this.LIZ.getMCombMultiple();
            if (mCombMultiple != null) {
                mCombMultiple.setVisibility(8);
            }
            int i3 = 0;
            if (this.LIZ.LJIILIIL()) {
                C47121t6 firstGiftOrForYouTextView2 = this.LIZ.getFirstGiftOrForYouTextView();
                if (firstGiftOrForYouTextView2 != null) {
                    if (UC0.LJJIIZI(this.LIZ.getMGiftMsg())) {
                        forYouText3 = this.LIZ.getFirstGiftText();
                    } else {
                        forYouText3 = this.LIZ.getForYouText();
                    }
                    firstGiftOrForYouTextView2.setText(forYouText3);
                }
                C78072UkW mGiftMsg = this.LIZ.getMGiftMsg();
                if (mGiftMsg != null) {
                    i2 = mGiftMsg.LJIIIZ;
                } else {
                    i2 = 0;
                }
                C78072UkW mGiftMsg2 = this.LIZ.getMGiftMsg();
                if (mGiftMsg2 != null) {
                    i3 = mGiftMsg2.LJJJJLI;
                }
                int i4 = i2 * i3;
                C47121t6 firstGiftOrForYouTextView3 = this.LIZ.getFirstGiftOrForYouTextView();
                if (firstGiftOrForYouTextView3 != null) {
                    firstGiftOrForYouTextView3.setBackground(C78080Uke.LIZIZ(i4, this.LIZIZ));
                }
                C47121t6 firstGiftOrForYouTextView4 = this.LIZ.getFirstGiftOrForYouTextView();
                if (firstGiftOrForYouTextView4 != null) {
                    firstGiftOrForYouTextView4.setScaleX(0.5f);
                }
                C47121t6 firstGiftOrForYouTextView5 = this.LIZ.getFirstGiftOrForYouTextView();
                if (firstGiftOrForYouTextView5 != null) {
                    firstGiftOrForYouTextView5.setScaleY(0.5f);
                }
                if (C15380j0.LJIIZILJ()) {
                    C47121t6 firstGiftOrForYouTextView6 = this.LIZ.getFirstGiftOrForYouTextView();
                    if (firstGiftOrForYouTextView6 != null) {
                        firstGiftOrForYouTextView6.setTranslationX(-114.0f);
                    }
                } else {
                    C47121t6 firstGiftOrForYouTextView7 = this.LIZ.getFirstGiftOrForYouTextView();
                    if (firstGiftOrForYouTextView7 != null) {
                        firstGiftOrForYouTextView7.setTranslationX(114.0f);
                    }
                }
                C47121t6 firstGiftOrForYouTextView8 = this.LIZ.getFirstGiftOrForYouTextView();
                if (firstGiftOrForYouTextView8 != null) {
                    firstGiftOrForYouTextView8.setTranslationY(-16.0f);
                }
                C47121t6 firstGiftOrForYouTextView9 = this.LIZ.getFirstGiftOrForYouTextView();
                if (firstGiftOrForYouTextView9 != null) {
                    firstGiftOrForYouTextView9.setPivotX(0.0f);
                }
                C47121t6 firstGiftOrForYouTextView10 = this.LIZ.getFirstGiftOrForYouTextView();
                if (firstGiftOrForYouTextView10 != null) {
                    firstGiftOrForYouTextView10.setPivotY(0.0f);
                }
                C47121t6 firstGiftOrForYouTextView11 = this.LIZ.getFirstGiftOrForYouTextView();
                if (firstGiftOrForYouTextView11 != null) {
                    C29306Beo.LJJLJLI(firstGiftOrForYouTextView11);
                }
            } else {
                C78105Ul3 c78105Ul3 = EnumC78089Ukn.Companion;
                EnumC78089Ukn currentStyle = this.LIZ.getCurrentStyle();
                this.LIZ.getDataChannel();
                c78105Ul3.getClass();
                if (C78105Ul3.LIZ(currentStyle)) {
                    C47121t6 firstGiftOrForYouTextView12 = this.LIZ.getFirstGiftOrForYouTextView();
                    if (firstGiftOrForYouTextView12 != null) {
                        if (UC0.LJJIIZI(this.LIZ.getMGiftMsg())) {
                            forYouText2 = this.LIZ.getFirstGiftText();
                        } else {
                            forYouText2 = this.LIZ.getForYouText();
                        }
                        firstGiftOrForYouTextView12.setText(forYouText2);
                    }
                    C47121t6 firstGiftOrForYouTextView13 = this.LIZ.getFirstGiftOrForYouTextView();
                    if (firstGiftOrForYouTextView13 != null) {
                        C29306Beo.LJJLJLI(firstGiftOrForYouTextView13);
                    }
                    C78072UkW mGiftMsg3 = this.LIZ.getMGiftMsg();
                    if (mGiftMsg3 != null) {
                        i = mGiftMsg3.LJIIIZ;
                    } else {
                        i = 0;
                    }
                    C78072UkW mGiftMsg4 = this.LIZ.getMGiftMsg();
                    if (mGiftMsg4 != null) {
                        i3 = mGiftMsg4.LJJJJLI;
                    }
                    int i5 = i * i3;
                    C47121t6 firstGiftOrForYouTextView14 = this.LIZ.getFirstGiftOrForYouTextView();
                    if (firstGiftOrForYouTextView14 != null) {
                        firstGiftOrForYouTextView14.setBackground(C78080Uke.LIZIZ(i5, this.LIZIZ));
                    }
                } else {
                    C47121t6 firstGiftOrForYouTextView15 = this.LIZ.getFirstGiftOrForYouTextView();
                    if (firstGiftOrForYouTextView15 != null) {
                        if (UC0.LJJIIZI(this.LIZ.getMGiftMsg())) {
                            forYouText = this.LIZ.getFirstGiftText();
                        } else {
                            forYouText = this.LIZ.getForYouText();
                        }
                        firstGiftOrForYouTextView15.setText(forYouText);
                    }
                    C47121t6 firstGiftOrForYouTextView16 = this.LIZ.getFirstGiftOrForYouTextView();
                    if (firstGiftOrForYouTextView16 != null) {
                        firstGiftOrForYouTextView16.setVisibility(0);
                    }
                    C47121t6 firstGiftOrForYouTextView17 = this.LIZ.getFirstGiftOrForYouTextView();
                    if (firstGiftOrForYouTextView17 != null) {
                        firstGiftOrForYouTextView17.setTranslationX(0.0f);
                    }
                    C47121t6 firstGiftOrForYouTextView18 = this.LIZ.getFirstGiftOrForYouTextView();
                    if (firstGiftOrForYouTextView18 != null) {
                        firstGiftOrForYouTextView18.setTranslationY(0.0f);
                    }
                    C47121t6 firstGiftOrForYouTextView19 = this.LIZ.getFirstGiftOrForYouTextView();
                    if (firstGiftOrForYouTextView19 != null) {
                        firstGiftOrForYouTextView19.setAlpha(0.0f);
                    }
                    C47121t6 firstGiftOrForYouTextView20 = this.LIZ.getFirstGiftOrForYouTextView();
                    if (firstGiftOrForYouTextView20 != null) {
                        firstGiftOrForYouTextView20.setScaleX(1.3f);
                    }
                    C47121t6 firstGiftOrForYouTextView21 = this.LIZ.getFirstGiftOrForYouTextView();
                    if (firstGiftOrForYouTextView21 != null) {
                        firstGiftOrForYouTextView21.setScaleY(1.3f);
                    }
                    C47121t6 firstGiftOrForYouTextView22 = this.LIZ.getFirstGiftOrForYouTextView();
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    if (firstGiftOrForYouTextView22 != null) {
                        firstGiftOrForYouTextView22.measure(makeMeasureSpec, makeMeasureSpec);
                        i3 = firstGiftOrForYouTextView22.getMeasuredWidth();
                    }
                    if (i3 > C15380j0.LIZ(160.0f) && (firstGiftOrForYouTextView = this.LIZ.getFirstGiftOrForYouTextView()) != null) {
                        firstGiftOrForYouTextView.setTextSize(15.0f);
                    }
                }
            }
        } else {
            C47121t6 firstGiftOrForYouTextView23 = this.LIZ.getFirstGiftOrForYouTextView();
            if (firstGiftOrForYouTextView23 != null) {
                firstGiftOrForYouTextView23.setVisibility(8);
            }
            this.LIZ.LJIILL();
        }
        GiftManager inst = GiftManager.inst();
        C78072UkW mGiftMsg5 = this.LIZ.getMGiftMsg();
        if (mGiftMsg5 != null) {
            l = Long.valueOf(mGiftMsg5.LJJJJIZL);
        } else {
            l = null;
        }
        if (inst.getFreqLimitOption(l) != null) {
            C47121t6 mCombMultiple2 = this.LIZ.getMCombMultiple();
            if (mCombMultiple2 != null) {
                mCombMultiple2.setVisibility(8);
            }
            TextView mCombCountTv2 = this.LIZ.getMCombCountTv();
            if (mCombCountTv2 == null) {
                return;
            }
            mCombCountTv2.setVisibility(8);
        }
    }

    @Override // X.InterfaceC78107Ul5
    public final void LIZIZ() {
        Long l;
        DataChannel dataChannel;
        User user;
        GiftMessage giftMessage;
        User user2;
        boolean z;
        int i;
        int LIZ;
        AnimatorSet animatorSet;
        boolean z2;
        int i2;
        int LIZ2;
        final C47121t6 firstGiftOrForYouTextView;
        C78078Ukc c78078Ukc = this.LIZ;
        InterfaceC78108Ul6 interfaceC78108Ul6 = c78078Ukc.LJZL;
        if (interfaceC78108Ul6 != null) {
            interfaceC78108Ul6.LIZLLL(c78078Ukc.getMGiftMsg());
        }
        if (UC0.LJJIIZI(this.LIZ.getMGiftMsg()) && this.LIZ.getFirstGiftOrForYouTextView() != null) {
            if (this.LIZ.LJIILIIL()) {
                LJ();
                LIZLLL();
                return;
            }
            C78105Ul3 c78105Ul3 = EnumC78089Ukn.Companion;
            EnumC78089Ukn currentStyle = this.LIZ.getCurrentStyle();
            this.LIZ.getDataChannel();
            c78105Ul3.getClass();
            if (C78105Ul3.LIZ(currentStyle)) {
                LJ();
                LIZLLL();
                if (!UC0.LJJL(this.LIZ.getMGiftMsg()) || (firstGiftOrForYouTextView = this.LIZ.getFirstGiftOrForYouTextView()) == null) {
                    return;
                }
                C78078Ukc c78078Ukc2 = this.LIZ;
                final String firstGiftText = c78078Ukc2.getFirstGiftText();
                final String forYouText = c78078Ukc2.getForYouText();
                AnimatorSet animatorSet2 = new AnimatorSet();
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setStartDelay(1000L);
                animatorSet3.playTogether(ObjectAnimator.ofFloat(firstGiftOrForYouTextView, (Property<C47121t6, Float>) View.SCALE_X, 1.0f, 0.6f), ObjectAnimator.ofFloat(firstGiftOrForYouTextView, (Property<C47121t6, Float>) View.SCALE_Y, 1.0f, 0.6f), ObjectAnimator.ofFloat(firstGiftOrForYouTextView, (Property<C47121t6, Float>) View.ALPHA, 1.0f, 0.0f));
                animatorSet3.setDuration(125L);
                animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: X.9YU
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        C47121t6.this.setText(forYouText);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        C47121t6.this.setText(firstGiftText);
                    }
                });
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat(firstGiftOrForYouTextView, (Property<C47121t6, Float>) View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(firstGiftOrForYouTextView, (Property<C47121t6, Float>) View.SCALE_Y, 0.6f, 1.0f), ObjectAnimator.ofFloat(firstGiftOrForYouTextView, (Property<C47121t6, Float>) View.ALPHA, 0.0f, 1.0f));
                animatorSet4.setDuration(125L);
                animatorSet2.playSequentially(animatorSet3, animatorSet4);
                animatorSet2.start();
                return;
            }
            List<View> LJJIJIL = C47261Igj.LJJIJIL(this.LIZ.getMGiftIconIv());
            ArrayList arrayList = new ArrayList();
            GiftManager inst = GiftManager.inst();
            C78072UkW mGiftMsg = this.LIZ.getMGiftMsg();
            if (mGiftMsg != null) {
                l = Long.valueOf(mGiftMsg.LJJJJIZL);
            } else {
                l = null;
            }
            if (inst.getFreqLimitOption(l) != null) {
                arrayList.addAll(C47261Igj.LJII(this.LIZ.getMCombCountTv(), this.LIZ.getMCombMultiple()));
            } else {
                LJJIJIL.addAll(C47261Igj.LJII(this.LIZ.getMCombCountTv(), this.LIZ.getMCombMultiple()));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            final C47121t6 firstGiftOrForYouTextView2 = this.LIZ.getFirstGiftOrForYouTextView();
            if (firstGiftOrForYouTextView2 != null) {
                if (UC0.LJJL(this.LIZ.getMGiftMsg())) {
                    if (this.LIZ.getCurrentStyle() == EnumC78089Ukn.MULTI_HOST_MEDIUM) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String firstGiftText2 = this.LIZ.getFirstGiftText();
                    final String forYouText2 = this.LIZ.getForYouText();
                    boolean LJIIZILJ = C15380j0.LJIIZILJ();
                    if (LJIIZILJ) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    firstGiftOrForYouTextView2.setText(firstGiftText2);
                    C78079Ukd.LJFF(firstGiftOrForYouTextView2);
                    for (View view2 : LJJIJIL) {
                        if (view2 != null) {
                            view2.setAlpha(0.0f);
                            view2.setVisibility(0);
                        }
                    }
                    ObjectAnimator LIZ3 = C0F0.LIZ(firstGiftOrForYouTextView2, View.ALPHA, new float[]{0.0f, 1.0f}, 66L, "ofFloat(firstGiftView, V…         .setDuration(66)");
                    LIZ3.setInterpolator(new C83741Wtl(0.0f, 0.0f, 1.0f, 1.0f));
                    AnimatorSet LIZIZ = C78079Ukd.LIZIZ(firstGiftOrForYouTextView2);
                    LIZIZ.setStartDelay(33L);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.setStartDelay(1333L);
                    animatorSet5.setDuration(200L);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(firstGiftOrForYouTextView2, (Property<C47121t6, Float>) View.SCALE_X, 1.0f, 0.6f), ObjectAnimator.ofFloat(firstGiftOrForYouTextView2, (Property<C47121t6, Float>) View.SCALE_Y, 1.0f, 0.6f), ObjectAnimator.ofFloat(firstGiftOrForYouTextView2, (Property<C47121t6, Float>) View.ALPHA, 1.0f, 0.0f));
                    animatorSet5.addListener(new AnimatorListenerAdapter() { // from class: X.9YT
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animation) {
                            o.LJIIIZ(animation, "animation");
                            C47121t6.this.setText(forYouText2);
                        }
                    });
                    ObjectAnimator duration = ObjectAnimator.ofFloat(firstGiftOrForYouTextView2, (Property<C47121t6, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(66L);
                    o.LJIIIIZZ(duration, "ofFloat(firstGiftView, V…         .setDuration(66)");
                    duration.setStartDelay(1533L);
                    AnimatorSet LIZIZ2 = C78079Ukd.LIZIZ(firstGiftOrForYouTextView2);
                    LIZIZ2.setStartDelay(1566L);
                    AnimatorSet animatorSet6 = new AnimatorSet();
                    animatorSet6.setStartDelay(2899L);
                    ObjectAnimator LIZ4 = C0F0.LIZ(firstGiftOrForYouTextView2, View.SCALE_X, new float[]{1.0f, 0.5f}, 270L, "ofFloat(firstGiftView, V…, 0.50f).setDuration(270)");
                    LIZ4.setInterpolator(new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f));
                    ObjectAnimator LIZ5 = C0F0.LIZ(firstGiftOrForYouTextView2, View.SCALE_Y, new float[]{1.0f, 0.5f}, 270L, "ofFloat(firstGiftView, V…, 0.50f).setDuration(270)");
                    LIZ5.setInterpolator(new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f));
                    if (z2) {
                        LIZ2 = C15380j0.LIZ(30.0f);
                    } else {
                        LIZ2 = C15380j0.LIZ(55.0f);
                    }
                    ObjectAnimator LIZ6 = C0F0.LIZ(firstGiftOrForYouTextView2, View.TRANSLATION_X, new float[]{0.0f, i2 * LIZ2}, 270L, "ofFloat(\n            fir…        .setDuration(270)");
                    LIZ6.setInterpolator(new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f));
                    ObjectAnimator LIZ7 = C0F0.LIZ(firstGiftOrForYouTextView2, View.TRANSLATION_Y, new float[]{0.0f, -C15380j0.LIZ(6.0f)}, 270L, "ofFloat(\n            fir…        .setDuration(270)");
                    LIZ7.setInterpolator(new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f));
                    animatorSet6.addListener(new C78124UlM(animatorSet6, firstGiftOrForYouTextView2, LJIIZILJ));
                    animatorSet6.playTogether(LIZ4, LIZ5, LIZ6, LIZ7);
                    int size = LJJIJIL.size();
                    ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[size];
                    int size2 = LJJIJIL.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        objectAnimatorArr[i3] = C78079Ukd.LIZ((View) ListProtector.get(LJJIJIL, i3));
                    }
                    AnimatorSet animatorSet7 = new AnimatorSet();
                    animatorSet7.setStartDelay(2969L);
                    animatorSet7.playTogether((Animator[]) Arrays.copyOf(objectAnimatorArr, size));
                    animatorSet7.setDuration(260L);
                    Handler handler = firstGiftOrForYouTextView2.getHandler();
                    if (handler != null) {
                        handler.postDelayed(new ARunnableS45S0100000_9((Object) firstGiftOrForYouTextView2, 265), 3069L);
                    }
                    animatorSet = new AnimatorSet();
                    animatorSet.addListener(new C78097Ukv(EnumC78092Ukq.FIRST, this));
                    animatorSet.playTogether(LIZ3, LIZIZ, animatorSet5, LIZIZ2, duration, animatorSet6, animatorSet7);
                } else {
                    if (this.LIZ.getCurrentStyle() == EnumC78089Ukn.MULTI_HOST_MEDIUM) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String firstGiftText3 = this.LIZ.getFirstGiftText();
                    boolean LJIIZILJ2 = C15380j0.LJIIZILJ();
                    if (LJIIZILJ2) {
                        i = -1;
                    } else {
                        i = 1;
                    }
                    firstGiftOrForYouTextView2.setText(firstGiftText3);
                    C78079Ukd.LJFF(firstGiftOrForYouTextView2);
                    for (View view3 : LJJIJIL) {
                        if (view3 != null) {
                            view3.setAlpha(0.0f);
                            view3.setVisibility(0);
                        }
                    }
                    ObjectAnimator LIZ8 = C0F0.LIZ(firstGiftOrForYouTextView2, View.ALPHA, new float[]{0.0f, 1.0f}, 66L, "ofFloat(firstGiftView, V…         .setDuration(66)");
                    LIZ8.setInterpolator(new C83741Wtl(0.0f, 0.0f, 1.0f, 1.0f));
                    ObjectAnimator LIZ9 = C0F0.LIZ(firstGiftOrForYouTextView2, View.SCALE_X, new float[]{1.3f, 0.83f}, 100L, "ofFloat(firstGiftView, V…, 0.83f).setDuration(100)");
                    ObjectAnimator LIZ10 = C0F0.LIZ(firstGiftOrForYouTextView2, View.SCALE_Y, new float[]{1.3f, 0.83f}, 100L, "ofFloat(firstGiftView, V…, 0.83f).setDuration(100)");
                    ObjectAnimator LIZ11 = C0F0.LIZ(firstGiftOrForYouTextView2, View.SCALE_X, new float[]{0.83f, 1.1f}, 100L, "ofFloat(firstGiftView, V…f, 1.1f).setDuration(100)");
                    ObjectAnimator LIZ12 = C0F0.LIZ(firstGiftOrForYouTextView2, View.SCALE_Y, new float[]{0.83f, 1.1f}, 100L, "ofFloat(firstGiftView, V…f, 1.1f).setDuration(100)");
                    ObjectAnimator LIZ13 = C0F0.LIZ(firstGiftOrForYouTextView2, View.SCALE_X, new float[]{1.1f, 1.0f}, 100L, "ofFloat(firstGiftView, V…f, 1.0f).setDuration(100)");
                    ObjectAnimator LIZ14 = C0F0.LIZ(firstGiftOrForYouTextView2, View.SCALE_Y, new float[]{1.1f, 1.0f}, 100L, "ofFloat(firstGiftView, V…f, 1.0f).setDuration(100)");
                    AnimatorSet animatorSet8 = new AnimatorSet();
                    animatorSet8.setInterpolator(new C83741Wtl(0.0f, 0.0f, 1.0f, 1.0f));
                    animatorSet8.playTogether(LIZ9, LIZ10);
                    AnimatorSet animatorSet9 = new AnimatorSet();
                    animatorSet9.setInterpolator(new C83741Wtl(0.0f, 0.0f, 1.0f, 1.0f));
                    animatorSet9.playTogether(LIZ11, LIZ12);
                    AnimatorSet animatorSet10 = new AnimatorSet();
                    animatorSet10.setInterpolator(new C83741Wtl(0.0f, 0.0f, 1.0f, 1.0f));
                    animatorSet10.playTogether(LIZ13, LIZ14);
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    animatorSet11.setStartDelay(33L);
                    animatorSet11.setInterpolator(new C83741Wtl(0.0f, 0.0f, 1.0f, 1.0f));
                    animatorSet11.playSequentially(animatorSet8, animatorSet9, animatorSet10);
                    AnimatorSet animatorSet12 = new AnimatorSet();
                    animatorSet12.setStartDelay(1333L);
                    ObjectAnimator LIZ15 = C0F0.LIZ(firstGiftOrForYouTextView2, View.SCALE_X, new float[]{1.0f, 0.5f}, 270L, "ofFloat(firstGiftView, V…, 0.50f).setDuration(270)");
                    LIZ15.setInterpolator(new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f));
                    ObjectAnimator LIZ16 = C0F0.LIZ(firstGiftOrForYouTextView2, View.SCALE_Y, new float[]{1.0f, 0.5f}, 270L, "ofFloat(firstGiftView, V…, 0.50f).setDuration(270)");
                    LIZ16.setInterpolator(new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f));
                    if (z) {
                        LIZ = C15380j0.LIZ(30.0f);
                    } else {
                        LIZ = C15380j0.LIZ(55.0f);
                    }
                    ObjectAnimator LIZ17 = C0F0.LIZ(firstGiftOrForYouTextView2, View.TRANSLATION_X, new float[]{0.0f, i * LIZ}, 270L, "ofFloat(\n            fir…        .setDuration(270)");
                    LIZ17.setInterpolator(new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f));
                    ObjectAnimator LIZ18 = C0F0.LIZ(firstGiftOrForYouTextView2, View.TRANSLATION_Y, new float[]{0.0f, -C15380j0.LIZ(6.0f)}, 270L, "ofFloat(\n            fir…        .setDuration(270)");
                    LIZ18.setInterpolator(new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f));
                    animatorSet12.addListener(new IDAListenerS2S0110000_4(firstGiftOrForYouTextView2, LJIIZILJ2, 8));
                    animatorSet12.playTogether(LIZ15, LIZ16, LIZ17, LIZ18);
                    int size3 = LJJIJIL.size();
                    ObjectAnimator[] objectAnimatorArr2 = new ObjectAnimator[size3];
                    int size4 = LJJIJIL.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        objectAnimatorArr2[i4] = C78079Ukd.LIZ((View) ListProtector.get(LJJIJIL, i4));
                    }
                    AnimatorSet animatorSet13 = new AnimatorSet();
                    animatorSet13.setStartDelay(1403L);
                    animatorSet13.playTogether((Animator[]) Arrays.copyOf(objectAnimatorArr2, size3));
                    animatorSet13.setDuration(260L);
                    Handler handler2 = firstGiftOrForYouTextView2.getHandler();
                    if (handler2 != null) {
                        handler2.postDelayed(new ARunnableS45S0100000_9((Object) firstGiftOrForYouTextView2, 266), 1503L);
                    }
                    animatorSet = new AnimatorSet();
                    animatorSet.addListener(new C78097Ukv(EnumC78092Ukq.FIRST, this));
                    animatorSet.playTogether(LIZ8, animatorSet11, animatorSet12, animatorSet13);
                }
                animatorSet.start();
            }
            C78072UkW mGiftMsg2 = this.LIZ.getMGiftMsg();
            if ((mGiftMsg2 != null && (giftMessage = mGiftMsg2.LIZ) != null && (user2 = giftMessage.fromUser) != null && user2.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) || (dataChannel = this.LIZ.getDataChannel()) == null) {
                return;
            }
            C78072UkW mGiftMsg3 = this.LIZ.getMGiftMsg();
            if (mGiftMsg3 != null) {
                user = mGiftMsg3.LJJJJJ;
            } else {
                user = null;
            }
            String LIZ19 = C05170If.LIZ(user);
            o.LJIIIIZZ(LIZ19, "getDisplayName(mGiftMsg?.mFromUser)");
            dataChannel.rv0(FirstGiftQuickComment.class, LIZ19);
            return;
        }
        LIZLLL();
    }

    @Override // X.InterfaceC78107Ul5
    public final void LIZJ() {
        TransitionDrawable transitionDrawable;
        AbstractC78073UkX.LJIIIIZZ(this.LIZ);
        C47121t6 firstGiftOrForYouTextView = this.LIZ.getFirstGiftOrForYouTextView();
        if (firstGiftOrForYouTextView != null) {
            firstGiftOrForYouTextView.setScaleX(1.0f);
        }
        C47121t6 firstGiftOrForYouTextView2 = this.LIZ.getFirstGiftOrForYouTextView();
        if (firstGiftOrForYouTextView2 != null) {
            firstGiftOrForYouTextView2.setText("");
        }
        C47121t6 firstGiftOrForYouTextView3 = this.LIZ.getFirstGiftOrForYouTextView();
        Drawable drawable = null;
        if (firstGiftOrForYouTextView3 != null) {
            drawable = firstGiftOrForYouTextView3.getBackground();
        }
        if ((drawable instanceof TransitionDrawable) && (transitionDrawable = (TransitionDrawable) drawable) != null) {
            C78078Ukc c78078Ukc = this.LIZ;
            Context context = this.LIZIZ;
            transitionDrawable.resetTransition();
            c78078Ukc.setFirstGiftOrForYouTextBackground(context.getDrawable(R.drawable.cdp));
        }
        InterfaceC78108Ul6 interfaceC78108Ul6 = this.LIZ.LJZL;
        if (interfaceC78108Ul6 != null) {
            interfaceC78108Ul6.LIZIZ();
        }
        ViewGroup viewGroup = this.LIZ.LLD;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        Handler handler = this.LIZ.getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.LIZ.getCancelCriticalDisplay());
        }
    }

    @Override // X.InterfaceC78107Ul5
    public final void LIZLLL() {
        Long l;
        if (!C78062UkM.LIZJ(this.LIZ.getMGiftMsg()) && this.LIZ.getMCombLayoutView() != null) {
            View mCombLayoutView = this.LIZ.getMCombLayoutView();
            if (mCombLayoutView != null) {
                mCombLayoutView.setVisibility(0);
            }
            GiftManager inst = GiftManager.inst();
            C78072UkW mGiftMsg = this.LIZ.getMGiftMsg();
            if (mGiftMsg != null) {
                l = Long.valueOf(mGiftMsg.LJJJJIZL);
            } else {
                l = null;
            }
            if (inst.getFreqLimitOption(l) == null) {
                C47121t6 mCombMultiple = this.LIZ.getMCombMultiple();
                if (mCombMultiple != null) {
                    mCombMultiple.setVisibility(0);
                }
                TextView mCombCountTv = this.LIZ.getMCombCountTv();
                if (mCombCountTv != null) {
                    mCombCountTv.setVisibility(0);
                }
            } else {
                C47121t6 mCombMultiple2 = this.LIZ.getMCombMultiple();
                if (mCombMultiple2 != null) {
                    mCombMultiple2.setVisibility(8);
                }
                TextView mCombCountTv2 = this.LIZ.getMCombCountTv();
                if (mCombCountTv2 != null) {
                    mCombCountTv2.setVisibility(8);
                }
            }
            if (UC0.LJJL(this.LIZ.getMGiftMsg()) && !UC0.LJJIIZI(this.LIZ.getMGiftMsg())) {
                this.LIZ.LJIILJJIL(false);
                return;
            }
            C78078Ukc c78078Ukc = this.LIZ;
            c78078Ukc.setCurrAnimator(C78079Ukd.LIZJ(c78078Ukc.getMCombCountTv(), this, this.LIZ.getMGiftMsg(), this.LIZ.getDataChannel()));
            AnimatorSet currAnimator = this.LIZ.getCurrAnimator();
            if (currAnimator == null) {
                return;
            }
            currAnimator.start();
            return;
        }
        if (UC0.LJJL(this.LIZ.getMGiftMsg()) && !UC0.LJJIIZI(this.LIZ.getMGiftMsg())) {
            this.LIZ.LJIILJJIL(true);
            return;
        }
        C78078Ukc c78078Ukc2 = this.LIZ;
        InterfaceC78108Ul6 interfaceC78108Ul6 = c78078Ukc2.LJZL;
        if (interfaceC78108Ul6 == null) {
            return;
        }
        interfaceC78108Ul6.LIZJ(c78078Ukc2.getMGiftMsg());
    }

    public final void LJ() {
        Long l;
        TextView mCombCountTv = this.LIZ.getMCombCountTv();
        if (mCombCountTv != null) {
            mCombCountTv.setVisibility(0);
        }
        C47121t6 mCombMultiple = this.LIZ.getMCombMultiple();
        if (mCombMultiple != null) {
            mCombMultiple.setVisibility(0);
        }
        C2A4 mGiftIconIv = this.LIZ.getMGiftIconIv();
        if (mGiftIconIv != null) {
            mGiftIconIv.setVisibility(0);
        }
        GiftManager inst = GiftManager.inst();
        C78072UkW mGiftMsg = this.LIZ.getMGiftMsg();
        if (mGiftMsg != null) {
            l = Long.valueOf(mGiftMsg.LJJJJIZL);
        } else {
            l = null;
        }
        if (inst.getFreqLimitOption(l) != null) {
            C47121t6 mCombMultiple2 = this.LIZ.getMCombMultiple();
            if (mCombMultiple2 != null) {
                mCombMultiple2.setVisibility(8);
            }
            TextView mCombCountTv2 = this.LIZ.getMCombCountTv();
            if (mCombCountTv2 == null) {
                return;
            }
            mCombCountTv2.setVisibility(8);
        }
    }

    @Override // X.InterfaceC78107Ul5
    public final void LJI() {
        C78078Ukc c78078Ukc = this.LIZ;
        c78078Ukc.getClass();
        InterfaceC78108Ul6 interfaceC78108Ul6 = c78078Ukc.LJZL;
        if (interfaceC78108Ul6 != null) {
            interfaceC78108Ul6.LIZ(c78078Ukc.getMGiftMsg());
        }
    }

    public C78077Ukb(C78078Ukc c78078Ukc, Context context) {
        this.LIZ = c78078Ukc;
        this.LIZIZ = context;
    }
}
