package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.bytedance.common.utility.BitmapUtils;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import java.io.File;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.4K0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4K0 extends AbstractC65781Prl implements InterfaceC65784Pro<C107554Jz> {
    public static final C4K0 LJLIL = new C4K0();

    public C4K0() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.4Jz] */
    @Override // X.InterfaceC65784Pro
    public final C107554Jz invoke() {
        final C4K5 c4k5 = (C4K5) C4K5.LJFF.getValue();
        return new C4VS(c4k5) { // from class: X.4Jz
            public final C4K5 LIZ;
            public final C3VM LIZIZ;

            @Override // X.C4VS
            public final String LIZIZ() {
                return null;
            }

            {
                C84683Ua c84683Ua;
                InterfaceC106314Ff performanceService;
                o.LJIIIZ(c4k5, "geckoEmojiCacheManager");
                this.LIZ = c4k5;
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                if (createIIMServicebyMonsterPlugin != null && (performanceService = createIIMServicebyMonsterPlugin.getPerformanceService()) != null) {
                    c84683Ua = performanceService.LIZJ();
                } else {
                    c84683Ua = null;
                }
                this.LIZIZ = c84683Ua;
            }

            @Override // X.C4VS
            public final boolean LIZJ(String str) {
                if (str == null || this.LIZ.LIZIZ(str).length() <= 0) {
                    return false;
                }
                return true;
            }

            @Override // X.C4VS
            public final Drawable LIZ(Context context, String text) {
                Bitmap decodeBitmap;
                BitmapDrawable bitmapDrawable = null;
                if (context != null) {
                    boolean z = true;
                    if (text != null && text.length() != 0) {
                        C3VM c3vm = this.LIZIZ;
                        if (c3vm != null) {
                            c3vm.LIZIZ(new C3UX(text) { // from class: X.3UU
                                public final String LJ;

                                public final int hashCode() {
                                    return Objects.hash(this.LJ);
                                }

                                @Override // X.C3UX
                                public final String toString() {
                                    return C78966Uyw.LJJJLL("GeckoSmallEmojiLoadEventKey:%s", this.LJ);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super("aweme_im_gecko_small_emoji_load", text, 0.0f, C3US.SLARDAR, 4);
                                    o.LJIIIZ(text, "text");
                                    this.LJ = text;
                                }

                                public final boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (!(obj instanceof C3UU)) {
                                        return false;
                                    }
                                    return C78966Uyw.LJIIIZ(new Object[]{((C3UU) obj).LJ}, new Object[]{this.LJ});
                                }
                            }, false);
                        }
                        C4K5 c4k52 = this.LIZ;
                        c4k52.getClass();
                        o.LJIIIZ(text, "text");
                        if (((LruCache) c4k52.LIZJ.getValue()).get(text) == null) {
                            File file = new File(c4k52.LIZIZ(text));
                            if (file.exists() && (decodeBitmap = BitmapUtils.decodeBitmap(file, ((Number) C4K5.LIZLLL.getValue()).intValue())) != null) {
                                ((LruCache) c4k52.LIZJ.getValue()).put(text, decodeBitmap);
                            }
                        }
                        Bitmap bitmap = (Bitmap) ((LruCache) c4k52.LIZJ.getValue()).get(text);
                        if (bitmap != null) {
                            bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                        }
                        C3VM c3vm2 = this.LIZIZ;
                        if (c3vm2 != null) {
                            C3UX c3ux = new C3UX(text) { // from class: X.3UU
                                public final String LJ;

                                public final int hashCode() {
                                    return Objects.hash(this.LJ);
                                }

                                @Override // X.C3UX
                                public final String toString() {
                                    return C78966Uyw.LJJJLL("GeckoSmallEmojiLoadEventKey:%s", this.LJ);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super("aweme_im_gecko_small_emoji_load", text, 0.0f, C3US.SLARDAR, 4);
                                    o.LJIIIZ(text, "text");
                                    this.LJ = text;
                                }

                                public final boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (!(obj instanceof C3UU)) {
                                        return false;
                                    }
                                    return C78966Uyw.LJIIIZ(new Object[]{((C3UU) obj).LJ}, new Object[]{this.LJ});
                                }
                            };
                            if (bitmapDrawable == null) {
                                z = false;
                            }
                            c3vm2.LIZ(c3ux, new C3UY(z) { // from class: X.4Jy
                                public final boolean LIZLLL;

                                public final Object[] LIZ() {
                                    return new Object[]{Boolean.valueOf(this.LIZLLL)};
                                }

                                public final boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj instanceof C107544Jy) {
                                        return C78966Uyw.LJIIIZ(((C107544Jy) obj).LIZ(), LIZ());
                                    }
                                    return false;
                                }

                                public final int hashCode() {
                                    return Objects.hash(LIZ());
                                }

                                public final String toString() {
                                    return C78966Uyw.LJJJLL("GeckoSmallEmojiLoadEventBody:%s", LIZ());
                                }

                                {
                                    super(C0DC.LIZIZ("is_success", Boolean.valueOf(z)), null, null, 6);
                                    this.LIZLLL = z;
                                }
                            });
                        }
                    }
                }
                return bitmapDrawable;
            }
        };
    }
}
