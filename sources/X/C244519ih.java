package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.GiphyGifApi;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.model.GiphyGifsResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.9ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244519ih extends AbstractC244639it {
    public final C106504Fy LIZ;
    public final C244519ih LIZIZ = this;
    public C106484Fw LIZJ;
    public C106484Fw LIZLLL;
    public C106484Fw LJ;

    @Override // X.YUA
    public final C244619ir LIZ() {
        return new C244619ir(this.LIZ, this.LIZIZ);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.4Fw] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.4Fw] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.4Fw] */
    public C244519ih(C106504Fy c106504Fy) {
        this.LIZ = c106504Fy;
        final int i = 0;
        this.LIZJ = new C4G1<T>(this, i) { // from class: X.4Fw
            public final C244519ih LIZ;
            public final int LIZIZ;

            @Override // X.C4G1
            public final T get() {
                int i2 = this.LIZIZ;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            T t = (T) C4G0.LIZ;
                            C78555UsJ.LJII(t);
                            return t;
                        }
                        throw new AssertionError(this.LIZIZ);
                    }
                    return (T) new C106394Fn();
                }
                GiphyGifApi api = this.LIZ.LIZ.LJIIIIZZ.get();
                o.LJIIIZ(api, "api");
                return (T) new InterfaceC106444Fs(new C106414Fp(api)) { // from class: X.4Fq
                    public final InterfaceC106444Fs LIZ;

                    {
                        this.LIZ = r1;
                    }

                    @Override // X.InterfaceC106444Fs
                    public final AbstractC73638SvC<GiphyGifsResponse> LIZ(int i3) {
                        return this.LIZ.LIZ(i3);
                    }
                };
            }

            {
                this.LIZ = this;
                this.LIZIZ = i;
            }
        };
        final int i2 = 1;
        this.LIZLLL = new C4G1<T>(this, i2) { // from class: X.4Fw
            public final C244519ih LIZ;
            public final int LIZIZ;

            @Override // X.C4G1
            public final T get() {
                int i22 = this.LIZIZ;
                if (i22 != 0) {
                    if (i22 != 1) {
                        if (i22 == 2) {
                            T t = (T) C4G0.LIZ;
                            C78555UsJ.LJII(t);
                            return t;
                        }
                        throw new AssertionError(this.LIZIZ);
                    }
                    return (T) new C106394Fn();
                }
                GiphyGifApi api = this.LIZ.LIZ.LJIIIIZZ.get();
                o.LJIIIZ(api, "api");
                return (T) new InterfaceC106444Fs(new C106414Fp(api)) { // from class: X.4Fq
                    public final InterfaceC106444Fs LIZ;

                    {
                        this.LIZ = r1;
                    }

                    @Override // X.InterfaceC106444Fs
                    public final AbstractC73638SvC<GiphyGifsResponse> LIZ(int i3) {
                        return this.LIZ.LIZ(i3);
                    }
                };
            }

            {
                this.LIZ = this;
                this.LIZIZ = i2;
            }
        };
        final int i3 = 2;
        this.LJ = new C4G1<T>(this, i3) { // from class: X.4Fw
            public final C244519ih LIZ;
            public final int LIZIZ;

            @Override // X.C4G1
            public final T get() {
                int i22 = this.LIZIZ;
                if (i22 != 0) {
                    if (i22 != 1) {
                        if (i22 == 2) {
                            T t = (T) C4G0.LIZ;
                            C78555UsJ.LJII(t);
                            return t;
                        }
                        throw new AssertionError(this.LIZIZ);
                    }
                    return (T) new C106394Fn();
                }
                GiphyGifApi api = this.LIZ.LIZ.LJIIIIZZ.get();
                o.LJIIIZ(api, "api");
                return (T) new InterfaceC106444Fs(new C106414Fp(api)) { // from class: X.4Fq
                    public final InterfaceC106444Fs LIZ;

                    {
                        this.LIZ = r1;
                    }

                    @Override // X.InterfaceC106444Fs
                    public final AbstractC73638SvC<GiphyGifsResponse> LIZ(int i32) {
                        return this.LIZ.LIZ(i32);
                    }
                };
            }

            {
                this.LIZ = this;
                this.LIZIZ = i3;
            }
        };
    }
}
