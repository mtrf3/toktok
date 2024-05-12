package X;

import android.app.Activity;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xwj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86473Xwj extends AbstractViewOnClickListenerC86477Xwn {
    public final C86109Xqr LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final SY4 LJLJI;
    public final C62846OlW LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL;

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
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

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final void resetViewsParams() {
        this.LJLJI.setText("");
        this.LJLILLLLZI.setText("");
    }

    public /* synthetic */ C86473Xwj(ActivityC45651qj activityC45651qj) {
        this(activityC45651qj, null, 0);
    }

    public final void LIZ(InnerPushUITemplate innerPushUITemplate) {
        int i;
        V8L v8l = this.LJLJJI.getHierarchy().LIZJ;
        if (v8l != null) {
            v8l.LJFF(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(innerPushUITemplate.getRightImageRadius()))));
            InnerPushMessage curMsg = getCurMsg();
            if (curMsg == null || curMsg.getType() != 27) {
                v8l.LIZLLL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(innerPushUITemplate.getRightImageBorderWidth()))));
            }
        }
        ViewGroup.LayoutParams layoutParams = this.LJLJJI.getLayoutParams();
        layoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(innerPushUITemplate.getRightImageHeight())));
        layoutParams.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(innerPushUITemplate.getRightImageWidth())));
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (innerPushUITemplate.getRightImageHeight() <= 40) {
                i = C7MY.LIZIZ(4);
            } else {
                i = 0;
            }
            marginLayoutParams.setMarginEnd(i);
        }
        String rightImageUrl = innerPushUITemplate.getRightImageUrl();
        if (rightImageUrl == null || rightImageUrl.length() == 0) {
            if (innerPushUITemplate.getRightImageResId() > 0) {
                this.LJLJJI.setImageResource(innerPushUITemplate.getRightImageResId());
                return;
            } else if (innerPushUITemplate.getRightImageDrawable() != null) {
                this.LJLJJI.setImageDrawable(innerPushUITemplate.getRightImageDrawable());
                return;
            } else {
                this.LJLJJI.setVisibility(8);
                return;
            }
        }
        C78765Uvh.LJIIIZ(this.LJLJJI, innerPushUITemplate.getRightImageUrl(), -1, -1);
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final void bindContent(InnerPushMessage message) {
        o.LJIIIZ(message, "message");
        super.bindContent(message);
        InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
        if (templatePushMsg != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("right view bindContent type:");
            LIZ.append(templatePushMsg.getRightType());
            LIZ.append(' ');
            C86478Xwo.LIZ("inner_push_platform", X1D.LIZIZ(LIZ));
            int LIZ2 = (int) ((C47135Ieh.LIZ(16, getContext().getResources().getDisplayMetrics().widthPixels) * 0.4d) - C7MY.LIZIZ(24));
            int rightType = templatePushMsg.getRightType();
            if (rightType != 0) {
                int i = 0;
                if (rightType != 1) {
                    if (rightType != 2) {
                        if (rightType != 3) {
                            if (rightType != 4) {
                                if (rightType != 5) {
                                    if (rightType != 7) {
                                        setVisibility(8);
                                        C86478Xwo.LIZIZ("inner_push_platform", " invalid right type");
                                        return;
                                    }
                                    setVisibility(0);
                                    C86512XxM.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
                                    this.LJLJJI.setVisibility(0);
                                    templatePushMsg.setRightImageResId(R.drawable.bli);
                                    LIZ(templatePushMsg);
                                    return;
                                }
                                setVisibility(0);
                                C86512XxM.LIZIZ(this.LJLIL, this.LJLJJI, this.LJLJI);
                                this.LJLILLLLZI.setVisibility(0);
                                this.LJLILLLLZI.setTextColorRes(R.attr.gx);
                                this.LJLILLLLZI.setText(templatePushMsg.getRightBtnText());
                                TuxTextView tuxTextView = this.LJLILLLLZI;
                                ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                    i = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams);
                                }
                                tuxTextView.setMaxWidth(LIZ2 - i);
                                return;
                            }
                            setVisibility(0);
                            C86512XxM.LIZIZ(this.LJLIL, this.LJLJJI, this.LJLILLLLZI);
                            this.LJLJI.setVisibility(0);
                            this.LJLJI.setText(templatePushMsg.getRightBtnText());
                            SY4 sy4 = this.LJLJI;
                            ViewGroup.LayoutParams layoutParams2 = sy4.getLayoutParams();
                            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                i = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams2);
                            }
                            sy4.setMaxWidth(LIZ2 - i);
                            this.LJLJI.getClass();
                            return;
                        }
                        setVisibility(0);
                        C86512XxM.LIZIZ(this.LJLIL, this.LJLJJI, this.LJLJI);
                        this.LJLILLLLZI.setVisibility(0);
                        this.LJLILLLLZI.setText(templatePushMsg.getRightBtnText());
                        this.LJLILLLLZI.setTextColorRes(R.attr.eb);
                        TuxTextView tuxTextView2 = this.LJLILLLLZI;
                        ViewGroup.LayoutParams layoutParams3 = tuxTextView2.getLayoutParams();
                        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                            i = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams3);
                        }
                        tuxTextView2.setMaxWidth(LIZ2 - i);
                        return;
                    }
                    setVisibility(0);
                    C86512XxM.LIZIZ(this.LJLJJI, this.LJLILLLLZI, this.LJLJI);
                    this.LJLIL.setVisibility(0);
                    this.LJLIL.bindContent(message);
                    C86109Xqr c86109Xqr = this.LJLIL;
                    ViewGroup.LayoutParams layoutParams4 = c86109Xqr.getLayoutParams();
                    if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                        i = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams4);
                    }
                    c86109Xqr.setViewMaxWidth(LIZ2 - i);
                    return;
                }
                setVisibility(0);
                C86512XxM.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
                this.LJLJJI.setVisibility(0);
                LIZ(templatePushMsg);
                return;
            }
            setVisibility(8);
        }
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final String getSchemaUrl(View view) {
        InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
        if (templatePushMsg != null) {
            return templatePushMsg.getRightSchemaUrl();
        }
        return null;
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final boolean handleClick(View view) {
        InterfaceC86486Xww LIZ;
        InnerPushMessage curMsg = getCurMsg();
        if (curMsg != null && (LIZ = C58242MtS.LIZ(curMsg.getType())) != null && LIZ.LIZIZ(3, curMsg)) {
            return true;
        }
        C86478Xwo.LIZLLL("inner_push_platform", "RightView handleClick right container");
        String schemaUrl = getSchemaUrl(view);
        if (schemaUrl == null) {
            return false;
        }
        jumpWithRouter(schemaUrl);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86473Xwj(ActivityC45651qj activityC45651qj, AttributeSet attributeSet, int i) {
        super(activityC45651qj, attributeSet, i);
        View inflate;
        this.LJLJJL = new LinkedHashMap();
        Activity LJIJJ = C45804HyK.LJIJJ(activityC45651qj);
        if (C53334KwU.LIZIZ() && C16970lZ.LIZ(R.layout.bad, activityC45651qj) && LJIJJ != null) {
            inflate = C16970lZ.LIZJ(R.layout.bad, LJIJJ, this, true);
        } else {
            inflate = FrameLayout.inflate(activityC45651qj, R.layout.bad, this);
        }
        View findViewById = inflate.findViewById(R.id.en5);
        o.LJIIIIZZ(findViewById, "rootView.findViewById<In…id.inner_push_follow_btn)");
        this.LJLIL = (C86109Xqr) findViewById;
        View findViewById2 = inflate.findViewById(R.id.en2);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById<Tu…>(R.id.inner_push_button)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.ene);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById<Tu…er_push_right_tux_button)");
        this.LJLJI = (SY4) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.end);
        o.LJIIIIZZ(findViewById4, "rootView.findViewById<Re…d.inner_push_right_cover)");
        this.LJLJJI = (C62846OlW) findViewById4;
    }
}
