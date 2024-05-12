package X;

import Y.ACListenerS51S0000000_3;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyNotice;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyNoticeAction;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.8GG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8GG extends LinearLayout implements InterfaceC54232LQe {
    public PolicyNotice LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;

    public final void LIZ() {
        EventBus.LIZJ().LJIJ(this);
        setVisibility(8);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, getHeight()));
        animationSet.setDuration(300L);
        startAnimation(animationSet);
    }

    @Override // X.InterfaceC54232LQe
    public int getToastVisibility() {
        return getVisibility();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8GG(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C56642Ke broadCastEvent) {
        o.LJIIIZ(broadCastEvent, "broadCastEvent");
        if (!TextUtils.equals(broadCastEvent.LJLIL.optString("eventName"), "cancel_post_success")) {
            return;
        }
        LIZ();
    }

    public void setValues(PolicyNotice policyNotice) {
        o.LJIIIZ(policyNotice, "policyNotice");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.ahx, C16880lQ.LLZIL(getContext()), null);
        View findViewById = LLLZIIL.findViewById(R.id.m2v);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_content)");
        this.LJLILLLLZI = (TuxTextView) findViewById;
        View findViewById2 = LLLZIIL.findViewById(R.id.b1j);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.button1)");
        this.LJLJI = (TuxTextView) findViewById2;
        View findViewById3 = LLLZIIL.findViewById(R.id.b1k);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.button2)");
        this.LJLJJI = (TuxTextView) findViewById3;
        View findViewById4 = LLLZIIL.findViewById(R.id.m_x);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.tv_line)");
        this.LJLJJL = (TuxTextView) findViewById4;
        addView(LLLZIIL);
        EventBus.LIZJ().LJIILJJIL(this);
        this.LJLIL = policyNotice;
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            Context context = tuxTextView.getContext();
            o.LJIIIIZZ(context, "context");
            PolicyNotice policyNotice2 = this.LJLIL;
            if (policyNotice2 != null) {
                String body = policyNotice2.getBody();
                PolicyNotice policyNotice3 = this.LJLIL;
                if (policyNotice3 != null) {
                    tuxTextView.setText(C208328Fo.LIZ(context, body, policyNotice3.getPolicyLinkList(), new AqS169S0100000_3(this, 913), new AqS153S0100000_3(this, 1667)));
                    tuxTextView.setHighlightColor(C04330Ez.LIZIZ(tuxTextView.getContext(), R.color.cz));
                    tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                    TuxTextView tuxTextView2 = this.LJLJI;
                    if (tuxTextView2 != null) {
                        PolicyNotice policyNotice4 = this.LJLIL;
                        if (policyNotice4 != null) {
                            LIZIZ(tuxTextView2, (PolicyNoticeAction) ListProtector.get(policyNotice4.getActions(), 0));
                            PolicyNotice policyNotice5 = this.LJLIL;
                            if (policyNotice5 != null) {
                                if (policyNotice5.getActions().size() > 1) {
                                    TuxTextView tuxTextView3 = this.LJLJJL;
                                    if (tuxTextView3 != null) {
                                        tuxTextView3.setVisibility(0);
                                        TuxTextView tuxTextView4 = this.LJLJJI;
                                        if (tuxTextView4 != null) {
                                            tuxTextView4.setVisibility(0);
                                            TuxTextView tuxTextView5 = this.LJLJJI;
                                            if (tuxTextView5 != null) {
                                                PolicyNotice policyNotice6 = this.LJLIL;
                                                if (policyNotice6 != null) {
                                                    LIZIZ(tuxTextView5, (PolicyNoticeAction) ListProtector.get(policyNotice6.getActions(), 1));
                                                } else {
                                                    o.LJIJI("mPolicyNotice");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("mButton2");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("mButton2");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("mLine");
                                        throw null;
                                    }
                                } else {
                                    TuxTextView tuxTextView6 = this.LJLJJL;
                                    if (tuxTextView6 != null) {
                                        tuxTextView6.setVisibility(8);
                                        TuxTextView tuxTextView7 = this.LJLJJI;
                                        if (tuxTextView7 != null) {
                                            tuxTextView7.setVisibility(8);
                                        } else {
                                            o.LJIJI("mButton2");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("mLine");
                                        throw null;
                                    }
                                }
                                setVisibility(4);
                                post(new ARunnableS39S0100000_3(this, 199));
                                return;
                            }
                            o.LJIJI("mPolicyNotice");
                            throw null;
                        }
                        o.LJIJI("mPolicyNotice");
                        throw null;
                    }
                    o.LJIJI("mButton1");
                    throw null;
                }
                o.LJIJI("mPolicyNotice");
                throw null;
            }
            o.LJIJI("mPolicyNotice");
            throw null;
        }
        o.LJIJI("mContent");
        throw null;
    }

    public final void LIZIZ(TuxTextView tuxTextView, PolicyNoticeAction policyNoticeAction) {
        tuxTextView.setText(policyNoticeAction.getText());
        if (policyNoticeAction.isBold()) {
            tuxTextView.setTuxFont(43);
            tuxTextView.setTextColorRes(R.attr.gq);
        } else {
            tuxTextView.setTuxFont(41);
        }
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS51S0000000_3(this, policyNoticeAction, 2));
    }
}
