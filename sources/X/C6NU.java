package X;

import Y.AgS5S1200100_2;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.6NU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NU {
    public final String LIZ;
    public final Activity LIZIZ;
    public final C6NZ LIZJ;
    public final InterfaceC65784Pro<C6NS> LIZLLL;
    public final List<C6NX<?>> LJ;

    public final void LIZ(List<? extends StickerModel> list) {
        Object obj;
        C10K LJIILL;
        ArrayList LJ = AnonymousClass391.LJ(list, "stickers");
        long currentTimeMillis = System.currentTimeMillis();
        for (final StickerModel sticker : list) {
            Iterator it = ((ArrayList) this.LJ).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C6NX) obj).LIZLLL() == sticker.getStickerType()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            final C6NS c6ns = (C6NX) obj;
            if (c6ns == null) {
                int i = C157676Gt.LIZ[sticker.getStickerType().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            final Activity activity = this.LIZIZ;
                            final String str = this.LIZ;
                            final C6NZ c6nz = this.LIZJ;
                            c6ns = new C6NX<AICaptionTagStickerModel>(activity, str, c6nz) { // from class: X.6NY
                                public final Activity LIZJ;
                                public final String LIZLLL;

                                @Override // X.C6NX
                                public final EnumC157656Gr LIZLLL() {
                                    return EnumC157656Gr.AI_CAPTION_TAG;
                                }

                                @Override // X.C6NX
                                public final String LIZ(AICaptionTagStickerModel aICaptionTagStickerModel) {
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append(this.LIZLLL);
                                    LIZ.append("/ai_caption_sticker/");
                                    LIZ.append(aICaptionTagStickerModel.getId());
                                    LIZ.append(".png");
                                    return X1D.LIZIZ(LIZ);
                                }

                                @Override // X.C6NX
                                public final View LIZIZ(AICaptionTagStickerModel aICaptionTagStickerModel) {
                                    AICaptionTagStickerModel aICaptionTagStickerModel2 = aICaptionTagStickerModel;
                                    C159356Nf c159356Nf = new C159356Nf(this.LIZJ);
                                    c159356Nf.LIZ(aICaptionTagStickerModel2.isEdited());
                                    if (this.LIZIZ.LIZLLL == 0) {
                                        c159356Nf.setScaleX(aICaptionTagStickerModel2.getBaseStickerModel().getScale());
                                        c159356Nf.setScaleY(c159356Nf.getScaleX());
                                        c159356Nf.setRotation(aICaptionTagStickerModel2.getBaseStickerModel().getRotation());
                                        c159356Nf.setTranslationX(aICaptionTagStickerModel2.getBaseStickerModel().getTranslateX());
                                        c159356Nf.setTranslationY(aICaptionTagStickerModel2.getBaseStickerModel().getTranslateY());
                                    }
                                    return c159356Nf;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(activity, c6nz);
                                    o.LJIIIZ(activity, "context");
                                    o.LJIIIZ(str, "stickerCompileDir");
                                    o.LJIIIZ(c6nz, "params");
                                    this.LIZJ = activity;
                                    this.LIZLLL = str;
                                }

                                @Override // X.C6NX
                                public final AICaptionTagStickerModel LJ(AICaptionTagStickerModel aICaptionTagStickerModel, int i2, int i3) {
                                    AICaptionTagStickerModel aICaptionTagStickerModel2 = aICaptionTagStickerModel;
                                    return AICaptionTagStickerModel.copy$default(aICaptionTagStickerModel2, BaseStickerModel.copy$default(aICaptionTagStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, i2, i3, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -385, null), false, false, 6, null);
                                }
                            };
                        }
                    } else {
                        InterfaceC65784Pro<C6NS> interfaceC65784Pro = this.LIZLLL;
                        if (interfaceC65784Pro != null && (c6ns = interfaceC65784Pro.invoke()) != null) {
                        }
                    }
                } else {
                    final Activity activity2 = this.LIZIZ;
                    final C6NZ c6nz2 = this.LIZJ;
                    c6ns = new C6NX<EmbedHashTagStickerModel>(activity2, c6nz2) { // from class: X.6Na
                        public final Activity LIZJ;

                        @Override // X.C6NX
                        public final EnumC157656Gr LIZLLL() {
                            return EnumC157656Gr.PICTURE_HASHTAG_EMBED;
                        }

                        @Override // X.C6NX
                        public final String LIZ(EmbedHashTagStickerModel embedHashTagStickerModel) {
                            return embedHashTagStickerModel.getBaseStickerModel().getCompilePath();
                        }

                        @Override // X.C6NX
                        public final View LIZIZ(EmbedHashTagStickerModel embedHashTagStickerModel) {
                            if (this.LIZJ instanceof ActivityC45651qj) {
                                C160946Ti c160946Ti = new C160946Ti(this.LIZJ, null, 14);
                                c160946Ti.LIZ(new C1NS<>(embedHashTagStickerModel), (LifecycleOwner) this.LIZJ);
                                return c160946Ti;
                            }
                            return new View(this.LIZJ);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(activity2, c6nz2);
                            o.LJIIIZ(activity2, "context");
                            o.LJIIIZ(c6nz2, "stickerCompileParams");
                            this.LIZJ = activity2;
                        }

                        @Override // X.C6NX
                        public final EmbedHashTagStickerModel LJ(EmbedHashTagStickerModel embedHashTagStickerModel, int i2, int i3) {
                            EmbedHashTagStickerModel embedHashTagStickerModel2 = embedHashTagStickerModel;
                            return EmbedHashTagStickerModel.copy$default(embedHashTagStickerModel2, BaseStickerModel.copy$default(embedHashTagStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, i2, i3, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -385, null), 0L, null, false, false, false, 62, null);
                        }
                    };
                }
                List<C6NX<?>> list2 = this.LJ;
                ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
                Iterator it2 = ((ArrayList) list2).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C6NX) it2.next()).LIZLLL());
                }
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (it3.next() == c6ns.LIZLLL()) {
                            break;
                        }
                    }
                }
                ((ArrayList) this.LJ).add(c6ns);
                if (c6ns != null) {
                }
            }
            o.LJIIIZ(sticker, "sticker");
            int i2 = c6ns.LIZIZ.LIZLLL;
            if (i2 != 0) {
                if (i2 != 1) {
                    LJIILL = C10K.LIZ(new Callable() { // from class: X.6Ne
                        @Override // java.util.concurrent.Callable
                        public final /* bridge */ /* synthetic */ Object call() {
                            return C76800UCe.LIZ;
                        }
                    });
                    o.LJIIIIZZ(LJIILL, "call {}");
                } else {
                    final long currentTimeMillis2 = System.currentTimeMillis();
                    LJIILL = C10K.LIZIZ(new Callable() { // from class: X.6NW
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C6NX<StickerModel> c6nx = c6ns;
                            StickerModel any = sticker;
                            c6nx.getClass();
                            o.LJIIIZ(any, "any");
                            BaseStickerModel baseSticker = any.getBaseSticker();
                            View LIZIZ = c6ns.LIZIZ(any);
                            int width = baseSticker.getWidth();
                            int height = baseSticker.getHeight();
                            if (width == 0 || height == 0) {
                                int containerWidth = sticker.getBaseSticker().getContainerWidth();
                                int containerHeight = sticker.getBaseSticker().getContainerHeight();
                                FrameLayout frameLayout = new FrameLayout(c6ns.LIZ);
                                frameLayout.layout(0, 0, containerWidth, containerHeight);
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(containerWidth, LiveLayoutPreloadThreadPriority.DEFAULT);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(containerHeight, LiveLayoutPreloadThreadPriority.DEFAULT);
                                frameLayout.addView(LIZIZ);
                                LIZIZ.measure(makeMeasureSpec, makeMeasureSpec2);
                                width = LIZIZ.getMeasuredWidth();
                                height = LIZIZ.getMeasuredHeight();
                                C6NX<StickerModel> c6nx2 = c6ns;
                                InterfaceC88472Yns<StickerModel, C76800UCe> interfaceC88472Yns = c6nx2.LIZIZ.LJFF;
                                if (interfaceC88472Yns != null) {
                                    interfaceC88472Yns.invoke(c6nx2.LJ(any, width, height));
                                }
                                C16880lQ.LJLLLL(LIZIZ, frameLayout);
                            }
                            LIZIZ.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
                            LIZIZ.layout(0, 0, width, height);
                            Bitmap LJIIJ = C79081V1x.LJIIJ(baseSticker.getScale(), (int) (baseSticker.getScale() * width), (int) (baseSticker.getScale() * height), LIZIZ);
                            if (LJIIJ == null) {
                                C159316Nb.LIZ(System.currentTimeMillis() - currentTimeMillis2, sticker.getStickerType().name(), "null bitmap", false);
                                return null;
                            }
                            return LJIIJ;
                        }
                    }, C10K.LJI, null).LJIILL(new AgS5S1200100_2(currentTimeMillis2, sticker, c6ns, c6ns.LIZJ(sticker, currentTimeMillis2), 0));
                    o.LJIIIIZZ(LJIILL, "T : StickerModel>(\n    p…        )\n        }\n    }");
                }
            } else {
                final long currentTimeMillis3 = System.currentTimeMillis();
                String LIZJ = c6ns.LIZJ(sticker, currentTimeMillis3);
                final int containerWidth = sticker.getBaseSticker().getContainerWidth();
                final int containerHeight = sticker.getBaseSticker().getContainerHeight();
                final C6NX c6nx = c6ns;
                LJIILL = C10K.LIZIZ(new Callable() { // from class: X.6NV
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C6NX<StickerModel> c6nx2 = c6nx;
                        StickerModel any = sticker;
                        c6nx2.getClass();
                        o.LJIIIZ(any, "any");
                        BaseStickerModel baseSticker = any.getBaseSticker();
                        FrameLayout frameLayout = new FrameLayout(c6nx.LIZ);
                        frameLayout.layout(0, 0, containerWidth, containerHeight);
                        View LIZIZ = c6nx.LIZIZ(any);
                        if (baseSticker.getWidth() == 0 || baseSticker.getHeight() == 0) {
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(baseSticker.getContainerWidth(), LiveLayoutPreloadThreadPriority.DEFAULT);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(baseSticker.getContainerHeight(), LiveLayoutPreloadThreadPriority.DEFAULT);
                            frameLayout.addView(LIZIZ);
                            LIZIZ.measure(makeMeasureSpec, makeMeasureSpec2);
                            int measuredWidth = LIZIZ.getMeasuredWidth();
                            int measuredHeight = LIZIZ.getMeasuredHeight();
                            C6NX<StickerModel> c6nx3 = c6nx;
                            InterfaceC88472Yns<StickerModel, C76800UCe> interfaceC88472Yns = c6nx3.LIZIZ.LJFF;
                            if (interfaceC88472Yns != null) {
                                interfaceC88472Yns.invoke(c6nx3.LJ(any, measuredWidth, measuredHeight));
                            }
                            C16880lQ.LJLLLL(LIZIZ, frameLayout);
                            float centerX = (baseSticker.getCenterX() - (measuredWidth / 2)) + baseSticker.getContainerLeft();
                            float centerY = baseSticker.getCenterY() - (measuredHeight / 2);
                            LIZIZ.layout((int) centerX, (int) centerY, (int) (centerX + measuredWidth), (int) (centerY + measuredHeight));
                            frameLayout.addView(LIZIZ);
                        } else {
                            LIZIZ.measure(View.MeasureSpec.makeMeasureSpec(baseSticker.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(baseSticker.getHeight(), 1073741824));
                            float centerX2 = (baseSticker.getCenterX() - (baseSticker.getWidth() / 2)) + baseSticker.getContainerLeft();
                            float centerY2 = baseSticker.getCenterY() - (baseSticker.getHeight() / 2);
                            LIZIZ.layout((int) centerX2, (int) centerY2, (int) (centerX2 + baseSticker.getWidth()), (int) (centerY2 + baseSticker.getHeight()));
                            frameLayout.addView(LIZIZ);
                        }
                        Bitmap LJIIJ = C79081V1x.LJIIJ(1.0f, containerWidth, containerHeight, frameLayout);
                        if (LJIIJ == null) {
                            C159316Nb.LIZ(System.currentTimeMillis() - currentTimeMillis3, sticker.getStickerType().name(), "null bitmap", false);
                            return null;
                        }
                        return LJIIJ;
                    }
                }, C10K.LJI, null).LJIILL(new AgS5S1200100_2(currentTimeMillis3, sticker, c6ns, LIZJ, 1));
                o.LJIIIIZZ(LJIILL, "T : StickerModel>(\n    p…        )\n        }\n    }");
            }
            LJ.add(LJIILL);
        }
        try {
            C10K.LJIJJ(LJ).LJIJI();
        } catch (Exception e) {
            C159316Nb.LIZ(System.currentTimeMillis() - currentTimeMillis, "", e.getMessage(), false);
        }
    }

    public C6NU(String stickerDir, Activity activity, C6NZ stickerCompileParams, InterfaceC65784Pro<C6NS> interfaceC65784Pro) {
        o.LJIIIZ(stickerDir, "stickerDir");
        o.LJIIIZ(stickerCompileParams, "stickerCompileParams");
        this.LIZ = stickerDir;
        this.LIZIZ = activity;
        this.LIZJ = stickerCompileParams;
        this.LIZLLL = interfaceC65784Pro;
        this.LJ = new ArrayList();
    }
}
