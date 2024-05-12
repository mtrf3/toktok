package com.bytedance.android.livesdk.definition;

import X.B57;
import X.B83;
import X.B9G;
import X.B9J;
import X.B9S;
import X.BCN;
import X.BCW;
import X.BCX;
import X.BY6;
import X.BZI;
import X.C06540Nm;
import X.C162476Zf;
import X.C16880lQ;
import X.C28509BGv;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C51029K0z;
import X.C77357UXp;
import X.C78886Uxe;
import X.C78963Uyt;
import X.CN1;
import X.FT5;
import X.InterfaceC28738BPq;
import X.InterfaceC29882Bo6;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.AudienceResolutionDegrade;
import com.bytedance.android.livesdk.dataChannel.BroadcastOpenDefinitionDialogEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class LiveDefinitionSelectionDialog extends LiveDialogFragment implements B9J {
    public static final /* synthetic */ int LJLJL = 0;
    public boolean LJLIL;
    public RecyclerView LJLILLLLZI;
    public ImageView LJLJI;
    public ImageView LJLJJI;
    public B9S LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C28507BGt createParams() {
        /*
            r6 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.dataChannel
            r2 = 1
            if (r1 == 0) goto L5a
            java.lang.Class<X.BCW> r0 = X.BCW.class
            java.lang.Object r0 = r1.kv0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L5a
            boolean r1 = r0.booleanValue()
            if (r1 == 0) goto L46
        L15:
            r5 = 2131887505(0x7f120591, float:1.9409619E38)
            if (r1 != r2) goto L4a
            r4 = 80
        L1c:
            r3 = -1
            if (r1 != r2) goto L36
            r2 = -1
            r3 = -2
            r0 = 2131563268(0x7f0d1304, float:1.8751988E38)
        L24:
            X.BGt r1 = new X.BGt
            r1.<init>(r0)
            r1.LIZJ = r5
            r0 = 48
            r1.LJIILIIL = r0
            r1.LJII = r4
            r1.LJIIIZ = r2
            r1.LJIIJ = r3
            return r1
        L36:
            android.content.Context r1 = r6.getContext()
            r0 = 1136361472(0x43bb8000, float:375.0)
            float r0 = X.B9K.LIZ(r1, r0)
            int r2 = (int) r0
            r0 = 2131563271(0x7f0d1307, float:1.8751994E38)
            goto L24
        L46:
            r5 = 2131887507(0x7f120593, float:1.9409623E38)
            goto L4c
        L4a:
            if (r1 != 0) goto L5c
        L4c:
            android.content.Context r0 = r6.getContext()
            boolean r0 = X.CCJ.LIZ(r0)
            if (r0 == 0) goto L58
            r4 = 3
            goto L1c
        L58:
            r4 = 5
            goto L1c
        L5a:
            r1 = 1
            goto L15
        L5c:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.definition.LiveDefinitionSelectionDialog.createParams():X.BGt");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC29882Bo6 genLandscapeDialogProxy() {
        return new BY6(R.layout.cw_);
    }

    @Override // X.B9J
    public final void LLLLLJLJLL() {
        dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        String currentResolution;
        String str5;
        DataChannel dataChannel;
        LiveMode liveMode;
        Long l;
        Boolean bool;
        super.onCreate(bundle);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(BCW.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            z2 = arguments.getBoolean("key_is_preview");
        } else {
            z2 = false;
        }
        this.LJLIL = z2;
        DataChannel dataChannel3 = this.dataChannel;
        String str6 = "";
        if (dataChannel3 == null || (l = (Long) dataChannel3.kv0(BCN.class)) == null || (str = l.toString()) == null) {
            str = "";
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 == null || (liveMode = (LiveMode) dataChannel4.kv0(BCX.class)) == null) {
            str2 = "";
        } else {
            str2 = C28509BGv.LIZ(liveMode);
        }
        if (z) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        } else if (!z) {
            str3 = "1";
        } else {
            throw new C162476Zf();
        }
        if (this.LJLIL && (dataChannel = this.dataChannel) != null) {
            dataChannel.pv0(BroadcastOpenDefinitionDialogEvent.class);
        }
        if (this.LJLIL) {
            PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LJLJJI.mv0(BroadcastShareScreenDefinition.class);
            if (quality != null && (str5 = quality.sdkKey) != null) {
                str6 = str5;
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_definition_selection_page_show");
            C06540Nm.LJFF((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id", str6, "current_definition");
            LIZ.LJIJ("screen_share");
            LIZ.LJJIIJZLJL();
        } else {
            String str7 = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
            if (str7 == null) {
                str7 = "";
            }
            InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(str7);
            if (LIZIZ != null && (currentResolution = LIZIZ.getCurrentResolution()) != null) {
                str6 = currentResolution;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_live_definition_selection_page_show");
            LIZ2.LJIJJ(C78963Uyt.LJIIIZ(), "anchor_id");
            LIZ2.LJIJJ(str, "room_id");
            LIZ2.LJIJJ(Long.valueOf(C78963Uyt.LJJ()), "user_id");
            if (o.LJ(CardStruct.IStatusCode.DEFAULT, str3)) {
                str4 = "portrait";
            } else {
                str4 = "landscape";
            }
            LIZ2.LJIJJ(str4, "room_orientation");
            LIZ2.LJIJJ(str6, "current_definition");
            LIZ2.LJIJ(str2);
            LIZ2.LJJIIJZLJL();
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.lv0(this, LiveEndDismissDialogEvent.class, new AqS171S0100000_5(this, 377));
        }
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            dataChannel6.lv0(this, AudienceResolutionDegrade.class, new AqS171S0100000_5(this, 378));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        ?? LJIIJ;
        RoomCreateInfo roomCreateInfo;
        Map<Long, PushStreamInfo> map;
        PushStreamInfo pushStreamInfo;
        ArrayList arrayList;
        String str;
        boolean z3;
        boolean z4;
        String str2;
        Dialog dialog;
        Window window;
        View decorView;
        Boolean bool;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(BCW.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        String str3 = null;
        if (!z && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(2050);
        }
        this.LJLILLLLZI = (RecyclerView) view.findViewById(R.id.lni);
        this.LJLJI = (ImageView) view.findViewById(R.id.lng);
        this.LJLJJI = (ImageView) view.findViewById(R.id.lnj);
        if (!C77357UXp.LJJIII()) {
            z2 = false;
        } else {
            z2 = this.LJLIL;
        }
        if (z2) {
            ImageView imageView = this.LJLJJI;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.LJLJI;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            ImageView imageView3 = this.LJLJJI;
            if (imageView3 != null) {
                C16880lQ.LJIILLIIL(imageView3, new ACListenerS25S0100000_5(this, 148));
            }
        } else {
            ImageView imageView4 = this.LJLJJI;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            ImageView imageView5 = this.LJLJI;
            if (imageView5 != null) {
                imageView5.setVisibility(0);
            }
        }
        ImageView imageView6 = this.LJLJI;
        if (imageView6 != null) {
            C16880lQ.LJIILLIIL(imageView6, new ACListenerS25S0100000_5(this, 149));
        }
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 150), view);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isPreviewPager:");
        FT5.LJ(LIZ, this.LJLIL, LIZ, "LiveDefinitionSelectionDialog");
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        }
        boolean z5 = this.LJLIL;
        if (z5) {
            LJIIJ = new ArrayList();
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
            if (LJIILIIL != null && (roomCreateInfo = (RoomCreateInfo) LJIILIIL.kv0(RoomCreateInfoChannel.class)) != null && (map = roomCreateInfo.pushStreamInfoMap) != null && (pushStreamInfo = map.get(4L)) != null) {
                List<PushStreamInfo.Quality> list = pushStreamInfo.qualityList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (PushStreamInfo.Quality quality : list) {
                        PushStreamInfo.Quality quality2 = quality;
                        String str4 = quality2.sdkKey;
                        o.LJIIIIZZ(str4, "quality.sdkKey");
                        if (!s.LJJJLZIJ(str4, "auto", false) && (str2 = quality2.sdkKey) != null && !ujb.o.LJJJJJL(str2)) {
                            arrayList.add(quality);
                        }
                    }
                } else {
                    arrayList = null;
                }
                PushStreamInfo.Quality quality3 = (PushStreamInfo.Quality) DataChannelGlobal.LJLJJI.mv0(BroadcastShareScreenDefinition.class);
                if (quality3 == null || (str = quality3.sdkKey) == null) {
                    str = "";
                }
                if (C77357UXp.LJJIII()) {
                    str3 = C77357UXp.LJIJI();
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        PushStreamInfo.Quality item = (PushStreamInfo.Quality) it.next();
                        o.LJIIIIZZ(item, "item");
                        B9G b9g = new B9G(item.name, item.desc, item.sdkKey);
                        if (C29306Beo.LJIJJLI(str) && o.LJ(str, item.sdkKey)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        b9g.LIZLLL = z3;
                        if (C29306Beo.LJIJJLI(str3) && o.LJ(str3, item.sdkKey)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        b9g.LJ = z4;
                        LJIIJ.add(b9g);
                    }
                }
            }
        } else if (!z5) {
            LJIIJ = C78886Uxe.LJIIJ(this.dataChannel);
        } else {
            throw new C162476Zf();
        }
        B9S b9s = new B9S(this.LJLILLLLZI, LJIIJ, z, this.LJLIL, this.dataChannel, this);
        this.LJLJJL = b9s;
        RecyclerView recyclerView2 = this.LJLILLLLZI;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.setAdapter(b9s);
    }
}
