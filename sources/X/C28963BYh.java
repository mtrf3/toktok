package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Locale;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BYh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28963BYh extends FrameLayout implements InterfaceC76931UHf {
    public final C47121t6 LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final C41081jM LJLJI;

    @Override // X.InterfaceC76931UHf
    public final boolean LJIL(int i) {
        return false;
    }

    @Override // X.InterfaceC76931UHf
    public final boolean LJJLIL() {
        return false;
    }

    public final void setupLayout(GiftPanelBanner giftPanelBanner) {
        String str;
        Text text;
        Text text2;
        C47121t6 c47121t6 = this.LJLIL;
        C86881Y7x LIZIZ = C86881Y7x.LIZIZ();
        ImageModel imageModel = null;
        if (giftPanelBanner != null && (text2 = giftPanelBanner.displayText) != null) {
            str = text2.key;
        } else {
            str = null;
        }
        String LIZ = LIZIZ.LIZ(str);
        if ((LIZ == null || !C29306Beo.LJIJJLI(LIZ)) && (giftPanelBanner == null || (text = giftPanelBanner.displayText) == null || (LIZ = text.defaultPattern) == null)) {
            LIZ = "";
        }
        c47121t6.setText(LIZ);
        C41081jM c41081jM = this.LJLJI;
        if (giftPanelBanner != null) {
            imageModel = giftPanelBanner.leftIcon;
        }
        C78609UtB.LJJJJL(c41081jM, imageModel, c41081jM.getMeasuredWidth(), this.LJLJI.getMeasuredHeight());
        C29306Beo.LJJJLL(this, 500L, new AqS136S0200000_5(giftPanelBanner, this, 8));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28963BYh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.d68, this);
        View findViewById = findViewById(R.id.lw8);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tvDescription)");
        this.LJLIL = (C47121t6) findViewById;
        View findViewById2 = findViewById(R.id.lxc);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tvProgress)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
        View findViewById3 = findViewById(R.id.ewg);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.ivLeftIcon)");
        this.LJLJI = (C41081jM) findViewById3;
    }

    public static void LIZ(BZI bzi, String str) {
        String str2;
        bzi.LJIJJ(BJM.LJFF(), "enter_from_merge");
        bzi.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        bzi.LJIJJ(Long.valueOf(BJM.LJIILJJIL()), "room_id");
        bzi.LJIJJ(Long.valueOf(BJM.LJ()), "anchor_id");
        bzi.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        bzi.LJIJJ(str, "goal_status");
        if (C32257ClJ.LJFF() == 1) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        bzi.LJIJJ(str2, "user_type");
    }

    public final void LIZIZ(long j, long j2, boolean z) {
        SpannableString spannableString;
        int i;
        int i2 = 0;
        if (CCJ.LIZ(getContext())) {
            spannableString = new SpannableString(C63144OqK.LIZIZ(new Object[]{Long.valueOf(j2), Long.valueOf(j)}, 2, Locale.US, "%d/%d", "format(locale, format, *args)"));
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.c6, context);
            if (LJI != null) {
                i2 = LJI.intValue();
            }
            spannableString.setSpan(new ForegroundColorSpan(i2), String.valueOf(j2).length() + 1, spannableString.toString().length(), 33);
        } else {
            spannableString = new SpannableString(C63144OqK.LIZIZ(new Object[]{Long.valueOf(j), Long.valueOf(j2)}, 2, Locale.US, "%d/%d", "format(locale, format, *args)"));
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            Integer LJI2 = C79045V0n.LJI(R.attr.c6, context2);
            if (LJI2 != null) {
                i = LJI2.intValue();
            } else {
                i = 0;
            }
            spannableString.setSpan(new ForegroundColorSpan(i), 0, String.valueOf(j).length(), 33);
        }
        this.LJLILLLLZI.setText(spannableString);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateProgress ");
        LIZ.append(z);
        C0NB.LJIIIZ("GiftGoalPanel", X1D.LIZIZ(LIZ));
        if (z) {
            String obj = spannableString.toString();
            BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_goal_gift_banner_show");
            LIZ2.LJIIZILJ();
            LIZ(LIZ2, obj);
            LIZ2.LJJIIJZLJL();
        }
    }
}
