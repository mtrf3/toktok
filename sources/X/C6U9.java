package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationAutoRefresh;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6U9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6U9 implements InterfaceC161306Us {
    public C6UB LIZ;

    @Override // X.InterfaceC161306Us
    public final void destroy() {
        C6UB c6ub = this.LIZ;
        if (c6ub != null) {
            c6ub.LIZ.LIZIZ.removeAllViews();
            Iterator it = ((ArrayList) c6ub.LIZIZ).iterator();
            while (it.hasNext()) {
                C48841JEv.LIZLLL(((StickerDurationAutoRefresh) ((C6U8) it.next()).LJ.getValue()).LIZLLL, "");
            }
            return;
        }
        o.LJIJI("interactStickerLayoutManager");
        throw null;
    }

    @Override // X.InterfaceC161306Us
    public final void LIZIZ(C6UA c6ua) {
        C6UB c6ub = new C6UB(c6ua);
        this.LIZ = c6ub;
        c6ub.LIZJ.put(Integer.valueOf(EnumC157656Gr.PICTURE_HASHTAG_GLOBAL.getType()), C6T4.class);
        c6ub.LIZJ.put(Integer.valueOf(EnumC157656Gr.PICTURE_HASHTAG_SINGLE.getType()), C6T5.class);
        c6ub.LIZJ.put(Integer.valueOf(EnumC157656Gr.PICTURE_HASHTAG_EMBED.getType()), C159766Ou.class);
        c6ub.LIZJ.put(Integer.valueOf(EnumC157656Gr.ADD_YOURS.getType()), C161106Ty.class);
        c6ub.LIZJ.put(Integer.valueOf(EnumC157656Gr.TEXT.getType()), C159716Op.class);
        c6ub.LIZJ.put(20, C159716Op.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC161306Us
    public final void LIZ(List stickerStructList, List list) {
        C6U8 c6u8;
        StickerModel stickerModel;
        T t;
        List list2;
        C6UC c6uc;
        List<NormalTrackTimeStamp> list3;
        NormalTrackTimeStamp normalTrackTimeStamp;
        FrameLayout.LayoutParams layoutParams;
        NormalTrackTimeStamp normalTrackTimeStamp2;
        o.LJIIIZ(stickerStructList, "stickerStructList");
        C6UB c6ub = this.LIZ;
        if (c6ub != null) {
            int i = 0;
            for (Object obj : stickerStructList) {
                int i2 = i + 1;
                if (i >= 0) {
                    InteractStickerStruct interactStickerStruct = (InteractStickerStruct) obj;
                    Class cls = (Class) ((LinkedHashMap) c6ub.LIZJ).get(Integer.valueOf(interactStickerStruct.getType()));
                    if (cls != null && (c6u8 = (C6U8) cls.newInstance()) != null) {
                        C6UA interactStickerContainerCommonParam = c6ub.LIZ;
                        o.LJIIIZ(interactStickerContainerCommonParam, "interactStickerContainerCommonParam");
                        c6u8.LIZLLL = interactStickerContainerCommonParam;
                        ((ArrayList) c6ub.LIZIZ).add(c6u8);
                        if (list != null) {
                            stickerModel = (StickerModel) ORZ.LJLLLLLL(i, list);
                        } else {
                            stickerModel = null;
                        }
                        c6u8.LIZ = interactStickerStruct;
                        if (stickerModel == null) {
                            t = c6u8.LIZJ(interactStickerStruct);
                        } else {
                            t = stickerModel;
                        }
                        o.LJIIIZ(t, "<set-?>");
                        c6u8.LIZIZ = t;
                        new C1NS(t);
                        C6UF<?> LIZ = c6u8.LIZ();
                        o.LJIIIZ(LIZ, "<set-?>");
                        c6u8.LIZJ = LIZ;
                        View view = LIZ.getView();
                        o.LJIIIZ(view, "view");
                        C6UA LIZIZ = c6u8.LIZIZ();
                        InteractStickerStruct interactStickerStruct2 = c6u8.LIZ;
                        if (interactStickerStruct2 != null) {
                            StickerModel stickerModel2 = c6u8.LIZIZ;
                            if (stickerModel2 != null) {
                                C6UD c6ud = LIZIZ.LIZJ;
                                int i3 = c6ud.LJLILLLLZI;
                                int i4 = c6ud.LJLIL;
                                try {
                                    list2 = (List) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), interactStickerStruct2.getTrackList(), new TypeToken<List<? extends NormalTrackTimeStamp>>() { // from class: X.2T4
                                    }.getType());
                                } catch (s e) {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append("new InteractStickerUtils.kt : e ");
                                    LIZ2.append(e);
                                    C36922EeM.LJ(X1D.LIZIZ(LIZ2));
                                    list2 = null;
                                }
                                if (C79004UzY.LJJIFFI(list2)) {
                                    list2 = null;
                                }
                                if (list2 == null || list2.isEmpty() || (normalTrackTimeStamp2 = (NormalTrackTimeStamp) ListProtector.get(list2, 0)) == null) {
                                    c6uc = new C6UC(0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
                                } else {
                                    float f = i3;
                                    float y = (normalTrackTimeStamp2.getY() - 0.5f) * f;
                                    float f2 = i4;
                                    float x = (normalTrackTimeStamp2.getX() - 0.5f) * f2;
                                    Float scale = normalTrackTimeStamp2.getScale();
                                    float rotation = normalTrackTimeStamp2.getRotation();
                                    float height = normalTrackTimeStamp2.getHeight() * f;
                                    float width = normalTrackTimeStamp2.getWidth() * f2;
                                    o.LJIIIIZZ(scale, "scale");
                                    c6uc = new C6UC(x, y, rotation, scale.floatValue(), width, height);
                                }
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                                if (view instanceof AbstractC160976Tl) {
                                    layoutParams2 = new FrameLayout.LayoutParams((int) c6uc.LJLJJL, (int) c6uc.LJLJJLL);
                                }
                                if (view instanceof C6UF) {
                                    C6UF c6uf = (C6UF) view;
                                    c6uf.LIZIZ(interactStickerStruct2, stickerModel2);
                                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                                    if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams3) != null) {
                                        layoutParams2 = layoutParams;
                                    }
                                    if (LIZIZ.LIZ == EnumC161246Um.INTERACT) {
                                        c6uf.LIZJ();
                                    }
                                }
                                layoutParams2.gravity = 17;
                                view.setLayoutParams(layoutParams2);
                                view.setTranslationX(c6uc.LJLIL);
                                view.setTranslationY(c6uc.LJLILLLLZI);
                                view.setScaleY(c6uc.LJLJJI * LIZIZ.LIZJ.LJLJJL);
                                view.setScaleX(c6uc.LJLJJI * LIZIZ.LIZJ.LJLJJL);
                                view.setRotation(c6uc.LJLJI);
                                view.setLayoutParams(layoutParams2);
                                LIZIZ.LIZIZ.addView(view);
                                try {
                                    if (interactStickerStruct.getTrackTimeStampCache() == null) {
                                        list3 = (List) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), interactStickerStruct.getTrackList(), new TypeToken<List<? extends NormalTrackTimeStamp>>() { // from class: X.2T6
                                        }.getType());
                                        try {
                                            interactStickerStruct.setTrackTimeStampCache(list3);
                                        } catch (s e2) {
                                            e = e2;
                                            StringBuilder LIZ3 = X1D.LIZ();
                                            LIZ3.append("InteractStickerUtils.kt : e ");
                                            LIZ3.append(e);
                                            C36922EeM.LJ(X1D.LIZIZ(LIZ3));
                                            if (list3 != null) {
                                            }
                                            ((StickerDurationAutoRefresh) c6u8.LJ.getValue()).LIZ(new AqS133S0200000_2(c6u8, (C6U8<StickerModel>) interactStickerStruct, (InteractStickerStruct) 109));
                                            i = i2;
                                        }
                                    } else {
                                        list3 = interactStickerStruct.getTrackTimeStampCache();
                                    }
                                } catch (s e3) {
                                    e = e3;
                                    list3 = null;
                                }
                                if (list3 != null || list3.isEmpty() || (normalTrackTimeStamp = (NormalTrackTimeStamp) ORZ.LJLLJ(list3)) == null || (true ^ normalTrackTimeStamp.isWholeDuration())) {
                                    ((StickerDurationAutoRefresh) c6u8.LJ.getValue()).LIZ(new AqS133S0200000_2(c6u8, (C6U8<StickerModel>) interactStickerStruct, (InteractStickerStruct) 109));
                                } else if (stickerModel != null) {
                                    BaseStickerModel baseSticker = stickerModel.getBaseSticker();
                                    ((StickerDurationAutoRefresh) c6u8.LJ.getValue()).LIZIZ(baseSticker, new AqS133S0200000_2(c6u8, (C6U8<StickerModel>) baseSticker, (BaseStickerModel) 110));
                                }
                            } else {
                                o.LJIJI("stickerModel");
                                throw null;
                            }
                        } else {
                            o.LJIJI("interactStickerStruct");
                            throw null;
                        }
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("interactStickerLayoutManager");
        throw null;
    }
}
