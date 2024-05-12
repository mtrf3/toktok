package X;

import Y.IDObjectS175S0100000_2;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ft, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157416Ft extends ConstraintLayout implements InterfaceC1549166d<C1558669u>, InterfaceC1549266e {
    public static final /* synthetic */ int LLD = 0;
    public ConstraintLayout LJLIL;
    public OPX LJLILLLLZI;
    public T5T LJLJI;
    public TuxTextView LJLJJI;
    public View LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public long LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public EnumC81462Vy6 LJLLI;
    public UrlModel LJLLILLLL;
    public List<Long> LJLLJ;
    public String LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public C6G1 LJLZ;
    public C1558669u LJZ;
    public long LJZI;
    public boolean LJZL;
    public boolean LL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C157416Ft(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJJI() {
        C1558669u c1558669u = this.LJZ;
        if (c1558669u != null && LJJZZI()) {
            return c1558669u.LJLILLLLZI;
        }
        return 0;
    }

    public final void LJJLJLI() {
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
            T5T t5t = this.LJLJI;
            if (t5t != null) {
                t5t.setVisibility(0);
                T5T t5t2 = this.LJLJI;
                if (t5t2 != null) {
                    TuxTextView tuxTextView2 = this.LJLJJI;
                    if (tuxTextView2 != null) {
                        t5t2.setText(tuxTextView2.getText().toString());
                        return;
                    } else {
                        o.LJIJI("questionText");
                        throw null;
                    }
                }
                o.LJIJI("questionEditText");
                throw null;
            }
            o.LJIJI("questionEditText");
            throw null;
        }
        o.LJIJI("questionText");
        throw null;
    }

    @Override // X.InterfaceC1549166d
    /* renamed from: LJJLL, reason: merged with bridge method [inline-methods] */
    public final C1558669u LJIJ() {
        InteractStickerStruct interactStickerStruct;
        int i;
        C6G1 c6g1 = this.LJLZ;
        if (c6g1 != null) {
            interactStickerStruct = c6g1.getInteractStickerStruct();
        } else {
            interactStickerStruct = null;
        }
        C1558669u c1558669u = this.LJZ;
        int i2 = 0;
        if (c1558669u != null) {
            i = c1558669u.LJLILLLLZI;
            i2 = c1558669u.LJLJI;
        } else {
            i = 0;
        }
        return new C1558669u(interactStickerStruct, i, i2);
    }

    public final boolean LJJZZI() {
        C1558669u c1558669u = this.LJZ;
        if (c1558669u == null || c1558669u.LJLJI == 0) {
            return false;
        }
        return true;
    }

    public final void LJL() {
        int i;
        T5T t5t = this.LJLJI;
        if (t5t != null) {
            t5t.setFocusable(true);
            T5T t5t2 = this.LJLJI;
            if (t5t2 != null) {
                t5t2.setFocusableInTouchMode(true);
                T5T t5t3 = this.LJLJI;
                if (t5t3 != null) {
                    t5t3.requestFocus();
                    T5T t5t4 = this.LJLJI;
                    if (t5t4 != null) {
                        KeyboardUtils.LIZIZ(C60903NvH.LJ, t5t4);
                        T5T t5t5 = this.LJLJI;
                        if (t5t5 != null) {
                            Editable text = t5t5.getText();
                            if (text != null) {
                                i = text.length();
                            } else {
                                i = 0;
                            }
                            t5t5.setSelection(i);
                            this.LJLLLLLL = true;
                            return;
                        }
                        o.LJIJI("questionEditText");
                        throw null;
                    }
                    o.LJIJI("questionEditText");
                    throw null;
                }
                o.LJIJI("questionEditText");
                throw null;
            }
            o.LJIJI("questionEditText");
            throw null;
        }
        o.LJIJI("questionEditText");
        throw null;
    }

    public final float getActionHeight() {
        if (this.LJLJJL != null) {
            return r0.getMeasuredHeight();
        }
        o.LJIJI("answerArea");
        throw null;
    }

    public final ConstraintLayout getContentView() {
        ConstraintLayout constraintLayout = this.LJLIL;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        o.LJIJI("contentView");
        throw null;
    }

    public int getEndTime() {
        C1558669u c1558669u = this.LJZ;
        if (c1558669u != null) {
            return c1558669u.LJLJI;
        }
        return 0;
    }

    @Override // X.InterfaceC1549266e
    public Integer getInteractStickerType() {
        C6G1 c6g1 = this.LJLZ;
        if (c6g1 != null) {
            c6g1.getInteractStickerType();
            return 17;
        }
        return null;
    }

    public final String getQaEditTextContent() {
        String obj;
        T5T t5t = this.LJLJI;
        if (t5t != null) {
            Editable text = t5t.getText();
            if (text == null || (obj = text.toString()) == null) {
                return "";
            }
            return obj;
        }
        o.LJIJI("questionEditText");
        throw null;
    }

    public int getStartTime() {
        C1558669u c1558669u = this.LJZ;
        if (c1558669u != null) {
            return c1558669u.LJLILLLLZI;
        }
        return 0;
    }

    public final QaStruct getQaStruct() {
        String obj;
        String str = null;
        if (C158166Iq.LIZIZ()) {
            T5T t5t = this.LJLJI;
            if (t5t != null) {
                Editable text = t5t.getText();
                if (text != null) {
                    str = text.toString();
                }
            } else {
                o.LJIJI("questionEditText");
                throw null;
            }
        } else {
            T5T t5t2 = this.LJLJI;
            if (t5t2 != null) {
                Editable text2 = t5t2.getText();
                if (text2 == null || (obj = text2.toString()) == null || obj.length() == 0) {
                    TuxTextView tuxTextView = this.LJLJJI;
                    if (tuxTextView != null) {
                        CharSequence text3 = tuxTextView.getText();
                        if (text3 == null || (str = text3.toString()) == null) {
                            str = "";
                        }
                    } else {
                        o.LJIJI("questionText");
                        throw null;
                    }
                } else {
                    T5T t5t3 = this.LJLJI;
                    if (t5t3 != null) {
                        Editable text4 = t5t3.getText();
                        if (text4 != null) {
                            str = text4.toString();
                        }
                    } else {
                        o.LJIJI("questionEditText");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("questionEditText");
                throw null;
            }
        }
        return new QaStruct(this.LJLJL, this.LJLJLJ, this.LJLJJLL, this.LJLLILLLL, this.LJLL, str, this.LJLJLLL, this.LJLLJ, this.LJLLI, null, null, null, null, this.LJLLL, 0, null, null, 122368, null);
    }

    public final boolean getInEditMode() {
        return this.LL;
    }

    public final boolean getTouchAble() {
        return this.LJLLLL;
    }

    @Override // X.InterfaceC1549166d
    public final int LJIIZILJ(int i) {
        C1558669u c1558669u = this.LJZ;
        if (c1558669u != null && LJJZZI()) {
            return c1558669u.LJLJI;
        }
        return i;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJII(int i) {
        C1558669u c1558669u = this.LJZ;
        if (c1558669u != null && LJJZZI()) {
            return c1558669u.LJLILLLLZI;
        }
        return 0;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJZ(int i) {
        C1558669u c1558669u = this.LJZ;
        if (c1558669u != null && LJJZZI()) {
            return c1558669u.LJLJI;
        }
        return i;
    }

    public final void LJJZZIII(QaStruct qaStruct) {
        if (qaStruct != null) {
            UrlModel avatarUrl = qaStruct.getAvatarUrl();
            if (avatarUrl != null) {
                this.LJLLILLLL = avatarUrl;
                OPX opx = this.LJLILLLLZI;
                if (opx != null) {
                    C78764Uvg.LJFF(opx, avatarUrl);
                } else {
                    o.LJIJI("avatarImage");
                    throw null;
                }
            }
            String questionContent = qaStruct.getQuestionContent();
            if (questionContent != null) {
                T5T t5t = this.LJLJI;
                if (t5t != null) {
                    t5t.setVisibility(8);
                    TuxTextView tuxTextView = this.LJLJJI;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(0);
                        TuxTextView tuxTextView2 = this.LJLJJI;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setText(questionContent);
                            T5T t5t2 = this.LJLJI;
                            if (t5t2 != null) {
                                t5t2.setText(questionContent);
                            } else {
                                o.LJIJI("questionEditText");
                                throw null;
                            }
                        } else {
                            o.LJIJI("questionText");
                            throw null;
                        }
                    } else {
                        o.LJIJI("questionText");
                        throw null;
                    }
                } else {
                    o.LJIJI("questionEditText");
                    throw null;
                }
            }
            this.LJLJL = qaStruct.getQuestionId();
            this.LJLJLJ = qaStruct.getUserId();
            this.LJLJLLL = qaStruct.getSecId();
            this.LJLJJLL = qaStruct.getItemId();
            String userName = qaStruct.getUserName();
            String str = "";
            if (userName == null) {
                userName = "";
            }
            this.LJLL = userName;
            this.LJLLJ = qaStruct.getInviteUserList();
            this.LJLLI = qaStruct.getSource();
            String userSelectedCategory = qaStruct.getUserSelectedCategory();
            if (userSelectedCategory != null) {
                str = userSelectedCategory;
            }
            this.LJLLL = str;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LJLLLL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC1549166d
    public void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        LJIIIZ(f, false);
    }

    public final void setContentView(ConstraintLayout constraintLayout) {
        o.LJIIIZ(constraintLayout, "<set-?>");
        this.LJLIL = constraintLayout;
    }

    public final void setController(C6G1 controller) {
        o.LJIIIZ(controller, "controller");
        this.LJLZ = controller;
    }

    @Override // X.InterfaceC1549266e
    public void setEndTime(int i) {
        C1558669u c1558669u = this.LJZ;
        if (c1558669u == null) {
            return;
        }
        c1558669u.LJLJI = i;
    }

    public final void setInEditMode(boolean z) {
        this.LL = z;
    }

    public final void setPlayPosition(long j) {
        this.LJZI = j;
    }

    public final void setQaStickerTimeEditData(C1558669u data) {
        o.LJIIIZ(data, "data");
        this.LJZ = data;
    }

    @Override // X.InterfaceC1549266e
    public void setStartTime(int i) {
        C1558669u c1558669u = this.LJZ;
        if (c1558669u == null) {
            return;
        }
        c1558669u.LJLILLLLZI = i;
    }

    public final void setTouchAble(boolean z) {
        this.LJLLLL = z;
    }

    public final void setTouching(boolean z) {
        this.LJZL = z;
    }

    @Override // X.InterfaceC1549266e
    public final void LJIIIZ(float f, boolean z) {
        setAlpha(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157416Ft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        UrlModel urlModel;
        a1.LJFF(context, "context");
        this.LJLJLLL = "";
        this.LJLL = "";
        this.LJLLI = EnumC81462Vy6.StickerPanel;
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null) {
            urlModel = LJ.getAvatarThumb();
        } else {
            urlModel = null;
        }
        this.LJLLILLLL = urlModel;
        this.LJLLJ = C61878OQg.INSTANCE;
        this.LJLLL = "";
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.hu, this, true);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        setContentView((ConstraintLayout) LLLLIILL);
        View findViewById = getContentView().findViewById(R.id.ih6);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.qa_sticker_avatar)");
        this.LJLILLLLZI = (OPX) findViewById;
        View findViewById2 = getContentView().findViewById(R.id.ih7);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById…ticker_content_edit_text)");
        T5T t5t = (T5T) findViewById2;
        this.LJLJI = t5t;
        t5t.setSelection(0);
        T5T t5t2 = this.LJLJI;
        if (t5t2 != null) {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            t5t2.setMaxWidth((int) C74275TDb.LIZIZ(context2, 186.0f));
            View findViewById3 = getContentView().findViewById(R.id.ih9);
            o.LJIIIIZZ(findViewById3, "contentView.findViewById….qa_sticker_content_text)");
            this.LJLJJI = (TuxTextView) findViewById3;
            View findViewById4 = findViewById(R.id.o5);
            o.LJIIIIZZ(findViewById4, "findViewById(R.id.action_content)");
            this.LJLJJL = findViewById4;
            OPX opx = this.LJLILLLLZI;
            if (opx != null) {
                C78764Uvg.LJI(opx, this.LJLLILLLL, -1, -1);
                T5T t5t3 = this.LJLJI;
                if (t5t3 != null) {
                    t5t3.addTextChangedListener(new IDObjectS175S0100000_2(this, 16));
                    return;
                } else {
                    o.LJIJI("questionEditText");
                    throw null;
                }
            }
            o.LJIJI("avatarImage");
            throw null;
        }
        o.LJIJI("questionEditText");
        throw null;
    }

    @Override // X.InterfaceC1549166d
    public final void LJJJJLI(C1558669u c1558669u, int i, int i2) {
        InteractStickerStruct interactStickerStruct;
        C1558669u c1558669u2 = c1558669u;
        NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ(c1558669u2.LJLIL);
        C6G1 c6g1 = this.LJLZ;
        if (c6g1 != null) {
            interactStickerStruct = c6g1.getInteractStickerStruct();
        } else {
            interactStickerStruct = null;
        }
        NormalTrackTimeStamp LIZIZ2 = C164826dS.LIZIZ(interactStickerStruct);
        C1558669u c1558669u3 = this.LJZ;
        if (c1558669u3 != null) {
            c1558669u3.LJLILLLLZI = c1558669u2.LJLILLLLZI;
            c1558669u3.LJLJI = c1558669u2.LJLJI;
        }
        if (LIZIZ != null && LIZIZ2 != null) {
            LIZIZ.setRotation(LIZIZ.getRotation() - LIZIZ2.getRotation());
            if (!o.LIZJ(LIZIZ2.getScale(), 0.0f)) {
                float floatValue = LIZIZ.getScale().floatValue();
                Float scale = LIZIZ2.getScale();
                o.LJIIIIZZ(scale, "newLocation.scale");
                LIZIZ.setScale(Float.valueOf(floatValue / scale.floatValue()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(LIZIZ);
            String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), arrayList);
            InteractStickerStruct interactStickerStruct2 = c1558669u2.LJLIL;
            if (interactStickerStruct2 != null) {
                interactStickerStruct2.setTrackList(json);
            }
            C6G1 c6g12 = this.LJLZ;
            if (c6g12 != null) {
                c6g12.LJIILLIIL(false);
            }
            C6G1 c6g13 = this.LJLZ;
            if (c6g13 != null) {
                c6g13.LJIIZILJ(c1558669u2.LJLIL);
            }
            C6G1 c6g14 = this.LJLZ;
            if (c6g14 != null) {
                c6g14.LJIILLIIL(true);
            }
        }
    }

    public final AnimatorSet LJJZ(C6G2 fromAnimator, C6G2 toAnimator, AnimatorListenerAdapter animatorListenerAdapter) {
        o.LJIIIZ(fromAnimator, "fromAnimator");
        o.LJIIIZ(toAnimator, "toAnimator");
        setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", fromAnimator.LIZ, toAnimator.LIZ);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", fromAnimator.LIZIZ, toAnimator.LIZIZ);
        float[] fArr = new float[2];
        fArr[0] = fromAnimator.LIZJ;
        float f = toAnimator.LIZJ;
        if (f > 180.0f) {
            f = 360.0f;
        }
        fArr[1] = f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "rotation", fArr);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "x", fromAnimator.LIZLLL, toAnimator.LIZLLL);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "y", fromAnimator.LJ, toAnimator.LJ);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, "alpha", fromAnimator.LJFF, toAnimator.LJFF);
        AnimatorSet LIZ = C1DD.LIZ(300L);
        LIZ.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5).with(ofFloat6);
        if (animatorListenerAdapter != null) {
            LIZ.addListener(animatorListenerAdapter);
        }
        LIZ.start();
        return LIZ;
    }

    public /* synthetic */ C157416Ft(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
