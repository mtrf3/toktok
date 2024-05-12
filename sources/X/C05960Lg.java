package X;

import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStickerFavoriteAnimationSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.a1;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Lg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05960Lg extends LinearLayout {
    public final int LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public boolean LJLJJI;
    public LiveEffect LJLJJL;
    public InterfaceC05950Lf LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public DataChannel LJLL;

    public final C47121t6 getFavoriteTextView() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-favoriteTextView>(...)");
        return (C47121t6) value;
    }

    public final C1HK getMIconIV() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-mIconIV>(...)");
        return (C1HK) value;
    }

    public final InterfaceC05950Lf getFavoriteStatusListener() {
        return this.LJLJJLL;
    }

    public final int getMinWidth() {
        return this.LJLIL;
    }

    public final boolean getShowEnable() {
        return this.LJLJL;
    }

    public final void setFavoriteStatusListener(InterfaceC05950Lf interfaceC05950Lf) {
        this.LJLJJLL = interfaceC05950Lf;
    }

    public final void setShowEnable(boolean z) {
        this.LJLJL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05960Lg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C15380j0.LIZ(32.0f);
        this.LJLILLLLZI = C221108m2.LIZIZ(new IDqS420S0100000(this, 74));
        this.LJLJI = C221108m2.LIZIZ(new IDqS420S0100000(this, 73));
        this.LJLJL = true;
    }

    public final void LIZ(LiveEffect liveEffect, boolean z) {
        LIZIZ(liveEffect, z, new IDqS420S0100000(this, 58));
    }

    public final void LIZIZ(LiveEffect liveEffect, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (!this.LJLJL) {
            setVisibility(8);
            return;
        }
        if (liveEffect == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        LiveStickerFavoriteAnimationSetting liveStickerFavoriteAnimationSetting = LiveStickerFavoriteAnimationSetting.INSTANCE;
        if (liveStickerFavoriteAnimationSetting.isDefault()) {
            C29306Beo.LJI(getFavoriteTextView());
        } else if (liveStickerFavoriteAnimationSetting.isV1()) {
            C29306Beo.LJJLJLI(getFavoriteTextView());
        } else if (liveStickerFavoriteAnimationSetting.isV2() && !z && !o.LJ(liveEffect, this.LJLJJL)) {
            Integer LIZJ = InterfaceC30442Bx8.LLLLLZ.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_STICKER_FAVORITE_ANIMATION_TIME.value");
            if (LIZJ.intValue() < 3) {
                long currentTimeMillis = System.currentTimeMillis();
                Long LIZJ2 = InterfaceC30442Bx8.LLLLLLZZ.LIZJ();
                o.LJIIIIZZ(LIZJ2, "LIVE_STICKER_FAVORITE_AN…ION_VALIDITY_PERIOD.value");
                if (currentTimeMillis > LIZJ2.longValue()) {
                    postDelayed(new IDRunnableS85S0100000(this, 65), 300L);
                }
            }
        }
        this.LJLJJL = liveEffect;
        this.LJLJJI = z;
        interfaceC65784Pro.invoke();
    }
}
