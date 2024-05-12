package X;

import Y.ARunnableS38S0100000_2;
import Y.IDhS95S0100000_2;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* renamed from: X.5ix, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142755ix implements InterfaceC142725iu {
    public final ConcurrentHashMap<AbstractC142705is, Runnable> LJLIL = new ConcurrentHashMap<>();

    @Override // X.InterfaceC142725iu
    public void Eu(AbstractC142705is priority, Runnable callback) {
        o.LJIIIZ(priority, "priority");
        o.LJIIIZ(callback, "callback");
        if (!((Boolean) C142845j6.LIZ.getValue()).booleanValue()) {
            C60903NvH.LJIIJJI().getPublishService().LJFF().LIZIZ().LJ(new ARunnableS38S0100000_2(callback, 156));
        } else {
            this.LJLIL.put(priority, callback);
            C60903NvH.LJIIJJI().getPublishService().LJFF().LIZIZ().LJ(new ARunnableS38S0100000_2(this, 157));
        }
    }

    @Override // X.InterfaceC142725iu
    public void ah0(final InterfaceC153045zY interfaceC153045zY, final VideoPublishEditModel model, InterfaceC65784Pro<C76800UCe> startedCallback, final InterfaceC65784Pro<C76800UCe> completedCallback) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(startedCallback, "startedCallback");
        o.LJIIIZ(completedCallback, "completedCallback");
        final long currentTimeMillis = System.currentTimeMillis();
        final C142885jA LIZIZ = C60903NvH.LJIIJJI().getPublishService().LJFF().LIZIZ();
        LIZIZ.LIZIZ();
        startedCallback.invoke();
        final OSZ LJJJJZI = C44384HbQ.LJJJJZI(model, false);
        if (LJJJJZI != null) {
            C10K.LIZJ(new Callable() { // from class: X.5j2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean z;
                    InterfaceC153045zY interfaceC153045zY2 = InterfaceC153045zY.this;
                    String first = LJJJJZI.getFirst();
                    int intValue = LJJJJZI.getSecond().intValue();
                    final InterfaceC142865j8 interfaceC142865j8 = LIZIZ;
                    final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = completedCallback;
                    InterfaceC162186Yc interfaceC162186Yc = new InterfaceC162186Yc() { // from class: X.5j3
                        @Override // X.InterfaceC162186Yc
                        public final void onError(String str) {
                            InterfaceC142865j8.this.LIZJ();
                            interfaceC65784Pro.invoke();
                            C60903NvH.LJIIJJI().LJJIIZI().LJ(str);
                        }
                    };
                    InterfaceC171226nm interfaceC171226nm = new InterfaceC171226nm() { // from class: X.5j4
                        @Override // X.InterfaceC171226nm
                        public final void LIZ() {
                            InterfaceC142865j8.this.LIZJ();
                            interfaceC65784Pro.invoke();
                        }
                    };
                    if (C78886Uxe.LJJJJL() && !model.isMvThemeVideoType() && model.canvasVideoData == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return new C6YX(interfaceC153045zY2, first, intValue, null, interfaceC162186Yc, interfaceC171226nm, z, false, currentTimeMillis);
                }
            });
        } else {
            LIZIZ.LIZJ();
            completedCallback.invoke();
        }
    }

    @Override // X.InterfaceC142725iu
    public void Vr(final InterfaceC153045zY interfaceC153045zY, final C142765iy extractCoverConfig, InterfaceC65784Pro<C76800UCe> startedCallback, final InterfaceC88472Yns<? super String, C76800UCe> completedCallback, final InterfaceC88472Yns<? super Bitmap, Bitmap> interfaceC88472Yns) {
        Executor executor;
        o.LJIIIZ(extractCoverConfig, "extractCoverConfig");
        o.LJIIIZ(startedCallback, "startedCallback");
        o.LJIIIZ(completedCallback, "completedCallback");
        final String str = extractCoverConfig.LJLIL;
        final int i = extractCoverConfig.LJLILLLLZI;
        if (interfaceC153045zY == null || str.length() == 0) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        startedCallback.invoke();
        Callable callable = new Callable() { // from class: X.5iz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                IDhS95S0100000_2 iDhS95S0100000_2;
                InterfaceC153045zY interfaceC153045zY2 = InterfaceC153045zY.this;
                String str2 = str;
                int i2 = i;
                InterfaceC88472Yns<Bitmap, Bitmap> interfaceC88472Yns2 = interfaceC88472Yns;
                if (interfaceC88472Yns2 != null) {
                    iDhS95S0100000_2 = new IDhS95S0100000_2(interfaceC88472Yns2, 9);
                } else {
                    iDhS95S0100000_2 = null;
                }
                final String str3 = str;
                final InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns3 = completedCallback;
                return new C6YX(interfaceC153045zY2, str2, i2, iDhS95S0100000_2, new InterfaceC162186Yc() { // from class: X.5j0
                    @Override // X.InterfaceC162186Yc
                    public final void onError(String str4) {
                        C39579Fg7.LJIL(str3);
                        interfaceC88472Yns3.invoke(null);
                        C60903NvH.LJIIJJI().LJJIIZI().LJ(str4);
                    }
                }, new InterfaceC171226nm() { // from class: X.5j1
                    @Override // X.InterfaceC171226nm
                    public final void LIZ() {
                        interfaceC88472Yns3.invoke(str3);
                    }
                }, extractCoverConfig.LJLJI, false, currentTimeMillis);
            }
        };
        if (extractCoverConfig.LJLJJI) {
            executor = C10K.LJI;
        } else {
            executor = C10K.LJIIIIZZ;
        }
        C10K.LIZIZ(callable, executor, null);
    }
}
