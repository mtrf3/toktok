package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.StickerContainerService;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6Uo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161266Uo extends FrameLayout {
    public InterfaceC161306Us LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C161266Uo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }

    public static void LIZ(C161266Uo c161266Uo, RectF rectF) {
        c161266Uo.getLayoutParams().width = (int) rectF.width();
        c161266Uo.getLayoutParams().height = (int) rectF.height();
        c161266Uo.setTranslationY(0.0f);
    }

    public static void LIZJ(C161266Uo c161266Uo, C161296Ur c161296Ur) {
        boolean z;
        int width;
        int height;
        InterfaceC161306Us interfaceC161306Us;
        Integer valueOf = Integer.valueOf(c161266Uo.getLayoutParams().width);
        if (valueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            width = valueOf.intValue();
        } else {
            width = c161266Uo.getWidth();
        }
        Integer valueOf2 = Integer.valueOf(c161266Uo.getLayoutParams().height);
        if (valueOf2.intValue() > 0) {
            height = valueOf2.intValue();
        } else {
            height = c161266Uo.getHeight();
        }
        c161266Uo.LJLIL = StickerContainerService.LIZ().getContainer();
        Context context = c161266Uo.getContext();
        o.LJIIIIZZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (interfaceC161306Us = c161266Uo.LJLIL) != null) {
            interfaceC161306Us.LIZIZ(new C6UA(EnumC161246Um.INTERACT, c161266Uo, new C6UD(width, height, 0, 0, 1.0f), LJJIFFI, c161296Ur, null, null, null, null, 992));
        }
    }

    public final void LIZIZ(Aweme aweme, List stickers) {
        o.LJIIIZ(stickers, "stickers");
        InterfaceC161306Us interfaceC161306Us = this.LJLIL;
        if (interfaceC161306Us != null) {
            interfaceC161306Us.LIZ(stickers, null);
        }
    }
}
