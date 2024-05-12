package X;

import Y.AfS65S0100000_13;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.api.GameLinkApi;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TlC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75566TlC implements InterfaceC32190CkE {
    public C75567TlD LIZ;

    @Override // X.InterfaceC32190CkE
    public final void LIZ() {
        C0NB.LJIIIZ("GameLinMicFeedViewManager", "dropUpLayoutContainer()");
        C75567TlD c75567TlD = this.LIZ;
        if (c75567TlD != null) {
            C29306Beo.LJJJ(new AqS163S0100000_13(c75567TlD, 474));
        }
    }

    @Override // X.InterfaceC32190CkE
    public final boolean LIZLLL(C28272B7s sei) {
        Integer num;
        SeiDsl seiDsl;
        long j;
        int i;
        int i2;
        boolean z;
        FrameLayout frameLayout;
        int i3;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        boolean z2;
        Integer num2;
        boolean z3;
        Long l;
        Long l2;
        long j2;
        Long LJJIZ;
        o.LJIIIZ(sei, "sei");
        C0NB.LJIIIZ("GameLinMicFeedViewManager", "seiData()");
        SeiAppData LJIIJ = C75806Tp4.LJIIJ(sei);
        if (LJIIJ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("seiData parse succeed version = ");
            LIZ.append(LJIIJ.version);
            LIZ.append(" , scene = ");
            SeiDsl seiDsl2 = LJIIJ.dsl;
            if (seiDsl2 != null) {
                num = Integer.valueOf(seiDsl2.scene);
            } else {
                num = null;
            }
            LIZ.append(num);
            C0NB.LJIIIZ("GameLinMicFeedViewManager", X1D.LIZIZ(LIZ));
            if (LJIIJ.version == 20 && (seiDsl = LJIIJ.dsl) != null && seiDsl.scene == 16) {
                C75567TlD c75567TlD = this.LIZ;
                if (c75567TlD == null) {
                    return true;
                }
                String str = LJIIJ.channelId;
                if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
                    j = LJJIZ.longValue();
                } else {
                    j = 0;
                }
                c75567TlD.LIZIZ = j;
                c75567TlD.LIZJ = LJIIJ.anchorLinkMicId;
                if (!c75567TlD.LJIILIIL && (i = c75567TlD.LJIIJJI) > 0 && (i2 = c75567TlD.LJIIL) > 0) {
                    if (i2 > i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c75567TlD.LJI = z;
                    if (c75567TlD.LJIIJ != null && (frameLayout = c75567TlD.LJIIIZ) != null) {
                        int measuredWidth = frameLayout.getMeasuredWidth();
                        FrameLayout frameLayout2 = c75567TlD.LJIIIZ;
                        if (frameLayout2 != null) {
                            i3 = frameLayout2.getMeasuredHeight();
                        } else {
                            i3 = 0;
                        }
                        if (measuredWidth > 0 && i3 > 0) {
                            if (measuredWidth > i3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c75567TlD.LJII = z2;
                        }
                        c75567TlD.LJIILIIL = true;
                        if (c75567TlD.LIZ.LIZLLL == EnumC32196CkK.FEED) {
                            int LJIIL = C15380j0.LJIIL();
                            FrameLayout frameLayout3 = c75567TlD.LJIIIZ;
                            if (frameLayout3 != null && (layoutParams3 = frameLayout3.getLayoutParams()) != null) {
                                layoutParams3.height = -1;
                                layoutParams3.width = -1;
                                FrameLayout frameLayout4 = c75567TlD.LJIIIZ;
                                if (frameLayout4 != null) {
                                    frameLayout4.setLayoutParams(layoutParams3);
                                }
                            }
                            View view = c75567TlD.LJIIJ;
                            if (view != null) {
                                layoutParams = view.getLayoutParams();
                            } else {
                                layoutParams = null;
                            }
                            if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
                                layoutParams2.width = -1;
                                layoutParams2.height = (LJIIL * c75567TlD.LJIIJJI) / c75567TlD.LJIIL;
                                layoutParams2.gravity = 48;
                                View view2 = c75567TlD.LJIIJ;
                                if (view2 != null) {
                                    view2.setLayoutParams(layoutParams2);
                                }
                            }
                        }
                    }
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("user size = ");
                List<SeiRegion> list = LJIIJ.grids;
                if (list != null) {
                    num2 = Integer.valueOf(list.size());
                } else {
                    num2 = null;
                }
                LIZ2.append(num2);
                C0NB.LJIIIZ("GameLinkMicFeedHandler", X1D.LIZIZ(LIZ2));
                c75567TlD.LJIILJJIL.clear();
                c75567TlD.LJIILL.clear();
                List<SeiRegion> list2 = LJIIJ.grids;
                if (list2 != null) {
                    z3 = false;
                    for (SeiRegion seiRegion : list2) {
                        String LIZ3 = seiRegion.LIZ();
                        if (LIZ3 != null) {
                            StringBuilder LIZIZ = C25620zW.LIZIZ("linkMicId = ", LIZ3, ",anchorLinkMicId = ");
                            JBR.LJIIJ(LIZIZ, c75567TlD.LIZJ, LIZIZ, "GameLinkMicFeedHandler");
                            if (TextUtils.equals(LIZ3, c75567TlD.LIZJ)) {
                                continue;
                            } else {
                                c75567TlD.LJIILJJIL.add(LIZ3);
                                if (!c75567TlD.LJFF.containsKey(LIZ3)) {
                                    FrameLayout frameLayout5 = c75567TlD.LJIIIZ;
                                    if (frameLayout5 != null) {
                                        Context context = frameLayout5.getContext();
                                        o.LJIIIIZZ(context, "contentView.context");
                                        C75377Ti9 c75377Ti9 = new C75377Ti9(context);
                                        c75567TlD.LIZ().LIZ(frameLayout5, c75377Ti9);
                                        c75567TlD.LJFF.put(LIZ3, c75377Ti9);
                                        float width = c75567TlD.LIZ().getWidth();
                                        float height = c75567TlD.LIZ().getHeight();
                                        float LIZJ = c75567TlD.LIZ().LIZJ();
                                        View online_voice_effect = c75377Ti9.LIZ(R.id.hba);
                                        o.LJIIIIZZ(online_voice_effect, "online_voice_effect");
                                        C87277YNd.LJJIIZ(online_voice_effect);
                                        View online_player_mute = c75377Ti9.LIZ(R.id.hb2);
                                        o.LJIIIIZZ(online_player_mute, "online_player_mute");
                                        C87277YNd.LJJIIZ(online_player_mute);
                                        View layout_ticket = c75377Ti9.LIZ(R.id.fmx);
                                        o.LJIIIIZZ(layout_ticket, "layout_ticket");
                                        C87277YNd.LJJIIZ(layout_ticket);
                                        TextView textView = c75377Ti9.LJLJI;
                                        if (textView != null) {
                                            C87277YNd.LJJIIZ(textView);
                                            ImageView imageView = c75377Ti9.LJLJJI;
                                            if (imageView != null) {
                                                C87277YNd.LJJIIZ(imageView);
                                            }
                                            ViewGroup.LayoutParams layoutParams4 = c75377Ti9.getLayoutParams();
                                            if (layoutParams4 != null) {
                                                layoutParams4.height = C15380j0.LIZ(height);
                                                layoutParams4.width = C15380j0.LIZ(width);
                                                c75377Ti9.setLayoutParams(layoutParams4);
                                            }
                                            BN0.LIZ(c75377Ti9.LIZ(R.id.hb1), LIZJ);
                                            C47061t0 online_player_avatar = (C47061t0) c75377Ti9.LIZ(R.id.hb1);
                                            o.LJIIIIZZ(online_player_avatar, "online_player_avatar");
                                            C47061t0 online_voice_effect2 = (C47061t0) c75377Ti9.LIZ(R.id.hba);
                                            o.LJIIIIZZ(online_voice_effect2, "online_voice_effect");
                                            BN0.LIZIZ(online_player_avatar, online_voice_effect2);
                                        } else {
                                            o.LJIJI("onlineName");
                                            throw null;
                                        }
                                    }
                                    z3 = true;
                                }
                                C75377Ti9 c75377Ti92 = c75567TlD.LJFF.get(LIZ3);
                                if (c75377Ti92 != null) {
                                    c75567TlD.LJIILL.put(Integer.valueOf(seiRegion.position), c75377Ti92);
                                }
                            }
                        }
                    }
                } else {
                    z3 = false;
                }
                HashSet hashSet = new HashSet();
                Iterator<Map.Entry<String, C75377Ti9>> it = c75567TlD.LJFF.entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (!c75567TlD.LJIILJJIL.contains(key)) {
                        hashSet.add(key);
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    FP1.LJFF("removeMaskView linkMicId = ", str2, "GameLinkMicFeedHandler");
                    C75377Ti9 remove = c75567TlD.LJFF.remove(str2);
                    if (remove != null) {
                        C29306Beo.LJJIJIIJIL(remove);
                    }
                }
                if (!z3 && !(!hashSet.isEmpty())) {
                    return true;
                }
                Iterator<Map.Entry<Integer, C75377Ti9>> it3 = c75567TlD.LJIILL.entrySet().iterator();
                int i4 = 0;
                while (it3.hasNext()) {
                    c75567TlD.LIZ().LIZIZ(i4, it3.next().getValue());
                    i4++;
                }
                Long l3 = c75567TlD.LIZ.LIZ;
                if (l3 == null) {
                    return true;
                }
                l3.longValue();
                Long l4 = c75567TlD.LIZ.LIZIZ;
                if (l4 == null) {
                    return true;
                }
                l4.longValue();
                C0NB.LJIIIZ("GameLinkMicFeedHandler", "onLinkListhChange");
                long j3 = 0;
                if (c75567TlD.LIZIZ != 0 && (((l = c75567TlD.LIZ.LIZ) == null || l.longValue() != 0) && ((l2 = c75567TlD.LIZ.LIZIZ) == null || l2.longValue() != 0))) {
                    GameLinkApi gameLinkApi = (GameLinkApi) TTL.LIZ(GameLinkApi.class, "get().getService(GameLinkApi::class.java)");
                    Long l5 = c75567TlD.LIZ.LIZ;
                    if (l5 != null) {
                        j2 = l5.longValue();
                    } else {
                        j2 = 0;
                    }
                    Long l6 = c75567TlD.LIZ.LIZIZ;
                    if (l6 != null) {
                        j3 = l6.longValue();
                    }
                    InterfaceC92693kP LJJII = T28.LIZLLL(C74687TSx.LIZ(gameLinkApi, j2, j3, c75567TlD.LIZIZ, C47261Igj.LJJIJ(1).toString(), 1)).LJJII(new AfS65S0100000_13(c75567TlD, 195), new AfS65S0100000_13(c75567TlD, 196));
                    C73318Sq2 cb = (C73318Sq2) c75567TlD.LJIIIIZZ.getValue();
                    o.LJIIIZ(cb, "cb");
                    cb.LIZ(LJJII);
                    return true;
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("onLInkListChange return ");
                LIZ4.append(c75567TlD.LIZIZ);
                LIZ4.append(' ');
                LIZ4.append(c75567TlD.LIZ);
                C0NB.LIZLLL(X1D.LIZIZ(LIZ4));
                return true;
            }
            return false;
        }
        if (C75806Tp4.LJIIIZ(sei.LIZIZ) != null) {
            C0NB.LJIIIZ("GameLinMicFeedViewManager", "seiData parseCommonSei succeed");
        }
        return false;
    }

    public final void LJ(C75568TlE c75568TlE) {
        C0NB.LJIIIZ("GameLinMicFeedViewManager", "init()");
        C75567TlD c75567TlD = this.LIZ;
        if (c75567TlD != null) {
            C29306Beo.LJJJ(new AqS163S0100000_13(c75567TlD, 474));
        }
        this.LIZ = new C75567TlD(c75568TlE);
    }

    @Override // X.InterfaceC32190CkE
    public final void LIZIZ(int i, int i2, View view) {
        C75567TlD c75567TlD = this.LIZ;
        if (c75567TlD != null) {
            C0NB.LJIIIZ("GameLinkMicFeedHandler", "setLiveTextureRenderView()");
            c75567TlD.LJIIJ = view;
            c75567TlD.LJIIJJI = i2;
            c75567TlD.LJIIL = i;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setLiveTextureRenderView videoW= ");
        LIZ.append(i);
        LIZ.append(",videoH =");
        LIZ.append(i2);
        C0NB.LJIIIZ("GameLinMicFeedViewManager", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC32190CkE
    public final void LIZJ(FrameLayout frameLayout, int i, int i2, int i3) {
        C75567TlD c75567TlD = this.LIZ;
        if (c75567TlD != null) {
            C0NB.LJIIIZ("GameLinkMicFeedHandler", "setUpLayoutContainer()");
            c75567TlD.LJIIIZ = frameLayout;
            c75567TlD.LJIIJJI = i2;
            c75567TlD.LJIIL = i;
        }
        StringBuilder LIZJ = C06460Ne.LIZJ("setLiveTextureRenderView videoW= ", i, ",videoH =", i2, " ,bottomViewHeight =");
        b1.LJ(LIZJ, i3, LIZJ, "GameLinMicFeedViewManager");
    }
}
