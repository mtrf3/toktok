package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.AV1;
import X.AbstractC177926ya;
import X.ActivityC45651qj;
import X.C018905p;
import X.C0M6;
import X.C110614Vt;
import X.C139825eE;
import X.C16880lQ;
import X.C175276uJ;
import X.C176996x5;
import X.C177026x8;
import X.C177146xK;
import X.C177156xL;
import X.C177166xM;
import X.C177326xc;
import X.C177336xd;
import X.C177366xg;
import X.C177486xs;
import X.C177516xv;
import X.C177906yY;
import X.C177916yZ;
import X.C178156yx;
import X.C178166yy;
import X.C178406zM;
import X.C1793872g;
import X.C1799274i;
import X.C19N;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C224748ru;
import X.C2K0;
import X.C32151Nz;
import X.C47261Igj;
import X.C4VR;
import X.C55096Ljo;
import X.C55247LmF;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C62846OlW;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71Y;
import X.C72434Sbm;
import X.C72O;
import X.C74Z;
import X.C76800UCe;
import X.C77321UWf;
import X.C78926UyI;
import X.C78939UyV;
import X.C79045V0n;
import X.C7HV;
import X.C7K4;
import X.C88463da;
import X.C8VV;
import X.C8YN;
import X.C9BE;
import X.EF7;
import X.EnumC177736yH;
import X.EnumC1796673i;
import X.HG3;
import X.InterfaceC177046xA;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.InterfaceC55251LmJ;
import X.InterfaceC82683Wch;
import X.InterfaceC88472Yns;
import X.LEA;
import X.O6R;
import X.RBX;
import X.TBT;
import X.W5F;
import X.W5U;
import X.WHL;
import X.X1D;
import Y.AUListenerS90S0100000_1;
import Y.IDAListenerS72S0100000_3;
import Y.IDHandlerS16S0100000_3;
import Y.IDObjectS176S0100000_3;
import Y.IDTListenerS113S0100000_3;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardInputV2Assem;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.Au2S14S0100000_3;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS46S1200000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes4.dex */
public final class KeyboardInputV2Assem extends BaseKeyboardInputAssem implements IKeyboardProtocol, InterfaceC55102Lju {
    public static final C177516xv LLII = new Object() { // from class: X.6xv
    };
    public final C0M6<String, Editable> LJLJLLL;
    public final C0M6<String, List<CommentImageModel>> LJLL;
    public TuxIconView LJLLI;
    public LinearLayout LJLLILLLL;
    public TuxTextView LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public C224748ru LJLLLLLL;
    public C62846OlW LJLZ;
    public TuxTextView LJZ;
    public FrameLayout LJZI;
    public ImageView LJZL;
    public C72434Sbm LL;
    public InterfaceC82683Wch LLD;
    public final EnumC177736yH LLF;
    public final IDHandlerS16S0100000_3 LLFF;
    public final C177486xs LLFFF;
    public final C4VR LLFII;
    public final C214298b3 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;

