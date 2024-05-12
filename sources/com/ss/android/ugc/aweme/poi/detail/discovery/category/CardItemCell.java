package com.ss.android.ugc.aweme.poi.detail.discovery.category;

import X.AnonymousClass028;
import X.C025908h;
import X.C119254m9;
import X.C12460eI;
import X.C16880lQ;
import X.C188447aS;
import X.C189987cw;
import X.C1DI;
import X.C2068389v;
import X.C26338AVi;
import X.C2K0;
import X.C32151Nz;
import X.C43001GuD;
import X.C47689Ind;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56462Jm;
import X.C62846OlW;
import X.C78765Uvh;
import X.C85049XZl;
import X.C85250Xd0;
import X.C85252Xd2;
import X.C85253Xd3;
import X.C85254Xd4;
import X.EF7;
import X.EV9;
import X.EnumC189997cx;
import X.EnumC48916JHs;
import X.FFL;
import X.FMX;
import X.InterfaceC55235Lm3;
import X.InterfaceC85215XcR;
import X.JHK;
import X.JON;
import X.KL2;
import X.O6R;
import X.ORZ;
import X.SY9;
import X.X1D;
import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.video.FocusingPosUpdateAbility;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class CardItemCell extends PowerCell<PoiDiscoveryApi.PoiDiscoveryCard> implements InterfaceC85215XcR {
    public static final int LJLLI = (int) KL2.LIZJ(EF7.LIZIZ(), 150.0f);
    public static final int LJLLILLLL = (int) KL2.LIZJ(EF7.LIZIZ(), 200.0f);
    public C119254m9 LJLIL;
    public C47689Ind LJLILLLLZI;
    public C62846OlW LJLJI;
    public JON LJLJJI;
    public VideoViewComponent LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxTextView LJLJL;
    public TuxTextView LJLJLJ;
    public Fragment LJLJLLL;
    public final C85252Xd2 LJLL = new C85252Xd2(this);

    @Override // X.InterfaceC85215XcR
    public final void LJIILLIIL() {
        C85254Xd4 c85254Xd4;
        PoiDiscoveryApi.PoiDiscoveryCard item;
        C85254Xd4 c85254Xd42;
        Integer num;
        C85254Xd4 c85254Xd43;
        C56462Jm c56462Jm;
        Integer valueOf;
        C85254Xd4 c85254Xd44;
        C56462Jm c56462Jm2;
        VideoViewComponent videoViewComponent = this.LJLJJL;
        if (videoViewComponent != null) {
            if (!videoViewComponent.LJLJI.d4() || (item = getItem()) == null || (c85254Xd42 = item.LJLJJI) == null || c85254Xd42.LIZLLL == null) {
                PoiDiscoveryApi.PoiDiscoveryCard item2 = getItem();
                if (item2 != null && (c85254Xd4 = item2.LJLJJI) != null) {
                    c85254Xd4.LIZJ = true;
                }
                StringBuilder sb = new StringBuilder("videoPlay - ");
                VideoViewComponent videoViewComponent2 = this.LJLJJL;
                if (videoViewComponent2 != null) {
                    sb.append(videoViewComponent2);
                    sb.append(" texture not available");
                    C188447aS.LIZ(sb.toString());
                    return;
                }
                o.LJIJI("videoView");
                throw null;
            }
            StringBuilder sb2 = new StringBuilder("videoPlay - playStatus:");
            PoiDiscoveryApi.PoiDiscoveryCard item3 = getItem();
            if (item3 != null && (c85254Xd44 = item3.LJLJJI) != null && (c56462Jm2 = c85254Xd44.LJ) != null) {
                num = Integer.valueOf(c56462Jm2.LIZ);
            } else {
                num = null;
            }
            sb2.append(num);
            sb2.append(" -  ");
            VideoViewComponent videoViewComponent3 = this.LJLJJL;
            if (videoViewComponent3 != null) {
                sb2.append(videoViewComponent3);
                C188447aS.LIZ(sb2.toString());
                PoiDiscoveryApi.PoiDiscoveryCard item4 = getItem();
                if (item4 == null || (c85254Xd43 = item4.LJLJJI) == null || (c56462Jm = c85254Xd43.LJ) == null || (valueOf = Integer.valueOf(c56462Jm.LIZ)) == null || valueOf.intValue() != 0) {
                    return;
                }
                VideoViewComponent videoViewComponent4 = this.LJLJJL;
                if (videoViewComponent4 != null) {
                    videoViewComponent4.LIZ(this.LJLL);
                    VideoViewComponent videoViewComponent5 = this.LJLJJL;
                    if (videoViewComponent5 != null) {
                        Video video = item4.LJLJJI.LIZLLL;
                        FFL.LJIIIZ().getClass();
                        videoViewComponent5.LJII(video, FFL.LJIIJ(31744, 0, "decoder_type", true));
                        StringBuilder sb3 = new StringBuilder("videoPlay - ");
                        VideoViewComponent videoViewComponent6 = this.LJLJJL;
                        if (videoViewComponent6 != null) {
                            sb3.append(videoViewComponent6);
                            sb3.append(" play action, listener: ");
                            sb3.append(this.LJLL);
                            C188447aS.LIZ(sb3.toString());
                            C85254Xd4 c85254Xd45 = item4.LJLJJI;
                            c85254Xd45.LIZJ = false;
                            c85254Xd45.LJ.LIZ = 2;
                            return;
                        }
                        o.LJIJI("videoView");
                        throw null;
                    }
                    o.LJIJI("videoView");
                    throw null;
                }
                o.LJIJI("videoView");
                throw null;
            }
            o.LJIJI("videoView");
            throw null;
        }
        o.LJIJI("videoView");
        throw null;
    }

    public final void N() {
        PoiListApi.PoiDetailResponse poiDetailResponse;
        boolean z;
        long currentTimeMillis;
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String str5;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility;
        Long l;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility2;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility3;
        PoiDiscoveryApi.PoiDiscoveryCard item = getItem();
        if (item == null) {
            return;
        }
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        Fragment fragment = this.LJLJLLL;
        String str6 = null;
        if (fragment != null && (iPoiDetailInfoVAbility3 = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), IPoiDetailInfoVAbility.class, null)) != null) {
            poiDetailResponse = iPoiDetailInfoVAbility3.EO();
        } else {
            poiDetailResponse = null;
        }
        Fragment fragment2 = this.LJLJLLL;
        if (fragment2 != null && (iPoiDetailInfoVAbility2 = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment2, null), IPoiDetailInfoVAbility.class, null)) != null) {
            str6 = iPoiDetailInfoVAbility2.vu0();
        }
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        boolean z2 = false;
        if (item.poiDistanceForShow != null) {
            z = true;
        } else {
            z = false;
        }
        String LJJ = C43001GuD.LJJ(Boolean.valueOf(z));
        if (LJJ == null) {
            LJJ = "";
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        C85254Xd4 c85254Xd4 = item.LJLJJI;
        if (c85254Xd4 != null && (l = c85254Xd4.LIZIZ) != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        String duration = String.valueOf(currentTimeMillis2 - currentTimeMillis);
        String str8 = item.LJLILLLLZI;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = item.poiId;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = item.cityCode;
        if (str10 == null) {
            str10 = "";
        }
        C189987cw c189987cw = EnumC189997cx.Companion;
        String str11 = item.typeLevel;
        Boolean bool2 = item.isClaimed;
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        }
        c189987cw.getClass();
        String poiDetailType = C189987cw.LIZ(str11, z2).getTypeName();
        String str12 = item.regionCode;
        if (str12 == null) {
            str12 = "";
        }
        String LJJ2 = C43001GuD.LJJ(item.isClaimed);
        if (LJJ2 == null) {
            LJJ2 = "";
        }
        String str13 = item.collectInfo;
        String LJJ3 = C43001GuD.LJJ(Boolean.valueOf(LocationServiceImpl.LJIJJ().LJIJ("android.permission.ACCESS_COARSE_LOCATION")));
        if (LJJ3 == null) {
            LJJ3 = "";
        }
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        String LJJ4 = C43001GuD.LJJ(Boolean.valueOf(iLocationBaseServiceForMT.isSystemPrecise(context)));
        if (LJJ4 == null) {
            LJJ4 = "";
        }
        String LJJ5 = C43001GuD.LJJ(Boolean.valueOf(iLocationBaseServiceForMT.isInAppPrecise()));
        if (LJJ5 == null) {
            LJJ5 = "";
        }
        Fragment fragment3 = this.LJLJLLL;
        if (fragment3 == null || (iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment3, null), IPoiDetailInfoVAbility.class, null)) == null || (str = iPoiDetailInfoVAbility.G20()) == null) {
            str = "";
        }
        if (poiDetailResponse == null || (str2 = poiDetailResponse.cityCode) == null) {
            str2 = "";
        }
        if (poiDetailResponse == null || (str3 = poiDetailResponse.LJIIJJI()) == null) {
            str3 = "";
        }
        if (poiDetailResponse == null || (str4 = poiDetailResponse.regionCode) == null) {
            str4 = "";
        }
        if (poiDetailResponse != null) {
            bool = Boolean.valueOf(poiDetailResponse.LJIIIIZZ());
        } else {
            bool = null;
        }
        String LJJ6 = C43001GuD.LJJ(bool);
        if (LJJ6 != null) {
            str7 = LJJ6;
        }
        if (poiDetailResponse != null) {
            str5 = poiDetailResponse.collectInfo;
        } else {
            str5 = null;
        }
        o.LJIIIZ(duration, "duration");
        o.LJIIIZ(poiDetailType, "poiDetailType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "poi_detail");
        linkedHashMap.put("enter_method", "card_list");
        linkedHashMap.put("previous_page", str6);
        linkedHashMap.put("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("is_display_distance", LJJ);
        linkedHashMap.put("duration", duration);
        linkedHashMap.put("tab_code", str8);
        linkedHashMap.put("enable_location", LJJ3);
        linkedHashMap.put("system_is_precise", LJJ4);
        linkedHashMap.put("inapp_is_precise", LJJ5);
        linkedHashMap.put("poi_id", str9);
        linkedHashMap.put("poi_city", str10);
        linkedHashMap.put("poi_detail_type", poiDetailType);
        linkedHashMap.put("poi_region_code", str12);
        linkedHashMap.put("is_claimed", LJJ2);
        C43001GuD.LIZJ(str13, linkedHashMap);
        linkedHashMap.put("page_poi_id", str);
        linkedHashMap.put("page_poi_city", str2);
        linkedHashMap.put("page_poi_detail_type", str3);
        linkedHashMap.put("page_poi_region_code", str4);
        linkedHashMap.put("page_is_claimed", str7);
        C43001GuD.LIZLLL(str5, linkedHashMap);
        FMX.LJIIL("play_time", linkedHashMap);
        C85254Xd4 c85254Xd42 = item.LJLJJI;
        if (c85254Xd42 == null) {
            return;
        }
        c85254Xd42.LIZIZ = Long.valueOf(System.currentTimeMillis());
    }

    public final void P() {
        C62846OlW c62846OlW = this.LJLJI;
        String str = null;
        if (c62846OlW != null) {
            c62846OlW.setAlpha(1.0f);
            C62846OlW c62846OlW2 = this.LJLJI;
            if (c62846OlW2 != null) {
                c62846OlW2.setVisibility(0);
                JON jon = this.LJLJJI;
                if (jon != null) {
                    jon.setVisibility(4);
                    getItem();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("showCover,");
                    PoiDiscoveryApi.PoiDiscoveryCard item = getItem();
                    if (item != null) {
                        str = item.poiId;
                    }
                    LIZ.append(str);
                    C188447aS.LIZ(X1D.LIZIZ(LIZ));
                    return;
                }
                o.LJIJI("soundIcon");
                throw null;
            }
            o.LJIJI("ivCover");
            throw null;
        }
        o.LJIJI("ivCover");
        throw null;
    }

    @Override // X.InterfaceC85215XcR
    public final void LLLLLLLLL() {
        C85254Xd4 c85254Xd4;
        C85254Xd4 c85254Xd42;
        C56462Jm c56462Jm;
        C85254Xd4 c85254Xd43;
        C56462Jm c56462Jm2;
        PoiDiscoveryApi.PoiDiscoveryCard item = getItem();
        if (item != null) {
            c85254Xd4 = item.LJLJJI;
        } else {
            c85254Xd4 = null;
        }
        if (c85254Xd4 != null) {
            c85254Xd4.LIZJ = false;
        }
        PoiDiscoveryApi.PoiDiscoveryCard item2 = getItem();
        if (item2 == null || (c85254Xd43 = item2.LJLJJI) == null || (c56462Jm2 = c85254Xd43.LJ) == null || c56462Jm2.LIZ != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("videoPlay - ");
            VideoViewComponent videoViewComponent = this.LJLJJL;
            if (videoViewComponent != null) {
                LIZ.append(videoViewComponent);
                LIZ.append(" stop action , listener: ");
                LIZ.append(this.LJLL);
                C188447aS.LIZ(X1D.LIZIZ(LIZ));
                VideoViewComponent videoViewComponent2 = this.LJLJJL;
                if (videoViewComponent2 != null) {
                    videoViewComponent2.LJIIJJI();
                    VideoViewComponent videoViewComponent3 = this.LJLJJL;
                    if (videoViewComponent3 != null) {
                        videoViewComponent3.LJIIIZ();
                        VideoViewComponent videoViewComponent4 = this.LJLJJL;
                        if (videoViewComponent4 != null) {
                            videoViewComponent4.LLIIIILZ(this.LJLL);
                            PoiDiscoveryApi.PoiDiscoveryCard item3 = getItem();
                            if (item3 != null && (c85254Xd42 = item3.LJLJJI) != null && (c56462Jm = c85254Xd42.LJ) != null) {
                                c56462Jm.LIZ = 0;
                            }
                            N();
                        } else {
                            o.LJIJI("videoView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("videoView");
                        throw null;
                    }
                } else {
                    o.LJIJI("videoView");
                    throw null;
                }
            } else {
                o.LJIJI("videoView");
                throw null;
            }
        }
        P();
    }

    public final void Q() {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateCurrentMuteState() - pos:");
        LIZ.append(getBindingAdapterPosition());
        LIZ.append(" - state: ");
        boolean z2 = true;
        if (C85049XZl.LJI == 1) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        C188447aS.LIZ(X1D.LIZIZ(LIZ));
        JHK jhk = EnumC48916JHs.Companion;
        int i = C85049XZl.LJI;
        jhk.getClass();
        EnumC48916JHs LIZ2 = JHK.LIZ(i);
        if (LIZ2 != null) {
            if (C85049XZl.LJI != 1) {
                z2 = false;
            }
            if (z2) {
                VideoViewComponent videoViewComponent = this.LJLJJL;
                if (videoViewComponent != null) {
                    videoViewComponent.LJI();
                } else {
                    o.LJIJI("videoView");
                    throw null;
                }
            } else {
                VideoViewComponent videoViewComponent2 = this.LJLJJL;
                if (videoViewComponent2 != null) {
                    videoViewComponent2.LJIILIIL();
                } else {
                    o.LJIJI("videoView");
                    throw null;
                }
            }
            JON jon = this.LJLJJI;
            if (jon != null) {
                if (LIZ2 == jon.getState()) {
                    return;
                }
                JON jon2 = this.LJLJJI;
                if (jon2 != null) {
                    jon2.LIZ(LIZ2, false);
                    return;
                } else {
                    o.LJIJI("soundIcon");
                    throw null;
                }
            }
            o.LJIJI("soundIcon");
            throw null;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        boolean z;
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.hjv);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…very_card_item_container)");
        this.LJLIL = (C119254m9) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.l60);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.texture_video)");
        this.LJLILLLLZI = (C47689Ind) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.f12);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.iv_cover)");
        this.LJLJI = (C62846OlW) findViewById3;
        o.LJIIIIZZ(this.itemView.findViewById(R.id.n5y), "itemView.findViewById(R.id.video_holder_tux_mask)");
        View findViewById4 = this.itemView.findViewById(R.id.k7p);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.sound_icon)");
        this.LJLJJI = (JON) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.hk0);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.pd_discovery_distance)");
        this.LJLJJLL = (TuxTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.hjx);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.…discovery_card_item_name)");
        this.LJLJL = (TuxTextView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.hjw);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.…discovery_card_item_info)");
        this.LJLJLJ = (TuxTextView) findViewById7;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_map_pin_fill;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        SY9 LIZJ = C025908h.LIZJ(this.itemView, "itemView.context", c2068389v);
        LIZJ.setBounds(0, 0, LIZJ.LIZIZ(), LIZJ.LIZ());
        Context context = this.itemView.getContext();
        if (context != null && C26338AVi.LIZJ(context)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = this.LJLJJLL;
            if (tuxTextView != null) {
                tuxTextView.setCompoundDrawables(null, null, LIZJ, null);
            } else {
                o.LJIJI("tvDistance");
                throw null;
            }
        } else {
            TuxTextView tuxTextView2 = this.LJLJJLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setCompoundDrawables(LIZJ, null, null, null);
            } else {
                o.LJIJI("tvDistance");
                throw null;
            }
        }
        TuxTextView tuxTextView3 = this.LJLJJLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setCompoundDrawablePadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            View findViewById8 = this.itemView.findViewById(R.id.hk3);
            o.LJIIIIZZ(findViewById8, "itemView.findViewById<Vi…iscovery_video_container)");
            C43001GuD.LJIL(findViewById8, new AqS175S0100000_9(this, 180));
            View findViewById9 = this.itemView.findViewById(R.id.hjy);
            o.LJIIIIZZ(findViewById9, "itemView.findViewById<Vi…card_item_name_container)");
            C43001GuD.LJIL(findViewById9, new AqS181S0100000_15(this, 86));
            TuxTextView tuxTextView4 = this.LJLJLJ;
            if (tuxTextView4 != null) {
                C43001GuD.LJIL(tuxTextView4, new AqS181S0100000_15(this, 87));
                VideoViewComponent videoViewComponent = new VideoViewComponent(0);
                this.LJLJJL = videoViewComponent;
                if (C85049XZl.LJI == 1) {
                    videoViewComponent.LJI();
                } else {
                    videoViewComponent.LJIILIIL();
                }
                VideoViewComponent videoViewComponent2 = this.LJLJJL;
                if (videoViewComponent2 != null) {
                    C47689Ind c47689Ind = this.LJLILLLLZI;
                    if (c47689Ind != null) {
                        videoViewComponent2.LJIILJJIL(c47689Ind);
                        VideoViewComponent videoViewComponent3 = this.LJLJJL;
                        if (videoViewComponent3 != null) {
                            videoViewComponent3.LJLJI.N7(new C85253Xd3(this));
                            JON jon = this.LJLJJI;
                            if (jon != null) {
                                C16880lQ.LJJJLZIJ(jon, new ACListenerS28S0100000_8(this, 19));
                                View itemView = this.itemView;
                                o.LJIIIIZZ(itemView, "itemView");
                                C12460eI.LJ(itemView, new AqS181S0100000_15(this, 88));
                                this.LJLJLLL = C43001GuD.LJIIIIZZ(this);
                                View itemView2 = this.itemView;
                                o.LJIIIIZZ(itemView2, "itemView");
                                C12460eI.LIZJ(itemView2, new C85250Xd0(this));
                                return;
                            }
                            o.LJIJI("soundIcon");
                            throw null;
                        }
                        o.LJIJI("videoView");
                        throw null;
                    }
                    o.LJIJI("textureView");
                    throw null;
                }
                o.LJIJI("videoView");
                throw null;
            }
            o.LJIJI("tvInfo");
            throw null;
        }
        o.LJIJI("tvDistance");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0105, code lost:
    
        if (r4 == null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(android.view.View r36) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.discovery.category.CardItemCell.M(android.view.View):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(PoiDiscoveryApi.PoiDiscoveryCard poiDiscoveryCard) {
        Video video;
        Aweme aweme;
        Fragment LJIIIIZZ;
        Video video2;
        C85254Xd4 c85254Xd4;
        Video video3;
        PoiDiscoveryApi.PoiDiscoveryCard t = poiDiscoveryCard;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBindItemView - showSkeleton: ");
        LIZ.append(t.LJLJI);
        C188447aS.LIZ(X1D.LIZIZ(LIZ));
        if (t.LJLJI) {
            C119254m9 c119254m9 = this.LJLIL;
            if (c119254m9 != null) {
                c119254m9.setLoading(true);
                return;
            } else {
                o.LJIJI("skeletonLayout");
                throw null;
            }
        }
        C119254m9 c119254m92 = this.LJLIL;
        if (c119254m92 != null) {
            c119254m92.setLoading(false);
            final PoiDiscoveryApi.PoiDiscoveryCard item = getItem();
            if (item == null) {
                return;
            }
            C85254Xd4 c85254Xd42 = item.LJLJJI;
            if (c85254Xd42 != null) {
                List<Aweme> list = t.videoList;
                if (list != null && (aweme = (Aweme) ORZ.LJLLLL(list)) != null) {
                    video = aweme.getVideo();
                } else {
                    video = null;
                }
                c85254Xd42.LIZLLL = video;
            }
            int i = LJLLI;
            int i2 = LJLLILLLL;
            PoiDiscoveryApi.PoiDiscoveryCard item2 = getItem();
            if (item2 != null && (c85254Xd4 = item2.LJLJJI) != null && (video3 = c85254Xd4.LIZLLL) != null && video3.getWidth() != 0 && video3.getHeight() != 0) {
                float width = video3.getWidth();
                float height = video3.getHeight();
                float f = i;
                float f2 = i2;
                if (height / f2 < width / f) {
                    i = O6R.LJJIIZ((f2 / height) * width);
                } else {
                    i2 = O6R.LJJIIZ((f / width) * height);
                }
            }
            C62846OlW c62846OlW = this.LJLJI;
            if (c62846OlW != null) {
                c62846OlW.getLayoutParams().width = i;
                C62846OlW c62846OlW2 = this.LJLJI;
                if (c62846OlW2 != null) {
                    c62846OlW2.getLayoutParams().height = i2;
                    C47689Ind c47689Ind = this.LJLILLLLZI;
                    if (c47689Ind != null) {
                        c47689Ind.getLayoutParams().width = i;
                        C47689Ind c47689Ind2 = this.LJLILLLLZI;
                        if (c47689Ind2 != null) {
                            c47689Ind2.getLayoutParams().height = i2;
                            P();
                            C85254Xd4 c85254Xd43 = item.LJLJJI;
                            if (c85254Xd43 != null && (video2 = c85254Xd43.LIZLLL) != null) {
                                C62846OlW c62846OlW3 = this.LJLJI;
                                if (c62846OlW3 != null) {
                                    UrlModel originCover = video2.getOriginCover();
                                    if (originCover == null) {
                                        originCover = video2.getCover();
                                    }
                                    C78765Uvh.LJFF(c62846OlW3, originCover);
                                } else {
                                    o.LJIJI("ivCover");
                                    throw null;
                                }
                            }
                            JHK jhk = EnumC48916JHs.Companion;
                            int i3 = C85049XZl.LJI;
                            jhk.getClass();
                            EnumC48916JHs LIZ2 = JHK.LIZ(i3);
                            if (LIZ2 != null) {
                                JON jon = this.LJLJJI;
                                if (jon != null) {
                                    jon.LIZ(LIZ2, false);
                                } else {
                                    o.LJIJI("soundIcon");
                                    throw null;
                                }
                            }
                            String str = t.poiName;
                            if (str != null) {
                                TuxTextView tuxTextView = this.LJLJL;
                                if (tuxTextView != null) {
                                    tuxTextView.setText(str);
                                } else {
                                    o.LJIJI("tvName");
                                    throw null;
                                }
                            }
                            if (t.poiDistanceForShow != null) {
                                TuxTextView tuxTextView2 = this.LJLJJLL;
                                if (tuxTextView2 != null) {
                                    tuxTextView2.setVisibility(0);
                                    TuxTextView tuxTextView3 = this.LJLJJLL;
                                    if (tuxTextView3 != null) {
                                        tuxTextView3.setText(t.poiDistanceForShow);
                                    } else {
                                        o.LJIJI("tvDistance");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("tvDistance");
                                    throw null;
                                }
                            } else {
                                TuxTextView tuxTextView4 = this.LJLJJLL;
                                if (tuxTextView4 != null) {
                                    tuxTextView4.setVisibility(4);
                                } else {
                                    o.LJIJI("tvDistance");
                                    throw null;
                                }
                            }
                            String str2 = item.poiDisplay;
                            TuxTextView tuxTextView5 = this.LJLJLJ;
                            if (tuxTextView5 != null) {
                                tuxTextView5.setText(str2);
                                LifecycleOwner parent = getParent();
                                if (parent == null || (LJIIIIZZ = C43001GuD.LJIIIIZZ(parent)) == null) {
                                    return;
                                }
                                InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LJIIIIZZ, null);
                                FocusingPosUpdateAbility focusingPosUpdateAbility = new FocusingPosUpdateAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.discovery.category.CardItemCell$onBindItemView$7
                                    @Override // com.ss.android.ugc.aweme.poi.detail.discovery.video.FocusingPosUpdateAbility
                                    public final void U80(String str3, int i4, int i5) {
                                        String str4;
                                        String str5;
                                        InterfaceC85215XcR interfaceC85215XcR;
                                        InterfaceC85215XcR interfaceC85215XcR2;
                                        PoiDiscoveryApi.PoiDiscoveryCard poiDiscoveryCard2 = PoiDiscoveryApi.PoiDiscoveryCard.this;
                                        if (poiDiscoveryCard2 != null) {
                                            str4 = poiDiscoveryCard2.LJLILLLLZI;
                                        } else {
                                            str4 = null;
                                        }
                                        if (!o.LJ(str3, str4) || i4 != this.getBindingAdapterPosition()) {
                                            return;
                                        }
                                        StringBuilder LJ = AnonymousClass028.LJ("Cell - onFocusingPosUpdate - focusingTabCode:", str3, ", newFocusPos: ", i4, "; lastFocusPos: ");
                                        LJ.append(i5);
                                        LJ.append("； current TabCode: ");
                                        PoiDiscoveryApi.PoiDiscoveryCard poiDiscoveryCard3 = PoiDiscoveryApi.PoiDiscoveryCard.this;
                                        if (poiDiscoveryCard3 != null) {
                                            str5 = poiDiscoveryCard3.LJLILLLLZI;
                                        } else {
                                            str5 = null;
                                        }
                                        LJ.append(str5);
                                        C188447aS.LIZ(X1D.LIZIZ(LJ));
                                        this.getClass();
                                        String itemId = CardItemCell.L(i4, str3);
                                        if (o.LJ(itemId, C85049XZl.LIZJ)) {
                                            this.Q();
                                            WeakReference<InterfaceC85215XcR> weakReference = C85049XZl.LJFF;
                                            if (weakReference == null || (interfaceC85215XcR2 = weakReference.get()) == null) {
                                                return;
                                            }
                                            interfaceC85215XcR2.LJIILLIIL();
                                            return;
                                        }
                                        WeakReference<InterfaceC85215XcR> weakReference2 = C85049XZl.LJFF;
                                        if (weakReference2 != null && (interfaceC85215XcR = weakReference2.get()) != null) {
                                            interfaceC85215XcR.LLLLLLLLL();
                                        }
                                        this.Q();
                                        this.LJIILLIIL();
                                        CardItemCell videoViewContainer = this;
                                        o.LJIIIZ(videoViewContainer, "videoViewContainer");
                                        o.LJIIIZ(itemId, "itemId");
                                        WeakReference<InterfaceC85215XcR> weakReference3 = C85049XZl.LJFF;
                                        if (weakReference3 != null) {
                                            weakReference3.clear();
                                        }
                                        C85049XZl.LJFF = null;
                                        C85049XZl.LJFF = new WeakReference<>(videoViewContainer);
                                        C85049XZl.LIZJ = itemId;
                                    }
                                };
                                C2K0 LIZ3 = C55096Ljo.LIZ(LIZJ, FocusingPosUpdateAbility.class, null);
                                if (LIZ3 == null) {
                                    C55096Ljo.LJIIJJI(LIZJ, focusingPosUpdateAbility, FocusingPosUpdateAbility.class, null);
                                    return;
                                }
                                try {
                                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ3);
                                    if (invocationHandler instanceof EV9) {
                                        ((EV9) invocationHandler).LIZ.add(focusingPosUpdateAbility);
                                        return;
                                    }
                                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                                } catch (IllegalArgumentException unused) {
                                    EV9 ev9 = new EV9();
                                    ev9.LIZ.add(focusingPosUpdateAbility);
                                    ev9.LIZ.add(LIZ3);
                                    Object newProxyInstance = Proxy.newProxyInstance(FocusingPosUpdateAbility.class.getClassLoader(), new Class[]{FocusingPosUpdateAbility.class}, ev9);
                                    if (newProxyInstance != null) {
                                        C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, FocusingPosUpdateAbility.class, null);
                                        return;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.discovery.video.FocusingPosUpdateAbility");
                                }
                            }
                            o.LJIJI("tvInfo");
                            throw null;
                        }
                        o.LJIJI("textureView");
                        throw null;
                    }
                    o.LJIJI("textureView");
                    throw null;
                }
                o.LJIJI("ivCover");
                throw null;
            }
            o.LJIJI("ivCover");
            throw null;
        }
        o.LJIJI("skeletonLayout");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.c08, viewGroup, false, "from(parent.context).inf…very_card, parent, false)");
    }

    public static String L(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append('_');
        LIZ.append(i);
        return X1D.LIZIZ(LIZ);
    }
}
