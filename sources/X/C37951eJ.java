package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.1eJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37951eJ extends AbstractC14150h1<SoundEffect> {
    public SoundEffect LJLILLLLZI;

    static {
        C221108m2.LIZIZ(C28N.INSTANCE);
    }

    public static boolean LIZLLL(SoundEffect effect) {
        o.LJIIIZ(effect, "effect");
        return new File(C78983UzD.LJJIIJZLJL(C13C.LIZ(effect, ""))).exists();
    }

    @Override // X.AbstractC14150h1
    public final /* bridge */ /* synthetic */ boolean LIZIZ(SoundEffect soundEffect) {
        return LIZLLL(soundEffect);
    }

    public final void LIZJ(SoundEffect soundEffect, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        List<String> urls;
        o.LJIIIZ(soundEffect, "soundEffect");
        ImageModel imageModel = soundEffect.resourceUrl;
        if (imageModel == null || (urls = imageModel.getUrls()) == null || urls.isEmpty()) {
            interfaceC88472Yns.invoke(-3);
            return;
        }
        Object obj = ListProtector.get(urls, 0);
        o.LJIIIIZZ(obj, "resourceUrls[0]");
        C79258V8s.LIZ.LIZIZ(C13C.LIZ(soundEffect, (String) obj), new IDqS28S0300000(this, (C37951eJ) soundEffect, (SoundEffect) interfaceC88472Yns, (InterfaceC88472Yns<? super Integer, C76800UCe>) 28));
    }
}