    public final void U3() {
        String str;
        C224748ru c224748ru = this.LJLLLLLL;
        if (c224748ru != null) {
            c224748ru.setFocusableInTouchMode(true);
            C224748ru c224748ru2 = this.LJLLLLLL;
            if (c224748ru2 != null) {
                c224748ru2.setFocusable(true);
                C224748ru c224748ru3 = this.LJLLLLLL;
                if (c224748ru3 != null) {
                    boolean requestFocus = c224748ru3.requestFocus();
                    if (!requestFocus) {
                        StringBuilder sb = new StringBuilder("input request edit focus failed, visible=");
                        C224748ru c224748ru4 = this.LJLLLLLL;
                        if (c224748ru4 != null) {
                            sb.append(c224748ru4.getVisibility());
                            sb.append(", enable=");
                            C224748ru c224748ru5 = this.LJLLLLLL;
                            if (c224748ru5 != null) {
                                sb.append(c224748ru5.isEnabled());
                                sb.append(", focusable=");
                                C224748ru c224748ru6 = this.LJLLLLLL;
                                if (c224748ru6 != null) {
                                    sb.append(c224748ru6.isFocusable());
                                    sb.append(", focusableInTouch=");
                                    C224748ru c224748ru7 = this.LJLLLLLL;
                                    if (c224748ru7 != null) {
                                        sb.append(c224748ru7.isFocusableInTouchMode());
                                        str = sb.toString();
                                    } else {
                                        o.LJIJI("editTextComment");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("editTextComment");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("editTextComment");
                                throw null;
                            }
                        } else {
                            o.LJIJI("editTextComment");
                            throw null;
                        }
                    } else {
                        str = "";
                    }
                    C71Y.LIZLLL("KeyboardInputPanelV2Assem", "BaseKeyboardPanel: reqFocusRes=" + requestFocus + "  msg===> " + str);
                    return;
                }
                o.LJIJI("editTextComment");
                throw null;
            }
            o.LJIJI("editTextComment");
            throw null;
        }
        o.LJIJI("editTextComment");
        throw null;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1730696938) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void r1() {
        Q3(false);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.qh;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.6xs] */
    public KeyboardInputV2Assem() {
        new LinkedHashMap();
        this.LJLJLLL = new C0M6<>(10);
        this.LJLL = new C0M6<>(10);
        this.LLF = EnumC177736yH.DEFAULT;
        this.LLFF = new IDHandlerS16S0100000_3(this, C16880lQ.LLJJJJ(), 1);
        this.LLFFF = new LEA() { // from class: X.6xs
            @Override // X.LEA
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    KeyboardInputV2Assem.this.N3();
                }
            }
        };
        this.LLFII = new C4VR();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(KeyboardVMV2.class);
        this.LLFZ = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 116), C177366xg.INSTANCE, null);
        this.LLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 114));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 115));
    }

    public final KeyboardVMV2 K3() {
        return (KeyboardVMV2) this.LLFZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final C224748ru U1() {
        C224748ru c224748ru = this.LJLLLLLL;
        if (c224748ru != null) {
            return c224748ru;
        }
        o.LJIJI("editTextComment");
        throw null;
    }

    public final void Y3() {
        View view = this.LJLLLL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (HG3.LJIILL().isLogin()) {
                C72434Sbm c72434Sbm = this.LL;
                if (c72434Sbm != null) {
                    c72434Sbm.setVisibility(0);
                    marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(58)));
                    View view2 = this.LJLLLL;
                    if (view2 != null) {
                        view2.setLayoutParams(marginLayoutParams);
                        return;
                    } else {
                        o.LJIJI("commentEditBox");
                        throw null;
                    }
                }
                o.LJIJI("ivAvatar");
                throw null;
            }
            C72434Sbm c72434Sbm2 = this.LL;
            if (c72434Sbm2 != null) {
                c72434Sbm2.setVisibility(8);
                marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
                View view3 = this.LJLLLL;
                if (view3 != null) {
                    view3.setLayoutParams(marginLayoutParams);
                    return;
                } else {
                    o.LJIJI("commentEditBox");
                    throw null;
                }
            }
            o.LJIJI("ivAvatar");
            throw null;
        }
        o.LJIJI("commentEditBox");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void Af() {
        List<CommentImageModel> list;
        C177156xL H3 = H3();
        C176996x5 L1 = L1();
        if (L1 != null) {
            C224748ru c224748ru = this.LJLLLLLL;
            if (c224748ru != null) {
                Editable text = c224748ru.getText();
                C224748ru c224748ru2 = this.LJLLLLLL;
                if (c224748ru2 != null) {
                    ArrayList<TextExtraStruct> mentionExtraStructList = c224748ru2.getMentionExtraStructList();
                    C176996x5 L12 = L1();
                    if (L12 != null) {
                        list = L12.LJZL;
                    } else {
                        list = null;
                    }
                    L1.LJJJI(text, mentionExtraStructList, null, list, false, H3);
                } else {
                    o.LJIJI("editTextComment");
                    throw null;
                }
            } else {
                o.LJIJI("editTextComment");
                throw null;
            }
        }
        this.LLFII.LIZIZ();
        C4VR c4vr = this.LLFII;
        C224748ru c224748ru3 = this.LJLLLLLL;
        if (c224748ru3 != null) {
            C1793872g.LJIIL(c4vr.LIZLLL(c224748ru3.getText()));
        } else {
            o.LJIJI("editTextComment");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C177156xL H3() {
        /*
            r5 = this;
            X.6xd r0 = r5.I3()
            r4 = 0
            if (r0 == 0) goto L4a
            java.lang.String r3 = r0.LJLJI
        L9:
            X.6xd r0 = r5.I3()
            if (r0 == 0) goto L48
            int r0 = r0.LJLJJI
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L15:
            X.6xd r0 = r5.I3()
            if (r0 == 0) goto L46
            java.lang.String r2 = r0.LJLILLLLZI
        L1d:
            if (r1 != 0) goto L33
        L1f:
            java.lang.String r0 = ""
        L21:
            X.6xL r1 = new X.6xL
            r1.<init>(r0, r2)
            r1.LJI = r3
            X.8ru r0 = r5.LJLLLLLL
            if (r0 == 0) goto L4c
            java.util.List r0 = r0.getEmojiSpanList()
            r1.LJIIIIZZ = r0
            return r1
        L33:
            int r0 = r1.intValue()
            if (r0 != 0) goto L3c
            java.lang.String r0 = "comment_button"
            goto L21
        L3c:
            int r1 = r1.intValue()
            r0 = 1
            if (r1 != r0) goto L1f
            java.lang.String r0 = "input_box"
            goto L21
        L46:
            r2 = r4
            goto L1d
        L48:
            r1 = r4
            goto L15
        L4a:
            r3 = r4
            goto L9
        L4c:
            java.lang.String r0 = "editTextComment"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardInputV2Assem.H3():X.6xL");
    }

    public final C177336xd I3() {
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55096Ljo.LJIIZILJ(this), C177336xd.class, "source_default_key");
        if (LIZLLL != null) {
            return (C177336xd) LIZLLL.getSource();
        }
        return null;
    }

    public final C176996x5 L1() {
        C176996x5 EJ;
        IRefactorKeyboardFragment LIZ = C178166yy.LIZ(C55096Ljo.LJIIZILJ(this));
        if (LIZ != null && (EJ = LIZ.EJ()) != null) {
            EJ.LJLIL = (C177146xK) this.LLI.getValue();
            return EJ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void LLJJJ() {
        Aweme aweme;
        List<CommentImageModel> list;
        C177336xd I3 = I3();
        if (I3 != null && (aweme = I3.LJLLI) != null) {
            C0M6<String, Editable> c0m6 = this.LJLJLLL;
            String aid = aweme.getAid();
            C224748ru c224748ru = this.LJLLLLLL;
            if (c224748ru != null) {
                c0m6.LIZJ(aid, c224748ru.getEditableText());
                C176996x5 L1 = L1();
                if (L1 != null && (list = L1.LJZL) != null) {
                    this.LJLL.LIZJ(aweme.getAid(), list);
                    return;
                }
                return;
            }
            o.LJIJI("editTextComment");
            throw null;
        }
    }

    public final void N3() {
        W5F LJII = W5U.LJII(C78939UyV.LJ(((RBX) HG3.LJIILL()).getCurUser().getAvatarThumb()));
        C72434Sbm c72434Sbm = this.LL;
        if (c72434Sbm != null) {
            LJII.LJJIIJ = c72434Sbm;
            LJII.LJ();
            Y3();
            ImageView imageView = this.LJZL;
            if (imageView != null) {
                imageView.setVisibility(8);
                KeyboardVMV2 K3 = K3();
                K3.getClass();
                K3.setState(new AqS8S0010000_3(24));
                return;
            }
            o.LJIJI("replyWithVideoView");
            throw null;
        }
        o.LJIJI("ivAvatar");
        throw null;
    }

    public final void W3() {
        String str;
        Aweme aweme;
        String aid;
        Aweme aweme2;
        N3();
        InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        o.LJIIIZ(LJIIZILJ, "<this>");
        IKeyboardIconGroupAssemAbility iKeyboardIconGroupAssemAbility = (IKeyboardIconGroupAssemAbility) C55096Ljo.LIZ(LJIIZILJ, IKeyboardIconGroupAssemAbility.class, null);
        if (iKeyboardIconGroupAssemAbility != null) {
            iKeyboardIconGroupAssemAbility.VB();
        }
        C0M6<String, Editable> c0m6 = this.LJLJLLL;
        C177336xd I3 = I3();
        if (I3 != null && (aweme2 = I3.LJLLI) != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Editable LIZIZ = c0m6.LIZIZ(str);
        C0M6<String, List<CommentImageModel>> c0m62 = this.LJLL;
        C177336xd I32 = I3();
        if (I32 != null && (aweme = I32.LJLLI) != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        List<CommentImageModel> LIZIZ2 = c0m62.LIZIZ(str2);
        C224748ru c224748ru = this.LJLLLLLL;
        if (c224748ru != null) {
            c224748ru.setText(LIZIZ);
            BU(LIZIZ2);
            X3(null);
            return;
        }
        o.LJIJI("editTextComment");
        throw null;
    }

    public final void c4() {
        if (!C175276uJ.LIZ()) {
            return;
        }
        withState(K3(), new AqS169S0100000_3(this, 82));
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void ng() {
        CommentVideoModel.Type type;
        C177336xd I3 = I3();
        if (I3 != null) {
            type = I3.LJLJLLL;
        } else {
            type = null;
        }
        if (type != CommentVideoModel.Type.NONE) {
            K3().iv0(C177916yZ.LIZ, false);
        }
        ImageView imageView = this.LJZL;
        if (imageView != null) {
            KeyboardUtils.LIZIZ(imageView);
            C176996x5 L1 = L1();
            if (L1 != null) {
                L1.LJJIZ(type);
                return;
            }
            return;
        }
        o.LJIJI("replyWithVideoView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void onClickCloseUpvotePanel() {
        InterfaceC177046xA interfaceC177046xA;
        C176996x5 L1 = L1();
        if (L1 != null && (interfaceC177046xA = L1.LJLJJI) != null) {
            interfaceC177046xA.onClickCloseUpvotePanel();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C176996x5 L1 = L1();
        if (L1 != null) {
            C224748ru c224748ru = this.LJLLLLLL;
            if (c224748ru != null) {
                if (((CopyOnWriteArrayList) L1.LLIIIJ).contains(c224748ru)) {
                    ((CopyOnWriteArrayList) L1.LLIIIJ).remove(c224748ru);
                }
            } else {
                o.LJIJI("editTextComment");
                throw null;
            }
        }
        HG3.LJIIL();
        HG3.LJLJL.LJIILLIIL(this.LLFFF);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void LLZZ() {
        W3();
    }

    public static void L3(C018905p c018905p) {
        C71Y.LIZ("PhotoComment", "editText horizontallyFillEditBox");
        c018905p.endToStart = -1;
        c018905p.endToEnd = R.id.blk;
        c018905p.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
    }

    public static void M3(C018905p c018905p) {
        C71Y.LIZ("PhotoComment", "editText horizontallyTillIconGroup");
        c018905p.endToEnd = -1;
        c018905p.endToStart = R.id.ebo;
        c018905p.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void BU(List<CommentImageModel> list) {
        Aweme aweme;
        boolean z;
        C177336xd I3 = I3();
        String str = null;
        if (I3 != null) {
            aweme = I3.LJLLI;
        } else {
            aweme = null;
        }
        if (!C77321UWf.LIZLLL(aweme, false)) {
            return;
        }
        C176996x5 L1 = L1();
        if (L1 != null) {
            L1.LJZL = list;
        }
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C62846OlW c62846OlW = this.LJLZ;
            if (c62846OlW != null) {
                c62846OlW.setImageDrawable(null);
                K3().kv0(false);
                return;
            } else {
                o.LJIJI("commentPhotoView");
                throw null;
            }
        }
        C62846OlW c62846OlW2 = this.LJLZ;
        if (c62846OlW2 != null) {
            List<String> urlList = ((UrlModel) ListProtector.get(list, 0)).getUrlList();
            if (urlList != null) {
                str = (String) ListProtector.get(urlList, 0);
            }
            c62846OlW2.setImageURI(str);
            K3().kv0(true);
            return;
        }
        o.LJIJI("commentPhotoView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void Cl(String str) {
        X3(str);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void Fo(View view) {
        ActivityC45651qj LIZ;
        if (!Keva.getRepo("reply_with_video_bubble").getBoolean(((RBX) HG3.LJIILL()).getCurUserId(), false) && !C175276uJ.LIZIZ() && (LIZ = C212428Vi.LIZ(this)) != null) {
            if (this.LLD == null) {
                C139825eE c139825eE = new C139825eE(LIZ);
                c139825eE.LIZ.LIZIZ = view;
                c139825eE.LJI(WHL.TOP);
                c139825eE.LIZ.LJII = 5000L;
                c139825eE.LJIIJJI(R.string.dln);
                this.LLD = c139825eE.LIZJ();
            }
            InterfaceC82683Wch interfaceC82683Wch = this.LLD;
            if (interfaceC82683Wch != null) {
                interfaceC82683Wch.show();
            }
            Keva.getRepo("reply_with_video_bubble").storeBoolean(((RBX) HG3.LJIILL()).getCurUserId(), true);
            C176996x5 L1 = L1();
            if (L1 != null) {
                L1.LJJJJZI();
            }
        }
    }

    public final void P3(InterfaceC88472Yns<? super C177336xd, C76800UCe> interfaceC88472Yns) {
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55096Ljo.LJIIZILJ(this), C177336xd.class, "source_default_key");
        if (LIZLLL != null) {
            LIZLLL.LIZ(new AqS169S0100000_3(interfaceC88472Yns, (InterfaceC88472Yns<? super C177336xd, C76800UCe>) 79));
        }
    }

    public final void Q3(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("openSoftInput show soft input ");
        LIZ.append(z);
        C71Y.LIZLLL("KeyboardInputPanelV2Assem", X1D.LIZIZ(LIZ));
        C224748ru c224748ru = this.LJLLLLLL;
        if (c224748ru != null) {
            if (z) {
                U3();
                KeyboardUtils.LIZLLL(c224748ru);
                return;
            } else {
                KeyboardUtils.LIZIZ(c224748ru);
                return;
            }
        }
        o.LJIJI("editTextComment");
        throw null;
    }

    public final void R3(CharSequence charSequence) {
        View view = this.LJLLL;
        if (view != null) {
            view.setVisibility(8);
            TuxTextView tuxTextView = this.LJLLJ;
            if (tuxTextView != null) {
                ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                TuxTextView tuxTextView2 = this.LJLLJ;
                if (tuxTextView2 != null) {
                    tuxTextView2.setLayoutParams(marginLayoutParams);
                    TuxTextView tuxTextView3 = this.LJLLJ;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setVisibility(0);
                        TuxTextView tuxTextView4 = this.LJLLJ;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setGravity(8388627);
                            if (!TextUtils.isEmpty(charSequence)) {
                                TuxTextView tuxTextView5 = this.LJLLJ;
                                if (tuxTextView5 != null) {
                                    tuxTextView5.setText(charSequence);
                                    return;
                                } else {
                                    o.LJIJI("bannedView");
                                    throw null;
                                }
                            }
                            return;
                        }
                        o.LJIJI("bannedView");
                        throw null;
                    }
                    o.LJIJI("bannedView");
                    throw null;
                }
                o.LJIJI("bannedView");
                throw null;
            }
            o.LJIJI("bannedView");
            throw null;
        }
        o.LJIJI("commentInputRoot");
        throw null;
    }

    public final void X3(String str) {
        boolean z;
        Aweme aweme;
        Aweme aweme2;
        int commentInputViewType;
        Aweme aweme3;
        InterfaceC177046xA interfaceC177046xA;
        Comment commentInputReplyComment;
        Aweme aweme4;
        Aweme aweme5;
        boolean z2;
        CommentVideoModel.Type type;
        boolean z3;
        String str2 = str;
        C224748ru c224748ru = this.LJLLLLLL;
        if (c224748ru != null) {
            Editable text = c224748ru.getText();
            if (text == null || text.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            String str3 = "";
            if (z) {
                C224748ru c224748ru2 = this.LJLLLLLL;
                if (c224748ru2 != null) {
                    if (str2 == null) {
                        C177336xd I3 = I3();
                        if (C72O.LIZ()) {
                            Context context = x3().getContext();
                            if (I3 != null) {
                                aweme5 = I3.LJLLI;
                            } else {
                                aweme5 = null;
                            }
                            C176996x5 L1 = L1();
                            if (this.LLF == EnumC177736yH.POST_MODE) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (I3 != null) {
                                type = I3.LJLJLLL;
                            } else {
                                type = null;
                            }
                            if (type != CommentVideoModel.Type.COMMENT) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            str2 = new C177026x8(context, aweme5, L1, z2, z3, false).LIZ();
                        } else {
                            if (I3 != null) {
                                aweme = I3.LJLLI;
                            } else {
                                aweme = null;
                            }
                            int LJIJJ = C176996x5.LJIJJ(aweme);
                            Context context2 = x3().getContext();
                            if (I3 != null) {
                                aweme2 = I3.LJLLI;
                            } else {
                                aweme2 = null;
                            }
                            if (aweme2 == null) {
                                str2 = context2.getResources().getString(R.string.dix);
                            } else if (LJIJJ != 0) {
                                if (LJIJJ != 1) {
                                    if (LJIJJ != 2) {
                                        if (LJIJJ != 4) {
                                            C176996x5 L12 = L1();
                                            if (L12 != null) {
                                                InterfaceC177046xA interfaceC177046xA2 = L12.LJLJJI;
                                                if (interfaceC177046xA2 == null) {
                                                    commentInputViewType = 2;
                                                } else {
                                                    commentInputViewType = interfaceC177046xA2.getCommentInputViewType();
                                                }
                                                Integer valueOf = Integer.valueOf(commentInputViewType);
                                                if (valueOf != null) {
                                                    if (valueOf.intValue() == 2) {
                                                        C176996x5 L13 = L1();
                                                        if (L13 != null && L13.LJJIIZ()) {
                                                            str2 = context2.getResources().getString(R.string.q3o);
                                                        } else if (C7HV.LIZIZ.LJIL().LIZJ(aweme2)) {
                                                            str2 = context2.getResources().getString(R.string.q3p);
                                                        } else {
                                                            String string = context2.getResources().getString(R.string.dix);
                                                            C177336xd I32 = I3();
                                                            if (I32 != null) {
                                                                aweme4 = I32.LJLLI;
                                                            } else {
                                                                aweme4 = null;
                                                            }
                                                            str2 = C178406zM.LJI(aweme4, string);
                                                        }
                                                    } else if (valueOf.intValue() == 4) {
                                                        str2 = context2.getResources().getString(R.string.gll);
                                                    } else if (valueOf.intValue() == 7) {
                                                        str2 = context2.getResources().getString(R.string.bf8);
                                                    } else if (valueOf.intValue() == 3) {
                                                        C176996x5 L14 = L1();
                                                        if (L14 == null || (interfaceC177046xA = L14.LJLJJI) == null || (commentInputReplyComment = interfaceC177046xA.getCommentInputReplyComment()) == null) {
                                                            str2 = null;
                                                        } else {
                                                            Resources resources = context2.getResources();
                                                            Object[] objArr = new Object[1];
                                                            User user = commentInputReplyComment.getUser();
                                                            C176996x5 L15 = L1();
                                                            if (L15 != null) {
                                                                InterfaceC177046xA interfaceC177046xA3 = L15.LJLJJI;
                                                                if (interfaceC177046xA3 != null) {
                                                                    str3 = interfaceC177046xA3.getEventType();
                                                                }
                                                            } else {
                                                                str3 = null;
                                                            }
                                                            objArr[0] = C1799274i.LJ(user, str3);
                                                            str2 = resources.getString(R.string.gzy, objArr);
                                                        }
                                                    } else if (valueOf.intValue() == 1) {
                                                        String string2 = context2.getResources().getString(R.string.dix);
                                                        C177336xd I33 = I3();
                                                        if (I33 != null) {
                                                            aweme3 = I33.LJLLI;
                                                        } else {
                                                            aweme3 = null;
                                                        }
                                                        str2 = C178406zM.LJI(aweme3, string2);
                                                    }
                                                }
                                            }
                                            str2 = context2.getResources().getString(R.string.dix);
                                        } else {
                                            str2 = context2.getResources().getString(R.string.dix);
                                        }
                                    } else {
                                        str2 = context2.getResources().getString(R.string.dk7);
                                    }
                                } else {
                                    Resources resources2 = context2.getResources();
                                    o.LJIIIIZZ(resources2, "context.resources");
                                    if (AV1.LJIJI(aweme2.getAuthorUid())) {
                                        if (this.LLF == EnumC177736yH.POST_MODE) {
                                            str2 = resources2.getString(R.string.dix);
                                        } else {
                                            str2 = resources2.getString(R.string.dks);
                                        }
                                    } else if (this.LLF == EnumC177736yH.POST_MODE) {
                                        str2 = resources2.getString(R.string.dix);
                                    } else {
                                        str2 = resources2.getString(R.string.dm_);
                                    }
                                }
                            } else {
                                str2 = context2.getResources().getString(R.string.qa6);
                            }
                        }
                    }
                    c224748ru2.setHint(str2);
                } else {
                    o.LJIJI("editTextComment");
                    throw null;
                }
            } else {
                C224748ru c224748ru3 = this.LJLLLLLL;
                if (c224748ru3 != null) {
                    c224748ru3.setHint("");
                } else {
                    o.LJIJI("editTextComment");
                    throw null;
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tryUpdateHint to ");
            C224748ru c224748ru4 = this.LJLLLLLL;
            if (c224748ru4 != null) {
                LIZ.append((Object) c224748ru4.getHint());
                C71Y.LIZ("PhotoComment", X1D.LIZIZ(LIZ));
                return;
            } else {
                o.LJIJI("editTextComment");
                throw null;
            }
        }
        o.LJIJI("editTextComment");
        throw null;
    }

    public final void b4(boolean z) {
        C176996x5 L1;
        boolean z2;
        boolean z3;
        C224748ru c224748ru = this.LJLLLLLL;
        if (c224748ru != null) {
            Editable text = c224748ru.getText();
            if ((text != null && s.LJZI(text.toString()).toString().length() > 0) || ((L1 = L1()) != null && L1.LJZL != null)) {
                TuxIconView tuxIconView = this.LJLLI;
                if (tuxIconView != null) {
                    if (tuxIconView.getVisibility() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C177326xc c177326xc = (C177326xc) this.LLIFFJFJJ.getValue();
                    if (z && !z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c177326xc.LJI(true, z3, false, K3().getState().LLD);
                    return;
                }
                o.LJIJI("ivSend");
                throw null;
            }
            ((C177326xc) this.LLIFFJFJJ.getValue()).LJI(false, true, false, K3().getState().LLD);
            return;
        }
        o.LJIJI("editTextComment");
        throw null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Aweme aweme;
        Aweme aweme2;
        String str;
        ViewGroup viewGroup;
        o.LJIIIZ(view, "view");
        L1();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), IKeyboardProtocol.class, C47261Igj.LJJIJIL(this));
        C71Y.LIZLLL("KeyboardInputPanelV2Assem", "onViewCreated");
        View findViewById = view.findViewById(R.id.blk);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.comment_send_new_area)");
        this.LJLLI = (TuxIconView) findViewById;
        View findViewById2 = view.findViewById(R.id.ebo);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.icon_group_wrapper)");
        this.LJLLILLLL = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.bk7);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.comment_edit_new)");
        this.LJLLLLLL = (C224748ru) findViewById3;
        View findViewById4 = view.findViewById(R.id.iws);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.reply_with_video_new)");
        this.LJZL = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bjp);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.comment_avatar_new)");
        this.LL = (C72434Sbm) findViewById5;
        View findViewById6 = view.findViewById(R.id.bjt);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.comment_banned_hint_new)");
        this.LJLLJ = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.bk5);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.c…nt_edit_layout_new_input)");
        this.LJLLL = findViewById7;
        View findViewById8 = view.findViewById(R.id.fi1);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.layout_edit_box_background)");
        this.LJLLLL = findViewById8;
        View findViewById9 = view.findViewById(R.id.bla);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.comment_photo)");
        this.LJLZ = (C62846OlW) findViewById9;
        View findViewById10 = view.findViewById(R.id.blb);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.comment_photo_text)");
        this.LJZ = (TuxTextView) findViewById10;
        View findViewById11 = view.findViewById(R.id.c6h);
        o.LJIIIIZZ(findViewById11, "view.findViewById(R.id.delete_photo_icon)");
        this.LJZI = (FrameLayout) findViewById11;
        if (o.LJ(EF7.LJIILIIL, "local_test")) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            C110614Vt c110614Vt = new C110614Vt();
            int LIZIZ = C19N.LIZIZ(view, "view.context", R.attr.c6);
            if (LIZIZ == null) {
                LIZIZ = -16777216;
            }
            c110614Vt.LIZ = LIZIZ;
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "view.context");
            tuxTextView.setBackground(c110614Vt.LIZ(context2));
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
            tuxTextView.setText("New");
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                viewGroup.addView(tuxTextView, layoutParams);
            }
        }
        C8VV.LIZJ(this, new AqS169S0100000_3(this, 80));
        C224748ru c224748ru = this.LJLLLLLL;
        if (c224748ru != null) {
            C16880lQ.LJIIJ(new Au2S14S0100000_3(this, 3), c224748ru);
            int LJJI = C176996x5.LJJI(false);
            C224748ru c224748ru2 = this.LJLLLLLL;
            if (c224748ru2 != null) {
                if (LJJI > 0) {
                    C7K4 c7k4 = new C7K4(LJJI);
                    c7k4.LJLILLLLZI = c224748ru2.getContext().getResources().getString(R.string.cm8);
                    c224748ru2.setFilters(new InputFilter[]{c7k4});
                }
                C8YN.LJII(this, K3(), new TBT() { // from class: X.6xp
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C177616y5) obj).LLIIJI;
                    }
                }, C213688a4.LIZLLL(), new C178156yx(this), 4);
                C62846OlW c62846OlW = this.LJLZ;
                if (c62846OlW != null) {
                    C16880lQ.LJIIJ(new Au2S14S0100000_3(this, 4), c62846OlW);
                    FrameLayout frameLayout = this.LJZI;
                    if (frameLayout != null) {
                        C16880lQ.LJIIJ(new Au2S14S0100000_3(this, 5), frameLayout);
                        ImageView imageView = this.LJZL;
                        if (imageView != null) {
                            C16880lQ.LJIIJ(new Au2S14S0100000_3(this, 6), imageView);
                            TuxIconView tuxIconView = this.LJLLI;
                            if (tuxIconView != null) {
                                C16880lQ.LJIIJ(new Au2S14S0100000_3(this, 7), tuxIconView);
                                C224748ru c224748ru3 = this.LJLLLLLL;
                                if (c224748ru3 != null) {
                                    c224748ru3.setOnTouchListener(new IDTListenerS113S0100000_3(this, 1));
                                    C224748ru c224748ru4 = this.LJLLLLLL;
                                    if (c224748ru4 != null) {
                                        c224748ru4.addTextChangedListener(new IDObjectS176S0100000_3(this, 1));
                                        C8YN.LJII(this, K3(), new TBT() { // from class: X.6xl
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C177616y5) obj).LLIIIZ);
                                            }
                                        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 33), 4);
                                        C8YN.LJII(this, K3(), new TBT() { // from class: X.6xk
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return ((C177616y5) obj).LJLJJI;
                                            }
                                        }, null, new AqS185S0100000_3(this, 34), 6);
                                        C8YN.LJII(this, K3(), new TBT() { // from class: X.6xi
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C177616y5) obj).LJLLJ);
                                            }
                                        }, null, new AqS185S0100000_3(this, 35), 6);
                                        C8YN.LJII(this, K3(), new TBT() { // from class: X.6xq
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return ((C177616y5) obj).LLF;
                                            }
                                        }, null, new AqS185S0100000_3(this, 36), 6);
                                        C8YN.LJII(this, K3(), new TBT() { // from class: X.6xm
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C177616y5) obj).LJLJJLL);
                                            }
                                        }, C213688a4.LIZLLL(), C177166xM.LJLIL, 4);
                                        C8YN.LJII(this, K3(), new TBT() { // from class: X.6xj
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C177616y5) obj).LLD);
                                            }
                                        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 37), 4);
                                        C8YN.LJII(this, K3(), new TBT() { // from class: X.6xr
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return ((C177616y5) obj).LJLJLLL;
                                            }
                                        }, null, new AqS185S0100000_3(this, 29), 6);
                                        C8YN.LJII(this, K3(), new TBT() { // from class: X.6xn
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return ((C177616y5) obj).LLFII;
                                            }
                                        }, null, new AqS185S0100000_3(this, 30), 6);
                                        C8YN.LJII(this, K3(), new TBT() { // from class: X.6xo
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return ((C177616y5) obj).LLFZ;
                                            }
                                        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 31), 4);
                                        C177336xd I3 = I3();
                                        if (I3 != null) {
                                            aweme = I3.LJLLI;
                                        } else {
                                            aweme = null;
                                        }
                                        if (C77321UWf.LIZLLL(aweme, false)) {
                                            C8YN.LJII(this, K3(), new TBT() { // from class: X.6xh
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return Boolean.valueOf(((C177616y5) obj).LLI);
                                                }
                                            }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 32), 4);
                                        }
                                        HG3.LJIIL();
                                        HG3.LJLJL.LJIILJJIL(this.LLFFF);
                                        C71Y.LIZ("KeyboardInputPanelV2Assem", "input viewcreated");
                                        C88463da c88463da = C88463da.LIZ;
                                        TuxIconView tuxIconView2 = this.LJLLI;
                                        if (tuxIconView2 != null) {
                                            EnumC1796673i enumC1796673i = EnumC1796673i.BUTTON;
                                            C88463da.LIZJ(c88463da, tuxIconView2, enumC1796673i, 0.0f, 12);
                                            ImageView imageView2 = this.LJZL;
                                            if (imageView2 != null) {
                                                C88463da.LIZIZ(imageView2, enumC1796673i, 0.0f, null);
                                                C224748ru c224748ru5 = this.LJLLLLLL;
                                                if (c224748ru5 != null) {
                                                    Context context3 = c224748ru5.getContext();
                                                    o.LJIIIIZZ(context3, "editTextComment.context");
                                                    Integer LJI = C79045V0n.LJI(R.attr.bw, context3);
                                                    if (LJI != null) {
                                                        int intValue = LJI.intValue();
                                                        C224748ru c224748ru6 = this.LJLLLLLL;
                                                        if (c224748ru6 != null) {
                                                            c224748ru6.setMentionTextColor(intValue);
                                                        } else {
                                                            o.LJIJI("editTextComment");
                                                            throw null;
                                                        }
                                                    }
                                                    C224748ru c224748ru7 = this.LJLLLLLL;
                                                    if (c224748ru7 != null) {
                                                        c224748ru7.setMentionTextTypeface(1);
                                                        b4(false);
                                                        W3();
                                                        C177336xd I32 = I3();
                                                        if (I32 != null && (aweme2 = I32.LJLLI) != null && C77321UWf.LIZLLL(aweme2, false)) {
                                                            C177336xd I33 = I3();
                                                            if (I33 == null || (str = I33.LJLJJLL) == null) {
                                                                str = "";
                                                            }
                                                            C74Z.LJJIIJ(str);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    o.LJIJI("editTextComment");
                                                    throw null;
                                                }
                                                o.LJIJI("editTextComment");
                                                throw null;
                                            }
                                            o.LJIJI("replyWithVideoView");
                                            throw null;
                                        }
                                        o.LJIJI("ivSend");
                                        throw null;
                                    }
                                    o.LJIJI("editTextComment");
                                    throw null;
                                }
                                o.LJIJI("editTextComment");
                                throw null;
                            }
                            o.LJIJI("ivSend");
                            throw null;
                        }
                        o.LJIJI("replyWithVideoView");
                        throw null;
                    }
                    o.LJIJI("photoDeleteIcon");
                    throw null;
                }
                o.LJIJI("commentPhotoView");
                throw null;
            }
            o.LJIJI("editTextComment");
            throw null;
        }
        o.LJIJI("editTextComment");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void sZ(CommentVideoModel.Type commentVideoModelType) {
        o.LJIIIZ(commentVideoModelType, "commentVideoModelType");
        P3(new AqS169S0100000_3(commentVideoModelType, 81));
    }

    public final void O3(AbstractC177926ya abstractC177926ya, String str) {
        if (o.LJ(abstractC177926ya, C177906yY.LIZ)) {
            KeyboardVMV2 K3 = K3();
            K3.getClass();
            K3.withState(new AqS46S1200000_3((Comment) null, str, K3, 3));
            return;
        }
        K3().iv0(abstractC177926ya, false);
    }

    public final void Z3(boolean z, boolean z2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateEditMaxLines hasContent = ");
        LIZ.append(z);
        LIZ.append(", isKeyBoardShow = ");
        LIZ.append(z2);
        C71Y.LIZ("PhotoComment", X1D.LIZIZ(LIZ));
        if (z) {
            C224748ru c224748ru = this.LJLLLLLL;
            if (c224748ru != null) {
                c224748ru.setHint("");
                if (z2) {
                    C224748ru c224748ru2 = this.LJLLLLLL;
                    if (c224748ru2 != null) {
                        c224748ru2.setMaxLines(1);
                        if (C175276uJ.LIZ()) {
                            C224748ru c224748ru3 = this.LJLLLLLL;
                            if (c224748ru3 != null) {
                                int lineHeight = (int) (c224748ru3.getLineHeight() * 3.5d);
                                C224748ru c224748ru4 = this.LJLLLLLL;
                                if (c224748ru4 != null) {
                                    int paddingTop = c224748ru4.getPaddingTop() + lineHeight;
                                    C224748ru c224748ru5 = this.LJLLLLLL;
                                    if (c224748ru5 != null) {
                                        c224748ru3.setMaxHeight(c224748ru5.getPaddingBottom() + paddingTop);
                                    } else {
                                        o.LJIJI("editTextComment");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("editTextComment");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("editTextComment");
                                throw null;
                            }
                        } else {
                            C224748ru c224748ru6 = this.LJLLLLLL;
                            if (c224748ru6 != null) {
                                c224748ru6.setMaxLines(4);
                            } else {
                                o.LJIJI("editTextComment");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("editTextComment");
                        throw null;
                    }
                } else if (C175276uJ.LIZ()) {
                    C224748ru c224748ru7 = this.LJLLLLLL;
                    if (c224748ru7 != null) {
                        c224748ru7.setMaxLines(1);
                    } else {
                        o.LJIJI("editTextComment");
                        throw null;
                    }
                } else {
                    C224748ru c224748ru8 = this.LJLLLLLL;
                    if (c224748ru8 != null) {
                        c224748ru8.setMaxLines(4);
                    } else {
                        o.LJIJI("editTextComment");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("editTextComment");
                throw null;
            }
        } else {
            X3(null);
            C224748ru c224748ru9 = this.LJLLLLLL;
            if (c224748ru9 != null) {
                c224748ru9.setMaxLines(1);
            } else {
                o.LJIJI("editTextComment");
                throw null;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("editText maxLines = ");
        C224748ru c224748ru10 = this.LJLLLLLL;
        if (c224748ru10 != null) {
            LIZ2.append(c224748ru10.getMaxLines());
            LIZ2.append(" maxHeight = ");
            C224748ru c224748ru11 = this.LJLLLLLL;
            if (c224748ru11 != null) {
                LIZ2.append(c224748ru11.getMaxHeight());
                C71Y.LIZ("PhotoComment", X1D.LIZIZ(LIZ2));
                return;
            } else {
                o.LJIJI("editTextComment");
                throw null;
            }
        }
        o.LJIJI("editTextComment");
        throw null;
    }

    public final void a4(boolean z, boolean z2) {
        Aweme aweme;
        C177336xd I3 = I3();
        if (I3 != null) {
            aweme = I3.LJLLI;
        } else {
            aweme = null;
        }
        if (!C77321UWf.LIZLLL(aweme, false)) {
            return;
        }
        if (z) {
            if (z2) {
                C62846OlW c62846OlW = this.LJLZ;
                if (c62846OlW != null) {
                    c62846OlW.setVisibility(0);
                    FrameLayout frameLayout = this.LJZI;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                        TuxTextView tuxTextView = this.LJZ;
                        if (tuxTextView != null) {
                            tuxTextView.setVisibility(8);
                            C62846OlW c62846OlW2 = this.LJLZ;
                            if (c62846OlW2 != null) {
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(200L);
                                ofFloat.addUpdateListener(new AUListenerS90S0100000_1(c62846OlW2, 31));
                                ofFloat.addListener(new IDAListenerS72S0100000_3(c62846OlW2, 41));
                                ofFloat.start();
                                return;
                            }
                            o.LJIJI("commentPhotoView");
                            throw null;
                        }
                        o.LJIJI("commentPhotoText");
                        throw null;
                    }
                    o.LJIJI("photoDeleteIcon");
                    throw null;
                }
                o.LJIJI("commentPhotoView");
                throw null;
            }
            C62846OlW c62846OlW3 = this.LJLZ;
            if (c62846OlW3 != null) {
                c62846OlW3.setVisibility(8);
                FrameLayout frameLayout2 = this.LJZI;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                    TuxTextView tuxTextView2 = this.LJZ;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setVisibility(0);
                        return;
                    } else {
                        o.LJIJI("commentPhotoText");
                        throw null;
                    }
                }
                o.LJIJI("photoDeleteIcon");
                throw null;
            }
            o.LJIJI("commentPhotoView");
            throw null;
        }
        C62846OlW c62846OlW4 = this.LJLZ;
        if (c62846OlW4 != null) {
            c62846OlW4.setVisibility(8);
            FrameLayout frameLayout3 = this.LJZI;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(8);
                TuxTextView tuxTextView3 = this.LJZ;
                if (tuxTextView3 != null) {
                    tuxTextView3.setVisibility(8);
                    return;
                } else {
                    o.LJIJI("commentPhotoText");
                    throw null;
                }
            }
            o.LJIJI("photoDeleteIcon");
            throw null;
        }
        o.LJIJI("commentPhotoView");
        throw null;
    }
}
