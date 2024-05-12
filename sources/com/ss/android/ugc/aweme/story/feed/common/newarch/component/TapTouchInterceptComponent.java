package com.ss.android.ugc.aweme.story.feed.common.newarch.component;

import X.ActivityC45651qj;
import X.C15070iV;
import X.C162476Zf;
import X.C211998Tr;
import X.C212428Vi;
import X.C221108m2;
import X.C221138m5;
import X.C221858nF;
import X.C222588oQ;
import X.C222928oy;
import X.C223038p9;
import X.C223048pA;
import X.C223998qh;
import X.C224238r5;
import X.C2304092m;
import X.C245649kW;
import X.C2MA;
import X.C51029K0z;
import X.C52867Kox;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C55723Ltv;
import X.C56509MFt;
import X.C60996Nwm;
import X.C62822Ol8;
import X.C78685UuP;
import X.C79045V0n;
import X.C90193gN;
import X.FMX;
import X.InterfaceC55235Lm3;
import X.InterfaceC57312Mt;
import X.KL2;
import X.KR8;
import X.KRA;
import X.LPX;
import X.M89;
import X.ORZ;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.casting.api.ICastingAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.PanelSingleTapInterceptAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.story.ability.StoryFeedUserViewPagerAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.IAdapterAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TapTouchInterceptComponent extends BaseCellContentComponent<TapTouchInterceptComponent> implements PanelSingleTapInterceptAbility {
    public final C221138m5 LL;
    public final C221138m5 LLD;
    public final C221138m5 LLF;
    public final C221138m5 LLFF;
    public final C221138m5 LLFFF;
    public final C62822Ol8 LLFII;
    public final C221138m5 LLFZ;
    public boolean LLI;

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }

    public TapTouchInterceptComponent() {
        new LinkedHashMap();
        this.LL = KR8.LJIIJJI(new AqS153S0100000_3(this, 930));
        this.LLD = KR8.LJIIJJI(new AqS153S0100000_3(this, 928));
        this.LLF = KR8.LJIIJJI(new AqS153S0100000_3(this, 926));
        this.LLFF = KR8.LJIIJJI(new AqS153S0100000_3(this, 925));
        this.LLFFF = KR8.LJIIJJI(new AqS153S0100000_3(this, 927));
        this.LLFII = C221108m2.LIZIZ(C221858nF.LJLIL);
        this.LLFZ = KR8.LJIIJJI(new AqS153S0100000_3(this, 929));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) this.LLF.getValue();
        if (interfaceC55235Lm3 != null) {
            C55096Ljo.LJIILL(interfaceC55235Lm3, PanelSingleTapInterceptAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) this.LLF.getValue();
        if (interfaceC55235Lm3 != null) {
            C55096Ljo.LJIIJJI(interfaceC55235Lm3, this, PanelSingleTapInterceptAbility.class, null);
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.PanelSingleTapInterceptAbility
    public final boolean ge(long j, int i, Object obj) {
        Object obj2;
        Float f;
        Object obj3;
        Float f2;
        C222928oy LJJLIIIJJIZ;
        Integer valueOf;
        C15070iV c15070iV;
        C15070iV c15070iV2;
        boolean z = obj instanceof C15070iV;
        String str = null;
        if (z && (c15070iV2 = (C15070iV) obj) != null) {
            obj2 = c15070iV2.LIZ;
        } else {
            obj2 = null;
        }
        if (obj2 instanceof Float) {
            f = (Float) obj2;
        } else {
            f = null;
        }
        if (z && (c15070iV = (C15070iV) obj) != null) {
            obj3 = c15070iV.LIZIZ;
        } else {
            obj3 = null;
        }
        if (obj3 instanceof Float) {
            f2 = (Float) obj3;
        } else {
            f2 = null;
        }
        if (obj == null || f == null || f2 == null) {
            b4(f, f2, i, j);
            return false;
        }
        if (!C2304092m.LIZ()) {
            b4(f, f2, i, j);
            return false;
        }
        boolean LJIJ = C55723Ltv.LIZIZ.LJIJ().LJIJ(C212428Vi.LIZLLL(this));
        KRA LIZIZ = a1().LIZIZ();
        if ((LIZIZ != null && C56509MFt.LJIIIZ(LIZIZ)) || !LJIJ) {
            if (((Number) C52867Kox.LIZ.getValue()).intValue() == 0) {
                b4(f, f2, i, j);
                return false;
            }
            IAdapterAbility iAdapterAbility = (IAdapterAbility) this.LL.getValue();
            if (iAdapterAbility == null || (LJJLIIIJJIZ = iAdapterAbility.LJJLIIIJJIZ()) == null || (valueOf = Integer.valueOf(LJJLIIIJJIZ.getCount())) == null || valueOf.intValue() != 1) {
                return c4(f.floatValue(), f2.floatValue(), i, j, "out_feed");
            }
            b4(f, f2, i, j);
            return false;
        }
        if (C211998Tr.LIZ()) {
            C222588oQ c222588oQ = a1().LIZLLL;
            if (c222588oQ != null) {
                str = c222588oQ.LJIIIZ;
            }
            if (!o.LJ(str, "story_archive")) {
                return c4(f.floatValue(), f2.floatValue(), i, j, "inner_feed_h");
            }
        }
        return c4(f.floatValue(), f2.floatValue(), i, j, "inner_feed_v");
    }

    public final void b4(Float f, Float f2, int i, long j) {
        StoryCollectionCellAbility storyCollectionCellAbility;
        C2MA jX;
        if (C54838Lfe.LJIILLIIL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
            C55723Ltv.LIZIZ.LJII().LIZ(j);
        }
        if (f != null && f2 != null && (storyCollectionCellAbility = (StoryCollectionCellAbility) this.LLD.getValue()) != null && (jX = storyCollectionCellAbility.jX()) != null) {
            jX.x7(f.floatValue(), f2.floatValue(), i);
        }
        StoryFakePlayerAbility storyFakePlayerAbility = (StoryFakePlayerAbility) this.LLFFF.getValue();
        if (storyFakePlayerAbility != null) {
            storyFakePlayerAbility.Q20();
        }
    }

    public final boolean c4(float f, float f2, int i, long j, String str) {
        boolean z;
        Aweme aweme;
        List<InteractStickerStruct> interactStickerStructs;
        ViewGroup viewGroup;
        OcrLocation ocrLocation;
        NormalTrackTimeStamp normalTrackTimeStamp;
        RectF rectF;
        Boolean bool;
        ActivityC45651qj LIZ;
        C2MA jX;
        InterfaceC57312Mt LJIIIIZZ;
        String aid;
        String str2;
        String str3;
        M89 m89;
        C2MA jX2;
        Boolean bool2;
        if (this.LLI) {
            this.LLI = false;
            b4(Float.valueOf(f), Float.valueOf(f2), i, j);
            return false;
        }
        Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme2 != null && !aweme2.isSharedStoryVisible()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null) {
            ArrayList arrayList = new ArrayList();
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getType() == 19) {
                    arrayList.add(interactStickerStruct);
                }
            }
            InteractStickerStruct interactStickerStruct2 = (InteractStickerStruct) ORZ.LJLLLL(arrayList);
            if (interactStickerStruct2 != null) {
                View containerView = getContainerView();
                if ((containerView instanceof ViewGroup) && (viewGroup = (ViewGroup) containerView) != null) {
                    Context context = viewGroup.getContext();
                    o.LJIIIIZZ(context, "it.context");
                    Aweme aweme3 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
                    C224238r5 c224238r5 = (C224238r5) this.LLFII.getValue();
                    Aweme aweme4 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
                    if (aweme4 != null) {
                        ocrLocation = aweme4.getOcrLocation();
                    } else {
                        ocrLocation = null;
                    }
                    C223048pA LIZ2 = new C223038p9(context, aweme3, c224238r5, ocrLocation, viewGroup, (CellAdaptionComponentAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), CellAdaptionComponentAbility.class, null)).LIZ();
                    C245649kW c245649kW = new C245649kW();
                    c245649kW.LIZ = LIZ2.LIZ;
                    c245649kW.LIZIZ = LIZ2.LIZIZ;
                    List<NormalTrackTimeStamp> LIZIZ = C223998qh.LIZIZ(interactStickerStruct2);
                    o.LJIIIIZZ(viewGroup.getContext(), "it.context");
                    if (LIZIZ != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (NormalTrackTimeStamp normalTrackTimeStamp2 : LIZIZ) {
                            if (normalTrackTimeStamp2 != null) {
                                float f3 = c245649kW.LIZ;
                                float f4 = c245649kW.LIZIZ;
                                if (f3 == f4) {
                                    rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    float width = normalTrackTimeStamp2.getWidth() * f3;
                                    float height = normalTrackTimeStamp2.getHeight() * f4;
                                    float f5 = 2;
                                    float x = (normalTrackTimeStamp2.getX() * C60996Nwm.LJIIIIZZ(r13)) - (width / f5);
                                    float y = (normalTrackTimeStamp2.getY() * C60996Nwm.LJ(r13)) - (height / f5);
                                    rectF = new RectF(x, y, width + x, height + y);
                                }
                                arrayList2.add(rectF);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            int i3 = i2 + 1;
                            RectF rectF2 = (RectF) it.next();
                            if (ListProtector.get(LIZIZ, i2) == null || (normalTrackTimeStamp = (NormalTrackTimeStamp) ListProtector.get(LIZIZ, i2)) == null || !C79045V0n.LJIIL(f, f2, rectF2, normalTrackTimeStamp.getRotation())) {
                                i2 = i3;
                            } else {
                                this.LLI = true;
                                b4(Float.valueOf(f), Float.valueOf(f2), i, j);
                                return false;
                            }
                        }
                    }
                }
            }
        }
        if ((f < KL2.LJIIJJI(getContext()) / 2 && !C90193gN.LIZ()) || (f > KL2.LJIIJJI(getContext()) / 2 && C90193gN.LIZ())) {
            FeedCollectionViewPagerAbility feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) this.LL.getValue();
            if (feedCollectionViewPagerAbility == null || !feedCollectionViewPagerAbility.g50()) {
                StoryFeedUserViewPagerAbility storyFeedUserViewPagerAbility = (StoryFeedUserViewPagerAbility) this.LLFZ.getValue();
                if (storyFeedUserViewPagerAbility != null) {
                    bool2 = Boolean.valueOf(storyFeedUserViewPagerAbility.KA());
                } else {
                    bool2 = null;
                }
                if (!o.LJ(bool2, Boolean.TRUE) && !o.LJ(bool2, Boolean.FALSE) && bool2 != null) {
                    throw new C162476Zf();
                }
            }
        } else {
            FeedCollectionViewPagerAbility feedCollectionViewPagerAbility2 = (FeedCollectionViewPagerAbility) this.LL.getValue();
            if (feedCollectionViewPagerAbility2 == null || !feedCollectionViewPagerAbility2.Tw()) {
                StoryFeedUserViewPagerAbility storyFeedUserViewPagerAbility2 = (StoryFeedUserViewPagerAbility) this.LLFZ.getValue();
                if (storyFeedUserViewPagerAbility2 != null) {
                    bool = Boolean.valueOf(storyFeedUserViewPagerAbility2.scrollToNext());
                } else {
                    bool = null;
                }
                if (!o.LJ(bool, Boolean.TRUE) && !o.LJ(bool, Boolean.FALSE)) {
                    if (bool == null) {
                        if (o.LJ(str, "inner_feed_h") && (LIZ = C212428Vi.LIZ(this)) != null) {
                            LIZ.finish();
                        }
                    } else {
                        throw new C162476Zf();
                    }
                }
            }
        }
        Aweme aweme5 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme5 != null && (aid = aweme5.getAid()) != null && C78685UuP.LJJJZ(aid)) {
            getContext();
            Aweme aweme6 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
            if (aweme6 != null) {
                str2 = aweme6.getAid();
            } else {
                str2 = null;
            }
            FMX.LJII("click", 0L, "video", str2);
            StoryCollectionCellAbility storyCollectionCellAbility = (StoryCollectionCellAbility) this.LLD.getValue();
            if (storyCollectionCellAbility != null && (jX2 = storyCollectionCellAbility.jX()) != null) {
                jX2.j7();
            }
            ICastingAbility iCastingAbility = (ICastingAbility) this.LLFF.getValue();
            if (iCastingAbility != null) {
                Aweme aweme7 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
                o.LJIIIIZZ(aweme7, "item.aweme");
                iCastingAbility.Ff0(aweme7);
            }
            KRA LIZIZ2 = a1().LIZIZ();
            if (LIZIZ2 != null && C56509MFt.LJIIIZ(LIZIZ2)) {
                Float valueOf = Float.valueOf(f);
                Float valueOf2 = Float.valueOf(f2);
                Aweme aweme8 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
                KRA LIZIZ3 = a1().LIZIZ();
                if (LIZIZ3 != null && (m89 = LIZIZ3.LIZJ) != null) {
                    str3 = m89.getEventType();
                } else {
                    str3 = null;
                }
                LPX.LIZJ(valueOf, valueOf2, aweme8, str3);
            }
        }
        StoryCollectionCellAbility storyCollectionCellAbility2 = (StoryCollectionCellAbility) this.LLD.getValue();
        if (storyCollectionCellAbility2 != null && (jX = storyCollectionCellAbility2.jX()) != null && (LJIIIIZZ = jX.LJIIIIZZ()) != null) {
            LJIIIIZZ.J3();
        }
        return true;
    }
}
