package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.IDqS182S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7Jq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183907Jq extends AbstractC183947Ju {
    public static final /* synthetic */ int LJLL = 0;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C183907Jq(Context context) {
        this(context, null, 6, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C183907Jq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    private final C119624mk getAvatarEnd() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-avatarEnd>(...)");
        return (C119624mk) value;
    }

    private final FrameLayout getAvatarLL() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-avatarLL>(...)");
        return (FrameLayout) value;
    }

    private final C119624mk getAvatarMiddle() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-avatarMiddle>(...)");
        return (C119624mk) value;
    }

    private final C119624mk getAvatarStart() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-avatarStart>(...)");
        return (C119624mk) value;
    }

    private final View getUpvoteTVContainer() {
        return (View) this.LJLJJLL.getValue();
    }

    private final void setAvatar(InterfaceC88473Ynt<? super C119624mk, ? super C119624mk, ? super C119624mk, C76800UCe> interfaceC88473Ynt) {
        FrameLayout avatarLL = getAvatarLL();
        if (avatarLL.getLayoutParams().width != -2) {
            ViewGroup.LayoutParams layoutParams = avatarLL.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                avatarLL.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        interfaceC88473Ynt.invoke(getAvatarStart(), getAvatarMiddle(), getAvatarEnd());
    }

    public final String LJJZ(String str, String str2) {
        StaticLayout staticLayout;
        String str3 = str2;
        if (str3 == null) {
            if (str != null) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    if (ORY.LJJIJIIJIL(Character.valueOf(str.charAt(i)), new Character[]{'\n', '\r'})) {
                        if (i <= 0) {
                            return str;
                        }
                        String substring = str.substring(0, i);
                        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        return substring;
                    }
                }
                return str;
            }
            return null;
        }
        if (str == null) {
            return str;
        }
        String LIZIZ = Q8U.LIZIZ(new Object[]{str3}, 1, str, "format(this, *args)");
        double maxWidth = getMaxWidth() * 0.5d;
        if (getUpvoteTV().getPaint().measureText(LIZIZ) < maxWidth) {
            return LIZIZ;
        }
        TextPaint paint = getUpvoteTV().getPaint();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("...");
        LIZ.append(str);
        int ceil = (int) (maxWidth - ((float) Math.ceil(paint.measureText(X1D.LIZIZ(LIZ)))));
        StringBuilder LIZ2 = X1D.LIZ();
        if (ceil >= 0 && ceil < getUpvoteTV().getPaint().measureText(str3)) {
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = StaticLayout.Builder.obtain(str3, 0, str3.length(), getUpvoteTV().getPaint(), ceil).build();
            } else {
                staticLayout = new StaticLayout(str3, getUpvoteTV().getPaint(), ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            o.LJIIIIZZ(staticLayout, "if (Build.VERSION.SDK_IN…e\n            )\n        }");
            str3 = str3.substring(0, staticLayout.getLineEnd(0));
            o.LJIIIIZZ(str3, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return Q8U.LIZIZ(new Object[]{C90193gN.LIZJ(JBR.LJFF(LIZ2, str3, "...", LIZ2))}, 1, str, "format(this, *args)");
    }

    public final void LJJZZI(long j, List upvoteList) {
        boolean z;
        Object obj;
        UpvoteStruct upvoteStruct;
        String str;
        String quantityString;
        User user;
        String nickname;
        o.LJIIIZ(upvoteList, "upvoteList");
        setTag(upvoteList);
        setAvatar(new C7IY(j, this, upvoteList));
        if ((((Number) C183917Jr.LIZ.getValue()).intValue() & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z || j == 1) {
            Iterator it = upvoteList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (!C1FP.LJII((UpvoteStruct) obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            upvoteStruct = (UpvoteStruct) obj;
        } else {
            upvoteStruct = null;
        }
        String str3 = "";
        if (upvoteStruct != null) {
            if (o.LJ(getTag(), upvoteStruct)) {
                return;
            }
            setTag(UpvoteStruct.copy$default(upvoteStruct, null, null, null, 0L, 0, 0, null, false, 0, false, null, 0, false, null, null, false, null, 0L, false, 0, 0, null, false, null, null, false, 67108863, null));
            setAvatar(new IDqS182S0200000_3(this, upvoteStruct, 1));
            if (C1FP.LJIILL(upvoteStruct)) {
                Context context = getContext();
                if (context != null) {
                    str3 = context.getString(R.string.dih);
                } else {
                    str3 = null;
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(upvoteStruct.getText());
            LIZ.append(' ');
            LIZ.append(str3);
            LJJZZIII(X1D.LIZIZ(LIZ), null, true);
            return;
        }
        if (j == 1) {
            UpvoteStruct upvoteStruct2 = (UpvoteStruct) ORZ.LJLLLLLL(0, upvoteList);
            if (upvoteStruct2 != null) {
                user = upvoteStruct2.getUser();
            } else {
                user = null;
            }
            if (AV1.LJIJ(user)) {
                if ((((Number) C183917Jr.LIZ.getValue()).intValue() & 2) == 2) {
                    LJJZZIII(getContext().getString(R.string.q3g), null, false);
                    return;
                } else {
                    LJJZZIII(getContext().getString(R.string.g7m), null, false);
                    return;
                }
            }
            Context context2 = getContext();
            if (context2 != null) {
                str2 = context2.getString(R.string.q3f);
            }
            if ((((Number) C183917Jr.LIZ.getValue()).intValue() & 2) == 2 && user != null && (nickname = user.getNickname()) != null) {
                str3 = nickname;
            }
            LJJZZIII(str2, str3, false);
            return;
        }
        Resources resources = getResources();
        if (resources != null && (quantityString = resources.getQuantityString(R.plurals.s5, (int) j)) != null) {
            str = Q8U.LIZIZ(new Object[]{Integer.valueOf((int) j)}, 1, quantityString, "format(this, *args)");
        } else {
            str = null;
        }
        LJJZZIII(str, null, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C183907Jq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.drk, this, true);
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLJJL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1217));
        this.LJLJJLL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1220));
        this.LJLJL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1219));
        this.LJLJLJ = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1218));
        this.LJLJLLL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1216));
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJLL(android.content.Context r2, X.C119624mk r3, com.ss.android.ugc.aweme.base.model.UrlModel r4) {
        /*
            if (r4 == 0) goto L9
            X.C78765Uvh.LJFF(r3, r4)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L1a
        L9:
            X.89v r1 = new X.89v
            r1.<init>()
            r0 = 2131755571(0x7f100233, float:1.9142025E38)
            r1.LIZ = r0
            X.SY9 r0 = r1.LIZ(r2)
            r3.setImageDrawable(r0)
        L1a:
            r0 = 0
            r3.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183907Jq.LJJLL(android.content.Context, X.4mk, com.ss.android.ugc.aweme.base.model.UrlModel):void");
    }

    public final void LJJZZIII(String str, String str2, boolean z) {
        if (z) {
            if (getWhiteBarStyle() != 4) {
                getTouchArea().setBackground(getWhiteBarBG());
                getUpvoteTV().setTuxFont(62);
                View upvoteTVContainer = getUpvoteTVContainer();
                if (upvoteTVContainer != null) {
                    C26338AVi.LJI(upvoteTVContainer, C1FJ.LIZIZ(3), null, C1FJ.LIZIZ(7), null, false, 26);
                }
                C26338AVi.LJI(getUpvoteTV(), null, C1FJ.LIZIZ(5), null, C1FJ.LIZIZ(7), false, 21);
                getUpvoteTV().setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
            getUpvoteTV().setText(LJJZ(str, str2));
            getUpvoteTV().setTextColorRes(R.attr.go);
            setWhiteBarStyle(4);
        } else {
            if (getWhiteBarStyle() != 3) {
                getTouchArea().setBackground(getWhiteBarBG());
                View upvoteTVContainer2 = getUpvoteTVContainer();
                if (upvoteTVContainer2 != null) {
                    C26338AVi.LJI(upvoteTVContainer2, C1FJ.LIZIZ(3), null, C1FJ.LIZIZ(7), null, false, 26);
                }
                C26338AVi.LJI(getUpvoteTV(), null, C1FJ.LIZIZ(5), null, C1FJ.LIZIZ(7), false, 21);
                getUpvoteTV().setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
            TuxTextView upvoteTV = getUpvoteTV();
            C72062SPy c72062SPy = new C72062SPy();
            String LJJZ = LJJZ(str, str2);
            if (LJJZ == null) {
                LJJZ = "";
            }
            c72062SPy.LIZIZ = LJJZ;
            c72062SPy.LIZ = false;
            c72062SPy.LJ(1);
            c72062SPy.LIZIZ(62);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            upvoteTV.setText(c72062SPy.LIZ(context));
            setWhiteBarStyle(3);
        }
        LJJLJLI(0, 0);
    }

    public /* synthetic */ C183907Jq(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
