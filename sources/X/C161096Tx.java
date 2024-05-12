package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Tx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161096Tx extends AbstractC161116Tz<AddYoursStickerModel> {
    public static final /* synthetic */ int LJLLI = 0;
    public C1NS<AddYoursStickerModel> LJLJJL;
    public LifecycleOwner LJLJJLL;
    public C6SN LJLJL;
    public TextView LJLJLJ;
    public OPW LJLJLLL;
    public List<AddYoursAvatar> LJLL;

    public final OPW getAvatarListView() {
        OPW opw = this.LJLJLLL;
        if (opw != null) {
            return opw;
        }
        o.LJIJI("avatarListView");
        throw null;
    }

    public final C6SN getContentEditText() {
        C6SN c6sn = this.LJLJL;
        if (c6sn != null) {
            return c6sn;
        }
        o.LJIJI("contentEditText");
        throw null;
    }

    public final TextView getContentTextView() {
        TextView textView = this.LJLJLJ;
        if (textView != null) {
            return textView;
        }
        o.LJIJI("contentTextView");
        throw null;
    }

    public final void LIZLLL() {
        TextView textView;
        C6SN c6sn;
        View findViewById = findViewById(R.id.ab5);
        if ((findViewById instanceof C6SN) && (c6sn = (C6SN) findViewById) != null) {
            setContentEditText(c6sn);
        }
        View findViewById2 = findViewById(R.id.ab5);
        if ((findViewById2 instanceof TextView) && (textView = (TextView) findViewById2) != null) {
            setContentTextView(textView);
        }
        View findViewById3 = findViewById(R.id.ab2);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.av_add_yours_avatar_list)");
        setAvatarListView((OPW) findViewById3);
    }

    public final void setAvatarListView(OPW opw) {
        o.LJIIIZ(opw, "<set-?>");
        this.LJLJLLL = opw;
    }

    public final void setContentEditText(C6SN c6sn) {
        o.LJIIIZ(c6sn, "<set-?>");
        this.LJLJL = c6sn;
    }

    public final void setContentTextView(TextView textView) {
        o.LJIIIZ(textView, "<set-?>");
        this.LJLJLJ = textView;
    }

    public final void LIZ(C1NS<AddYoursStickerModel> container, LifecycleOwner owner) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(owner, "owner");
        this.LJLJJL = container;
        this.LJLJJLL = owner;
        LIZLLL();
        C1NS<AddYoursStickerModel> c1ns = this.LJLJJL;
        if (c1ns != null) {
            LiveState<V> LIZ = c1ns.LIZ(new TBT() { // from class: X.6TS
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((AddYoursStickerModel) obj).getVisible());
                }
            });
            LifecycleOwner lifecycleOwner = this.LJLJJLL;
            if (lifecycleOwner == null) {
                o.LJIJI("lifecycleOwner");
                throw null;
            }
            LIZ.LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 606));
            C1NS<AddYoursStickerModel> c1ns2 = this.LJLJJL;
            if (c1ns2 != null) {
                LiveState<V> LIZ2 = c1ns2.LIZ(new TBT() { // from class: X.6TV
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((AddYoursStickerModel) obj).getEditable());
                    }
                });
                LifecycleOwner lifecycleOwner2 = this.LJLJJLL;
                if (lifecycleOwner2 == null) {
                    o.LJIJI("lifecycleOwner");
                    throw null;
                }
                LIZ2.LJIIIIZZ(lifecycleOwner2, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 608));
                C1NS<AddYoursStickerModel> c1ns3 = this.LJLJJL;
                if (c1ns3 != null) {
                    LiveState<V> LIZ3 = c1ns3.LIZ(new TBT() { // from class: X.6Sk
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((AddYoursStickerModel) obj).getTopicText();
                        }
                    });
                    LifecycleOwner lifecycleOwner3 = this.LJLJJLL;
                    if (lifecycleOwner3 == null) {
                        o.LJIJI("lifecycleOwner");
                        throw null;
                    }
                    LIZ3.LJIIIIZZ(lifecycleOwner3, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 609));
                    C1NS<AddYoursStickerModel> c1ns4 = this.LJLJJL;
                    if (c1ns4 != null) {
                        LiveState<V> LIZ4 = c1ns4.LIZ(new TBT() { // from class: X.6TT
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((AddYoursStickerModel) obj).getClickable());
                            }
                        });
                        LifecycleOwner lifecycleOwner4 = this.LJLJJLL;
                        if (lifecycleOwner4 == null) {
                            o.LJIJI("lifecycleOwner");
                            throw null;
                        }
                        LIZ4.LJIIIIZZ(lifecycleOwner4, Lifecycle.State.STARTED, new C161086Tw(this));
                        C1NS<AddYoursStickerModel> c1ns5 = this.LJLJJL;
                        if (c1ns5 != null) {
                            LiveState<V> LIZ5 = c1ns5.LIZ(new TBT() { // from class: X.6TU
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((AddYoursStickerModel) obj).getAvatars();
                                }
                            });
                            LifecycleOwner lifecycleOwner5 = this.LJLJJLL;
                            if (lifecycleOwner5 == null) {
                                o.LJIJI("lifecycleOwner");
                                throw null;
                            }
                            LIZ5.LJIIIIZZ(lifecycleOwner5, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 605));
                            return;
                        }
                        o.LJIJI("stateContainer");
                        throw null;
                    }
                    o.LJIJI("stateContainer");
                    throw null;
                }
                o.LJIJI("stateContainer");
                throw null;
            }
            o.LJIJI("stateContainer");
            throw null;
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    @Override // X.AbstractC161116Tz, X.C6UF
    public final void LIZIZ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        float f;
        List<? extends UrlModel> list;
        C161296Ur c161296Ur;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        C6U3 c6u3;
        List<AddYoursAvatar> list2;
        int i;
        int i2;
        long j;
        boolean z;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro2;
        Long videoCount;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro3;
        InterfaceC65784Pro<Integer> interfaceC65784Pro4;
        this.LJLJJI = interactStickerStruct;
        C6UA interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam != null && (c6u3 = interactStickerContainerCommonParam.LJII) != null) {
            int i3 = c6u3.LJLIL;
            AddYoursStickerStruct addYoursStickerStruct = interactStickerStruct.getAddYoursStickerStruct();
            if (addYoursStickerStruct == null || (list2 = addYoursStickerStruct.getUserAvatars()) == null) {
                list2 = C61878OQg.INSTANCE;
            }
            C161296Ur c161296Ur2 = getInteractStickerContainerCommonParam().LJ;
            if (c161296Ur2 != null && (interfaceC65784Pro4 = c161296Ur2.LIZLLL) != null) {
                i = interfaceC65784Pro4.invoke().intValue();
            } else {
                i = R.string.bcp;
            }
            C161296Ur c161296Ur3 = getInteractStickerContainerCommonParam().LJ;
            if (c161296Ur3 != null && (interfaceC65784Pro3 = c161296Ur3.LIZIZ) != null && interfaceC65784Pro3.invoke().booleanValue()) {
                i2 = R.raw.icon_two_person_large_fill;
            } else {
                i2 = R.raw.icon_camera_fill;
            }
            AddYoursStickerStruct addYoursStickerStruct2 = interactStickerStruct.getAddYoursStickerStruct();
            if (addYoursStickerStruct2 != null && (videoCount = addYoursStickerStruct2.getVideoCount()) != null) {
                j = videoCount.longValue();
            } else {
                j = 0;
            }
            C161296Ur c161296Ur4 = getInteractStickerContainerCommonParam().LJ;
            if (c161296Ur4 != null && (interfaceC65784Pro2 = c161296Ur4.LIZIZ) != null && !interfaceC65784Pro2.invoke().booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            C161366Uy c161366Uy = new C161366Uy(i2, i, null, list2, j, null, 0.0f, true, z, 258927);
            if (i3 == C6U1.LARGER_WHITE.getValue()) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                C6UJ.LIZ(context, c161366Uy, this);
            } else if (i3 == C6U1.SMALLER_WHITE.getValue()) {
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                C6UJ.LIZIZ(context2, c161366Uy, this);
            } else if (i3 == C6U1.LARGER_BLACK.getValue()) {
                Context context3 = getContext();
                o.LJIIIIZZ(context3, "context");
                C6UJ.LIZJ(context3, c161366Uy, this);
            } else if (i3 == C6U1.SMALLER_BLACK.getValue()) {
                Context context4 = getContext();
                o.LJIIIIZZ(context4, "context");
                C6UJ.LIZLLL(context4, c161366Uy, this);
            }
        }
        C6UA interactStickerContainerCommonParam2 = getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam2 != null && (c161296Ur = interactStickerContainerCommonParam2.LJ) != null && (interfaceC65784Pro = c161296Ur.LIZIZ) != null && interfaceC65784Pro.invoke().booleanValue()) {
            f = 0.5f;
        } else {
            f = 0.9f;
        }
        setAlpha(f);
        LIZLLL();
        if (this.LJLJL != null) {
            getContentEditText().setText(interactStickerStruct.getAddYoursStickerStruct().getText());
        } else if (this.LJLJLJ != null) {
            getContentTextView().setText(interactStickerStruct.getAddYoursStickerStruct().getText());
        }
        OPW avatarListView = getAvatarListView();
        List<AddYoursAvatar> userAvatars = interactStickerStruct.getAddYoursStickerStruct().getUserAvatars();
        if (userAvatars != null) {
            list = C62819Ol5.LJIIZILJ(userAvatars);
        } else {
            list = null;
        }
        avatarListView.LIZJ(list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C161096Tx(Context context, C6U1 stickerUIType, C161366Uy c161366Uy) {
        super(context, (AttributeSet) null, 0, 14);
        FrameLayout.LayoutParams layoutParams;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerUIType, "stickerUIType");
        new LinkedHashMap();
        int i = C6U0.LIZ[stickerUIType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C6UJ.LIZLLL(context, c161366Uy, this);
                    }
                } else {
                    C6UJ.LIZJ(context, c161366Uy, this);
                }
            } else {
                C6UJ.LIZIZ(context, c161366Uy, this);
            }
        } else {
            C6UJ.LIZ(context, c161366Uy, this);
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (!(layoutParams2 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams2) == null) {
            return;
        }
        layoutParams.gravity = 17;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C161096Tx(android.content.Context r3, X.C6UA r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 8
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r3, r0)
            r0 = 0
            r2.<init>(r3, r1, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161096Tx.<init>(android.content.Context, X.6UA, int):void");
    }
}
