package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3gM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90183gM extends FrameLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;

    public final void setDigitLimit(int i) {
    }

    public final void setMaxAvatarNumber(int i) {
        this.LJLJI = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90183gM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C7MY.LIZIZ(18);
        this.LJLILLLLZI = C7MY.LIZIZ(32);
        this.LJLJI = 3;
        this.LJLJJI = true;
    }

    public final void LIZ(long j, List list) {
        Number valueOf;
        if (list == null || list.isEmpty()) {
            return;
        }
        setVisibility(0);
        removeAllViews();
        if (this.LJLJJI) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    User user = (User) obj;
                    if (i < this.LJLJI) {
                        addView(LIZIZ(user, i));
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        } else {
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i3 = size - 1;
                    addView(LIZIZ((User) ListProtector.get(list, size), size));
                    if (i3 < 0) {
                        break;
                    } else {
                        size = i3;
                    }
                }
            }
        }
        int size2 = list.size();
        int i4 = this.LJLJI;
        if (size2 <= i4 && j <= i4) {
            return;
        }
        if (j <= i4) {
            valueOf = Integer.valueOf(size2);
        } else {
            valueOf = Long.valueOf(j);
        }
        long longValue = valueOf.longValue();
        int i5 = this.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('+');
        LIZ.append(C77123UOp.LJJIIJ(longValue - i5));
        String LIZIZ = X1D.LIZIZ(LIZ);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bl1, C16880lQ.LLZIL(getContext()), null);
        LLLZIIL.setMinimumWidth(this.LJLILLLLZI);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, this.LJLILLLLZI);
        if (C90193gN.LIZIZ(LLLZIIL.getContext())) {
            layoutParams.setMargins(0, 0, this.LJLIL * i5, 0);
        } else {
            layoutParams.setMargins(this.LJLIL * i5, 0, 0, 0);
        }
        LLLZIIL.setLayoutParams(layoutParams);
        ((TextView) LLLZIIL.findViewById(R.id.mck)).setText(LIZIZ);
        addView(LLLZIIL);
    }

    public final View LIZIZ(User user, int i) {
        UrlModel avatarThumb;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bo9, C16880lQ.LLZIL(getContext()), null);
        int i2 = this.LJLILLLLZI;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        if (C90193gN.LIZIZ(LLLZIIL.getContext())) {
            layoutParams.setMargins(0, 0, this.LJLIL * i, 0);
        } else {
            layoutParams.setMargins(this.LJLIL * i, 0, 0, 0);
        }
        LLLZIIL.setLayoutParams(layoutParams);
        C71799SFv avatarView = (C71799SFv) LLLZIIL.findViewById(R.id.abh);
        if (user != null && (avatarThumb = user.getAvatarThumb()) != null) {
            o.LJIIIIZZ(avatarView, "avatarView");
            C71799SFv.LJIIJ(avatarView, C78939UyV.LJ(avatarThumb), null, false, null, 126);
        }
        return LLLZIIL;
    }

    public final void LIZJ(int i, int i2) {
        if ((i != this.LJLILLLLZI || i2 != this.LJLIL) && getChildCount() > 0) {
            removeAllViews();
        }
        this.LJLILLLLZI = i;
        this.LJLIL = i2;
    }
}
