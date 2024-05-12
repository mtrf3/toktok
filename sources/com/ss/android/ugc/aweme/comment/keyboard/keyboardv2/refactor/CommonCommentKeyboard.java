package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C175276uJ;
import X.C176356w3;
import X.C176366w4;
import X.C176996x5;
import X.C177336xd;
import X.C177826yQ;
import X.C212428Vi;
import X.C214298b3;
import X.C2L4;
import X.C32I;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55247LmF;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71Y;
import X.C74Z;
import X.C76800UCe;
import X.C76965UIn;
import X.C78886Uxe;
import X.C78926UyI;
import X.C7EL;
import X.C8VV;
import X.C8YN;
import X.C9BE;
import X.EnumC177696yD;
import X.EnumC177956yd;
import X.InterfaceC178146yw;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.TBT;
import X.X1D;
import X.Y87;
import Y.ARunnableS39S0100000_3;
import Y.IDTListenerS113S0100000_3;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.CommentKeyboardScope;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommonCommentKeyboard;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.AqS46S0110000_3;
import kotlin.jvm.internal.AqS54S0201000_3;
import kotlin.jvm.internal.AqS58S1200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommonCommentKeyboard extends UISlotAssem implements IRefactorKeyboardFragment, C2L4 {
    public static final /* synthetic */ int LJZ = 0;
    public C177336xd LJLJLLL;
    public C7EL LJLL;
    public View LJLLI;
    public final C214298b3 LJLLILLLL;
    public C176996x5 LJLLJ;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLLL;
    public EnumC177956yd LJLLLL;
    public ObjectAnimator LJLLLLLL;
    public boolean LJLZ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.qf;
    }

    public CommonCommentKeyboard() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(KeyboardVMV2.class);
        this.LJLLILLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 110), C176366w4.INSTANCE, null);
        this.LJLLLL = EnumC177956yd.UN_INIT;
    }

    public final KeyboardVMV2 I3() {
        return (KeyboardVMV2) this.LJLLILLLL.getValue();
    }

    public final void L3() {
        H3(new AqS153S0100000_3(this, 108));
    }

    public final void M3() {
        H3(new AqS153S0100000_3(this, 109));
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(CommentKeyboardScope.class);
    }

    public final void P3() {
        I3().setState(C177826yQ.LJLIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C177336xd c177336xd = this.LJLJLLL;
        if (c177336xd != null) {
            C55247LmF.LIZIZ(C55096Ljo.LJIIZILJ(this), c177336xd, C177336xd.class, "source_default_key");
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null) {
                C55247LmF.LIZIZ(C55230Lly.LIZJ(LIZLLL, null), c177336xd, C177336xd.class, "source_default_key");
            }
        }
        C55096Ljo.LJIIJJI(C55096Ljo.LJIIZILJ(this), this, IRefactorKeyboardFragment.class, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C55096Ljo.LJIILL(C55096Ljo.LJIIZILJ(this), IRefactorKeyboardFragment.class, null);
        C7EL c7el = this.LJLL;
        if (c7el != null) {
            c7el.release();
        }
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        C71Y.LIZ("CommonCommentKeyboard", "onPause");
        if (this._isViewValid) {
            KeyboardVMV2 I3 = I3();
            I3.getClass();
            I3.withState(new AqS46S0110000_3(I3, true, 8));
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        C71Y.LIZ("CommonCommentKeyboard", "onResume");
        if (this._isViewValid) {
            getContainerView().post(new ARunnableS39S0100000_3(this, 27));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRefactorKeyboardFragment
    public final C176996x5 EJ() {
        return this.LJLLJ;
    }

    public final void H3(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (!this._isViewValid) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public final void K3(final boolean z) {
        float f;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("innerSwitchBackground ");
        LIZ.append(z);
        C71Y.LIZLLL("CommonCommentKeyboard", X1D.LIZIZ(LIZ));
        final View view = this.LJLLI;
        if (view != null) {
            view.setClickable(false);
            ObjectAnimator objectAnimator = this.LJLLLLLL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            final float f2 = 0.0f;
            if (z) {
                f = 0.0f;
                f2 = 1.0f;
            } else {
                f = 1.0f;
            }
            if (view.getAlpha() == f2) {
                this.LJLZ = false;
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f, f2);
            ofFloat.setDuration(150L);
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: X.6ye
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    CommonCommentKeyboard.this.LJLZ = false;
                    view.setAlpha(1.0f);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    CommonCommentKeyboard.this.LJLZ = false;
                    view.setAlpha(f2);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    CommonCommentKeyboard.this.LJLZ = true;
                    view.setClickable(z);
                }
            });
            this.LJLLLLLL = ofFloat;
            ofFloat.start();
        }
    }

    public final void N3(C177336xd c177336xd) {
        String str;
        Aweme aweme;
        C71Y.LIZ("CommonCommentKeyboard", "keyboard fragment reset params");
        C177336xd c177336xd2 = this.LJLJLLL;
        if (c177336xd2 == null || (aweme = c177336xd2.LJLLI) == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        this.LJLJLLL = c177336xd;
        H3(new AqS58S1200000_3(this, str, c177336xd, 1));
    }

    public final void O3(EnumC177696yD status) {
        o.LJIIIZ(status, "status");
        H3(new AqS150S0200000_3(this, status, 16));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Aweme aweme;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLLI = view.findViewById(R.id.hec);
        this.LJLLLL = EnumC177956yd.ON_START;
        KeyboardVMV2 I3 = I3();
        C177336xd c177336xd = this.LJLJLLL;
        if (c177336xd != null) {
            aweme = c177336xd.LJLLI;
        } else {
            aweme = null;
        }
        I3.getClass();
        I3.setState(new AqS169S0100000_3(aweme, 625));
        View view2 = this.LJLLI;
        if (view2 != null) {
            view2.setOnTouchListener(new IDTListenerS113S0100000_3(this, 0));
        }
        view.setOnKeyListener(new View.OnKeyListener() { // from class: X.6yc
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view3, int i, KeyEvent keyEvent) {
                C34K c34k = new C34K();
                CommonCommentKeyboard commonCommentKeyboard = CommonCommentKeyboard.this;
                commonCommentKeyboard.withState(commonCommentKeyboard.I3(), new AqS54S0201000_3(i, CommonCommentKeyboard.this, c34k, 3));
                return c34k.element;
            }
        });
        C8YN.LJII(this, I3(), new TBT() { // from class: X.6y9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C177616y5) obj).LLD);
            }
        }, null, new AqS185S0100000_3(this, 24), 6);
        C8YN.LJII(this, I3(), new TBT() { // from class: X.6yA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C177616y5) obj).LLF;
            }
        }, null, new AqS185S0100000_3(this, 25), 6);
        C8VV.LIZJ(this, new AqS169S0100000_3(this, 78));
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        C7EL c7el = new C7EL(context, view);
        this.LJLL = c7el;
        c7el.LJLJLLL = new InterfaceC178146yw() { // from class: X.6yb
            @Override // X.InterfaceC178146yw
            public final void LLIIJLIL() {
                CommonCommentKeyboard.this.I3().lv0(0, false);
            }

            @Override // X.InterfaceC178146yw
            public final void Yc(int i) {
                C7EP.LIZLLL(i);
                KeyboardVMV2 I32 = CommonCommentKeyboard.this.I3();
                I32.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("updateKeyboardHeight ");
                LIZ.append(i);
                C71Y.LIZLLL("xjccccc", X1D.LIZIZ(LIZ));
                I32.setState(new AqS28S0001000_3(i, 12));
            }

            @Override // X.InterfaceC178146yw
            public final void y1(int i) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("keyboardFakePopupWindow show keyboard height->");
                LIZ.append(i);
                LIZ.append(' ');
                LIZ.append(CommonCommentKeyboard.this.LJLLLL);
                C71Y.LIZLLL("CommonCommentKeyboard", X1D.LIZIZ(LIZ));
                if (CommonCommentKeyboard.this.LJLLLL == EnumC177956yd.ON_PAUSE) {
                    return;
                }
                C7EP.LIZLLL(i);
                CommonCommentKeyboard.this.I3().lv0(i, true);
            }
        };
        c7el.show();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRefactorKeyboardFragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        String str;
        String str2;
        List<CommentImageModel> list;
        String str3;
        List<CommentImageModel> list2;
        ArrayList parcelableArrayListExtra;
        if (C175276uJ.LIZJ()) {
            ArrayList arrayList = null;
            if (intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) != null) {
                arrayList = new ArrayList(C32I.LJJL(parcelableArrayListExtra, 10));
                Iterator it = parcelableArrayListExtra.iterator();
                while (it.hasNext()) {
                    MediaModel it2 = (MediaModel) it.next();
                    o.LJIIIIZZ(it2, "it");
                    arrayList.add(C78886Uxe.LJJLIIIJJIZ(it2));
                }
            }
            C176996x5 c176996x5 = this.LJLLJ;
            if (c176996x5 != null) {
                c176996x5.LL = false;
            }
            if (i2 == 100) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("MediaModel = ");
                LIZ.append(arrayList);
                C71Y.LIZ("PhotoComment", X1D.LIZIZ(LIZ));
                if (arrayList != null && !arrayList.isEmpty()) {
                    C176996x5 c176996x52 = this.LJLLJ;
                    if (c176996x52 == null || (list2 = c176996x52.LJZL) == null || list2.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = !z;
                    C177336xd c177336xd = this.LJLJLLL;
                    String str4 = "";
                    if (c177336xd == null || (str = c177336xd.LJLJJLL) == null) {
                        str = "";
                    }
                    if (z2) {
                        str2 = "replace";
                    } else {
                        str2 = "add";
                    }
                    C74Z.LJIIIZ(str, str2);
                    if (z2) {
                        C177336xd c177336xd2 = this.LJLJLLL;
                        if (c177336xd2 != null && (str3 = c177336xd2.LJLJJLL) != null) {
                            str4 = str3;
                        }
                        C74Z.LJIJI(str4, "replace");
                    }
                    C176996x5 c176996x53 = this.LJLLJ;
                    if (c176996x53 != null && (list = c176996x53.LJZL) != null && !list.isEmpty()) {
                        Y87.LIZ((CommentImageModel) ListProtector.get(list, 0));
                    }
                    if (!arrayList.isEmpty()) {
                        Y87.LJI((CommentImageModel) ListProtector.get(arrayList, 0));
                    }
                    withState(I3(), new AqS169S0100000_3(this, 77));
                }
                IKeyboardInputPanelAssemAbility LIZ2 = C176356w3.LIZ(C55096Ljo.LJIIZILJ(this));
                if (LIZ2 != null) {
                    LIZ2.BU(arrayList);
                }
            }
        }
    }
}
