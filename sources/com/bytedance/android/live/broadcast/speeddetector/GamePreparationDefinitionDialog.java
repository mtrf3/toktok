package com.bytedance.android.live.broadcast.speeddetector;

import X.B83;
import X.BZI;
import X.C03880Dg;
import X.C06540Nm;
import X.C09730Zt;
import X.C0KB;
import X.C0NB;
import X.C12770en;
import X.C15380j0;
import X.C16880lQ;
import X.C1GO;
import X.C28787BRn;
import X.C29039BaV;
import X.C29306Beo;
import X.C29374Bfu;
import X.C30922CBq;
import X.C51029K0z;
import X.C65300Pk0;
import X.C77357UXp;
import X.C78496UrM;
import X.InterfaceC11010bx;
import X.JBR;
import X.X1D;
import Y.IDCListenerS135S0100000;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationDefinitionDialogAlive;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationPageDestroyEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes.dex */
public final class GamePreparationDefinitionDialog extends LiveSheetFragment implements InterfaceC11010bx {
    public RecyclerView LLD;
    public C1GO LLF;

    public GamePreparationDefinitionDialog() {
        new LinkedHashMap();
    }

    public static List Ml() {
        PushStreamInfo pushStreamInfo;
        ArrayList arrayList;
        String str;
        boolean z;
        boolean z2;
        String str2;
        ArrayList arrayList2 = new ArrayList();
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) DataChannelGlobal.LJLJJI.mv0(C29039BaV.class);
        if (roomCreateInfo != null) {
            Map<Long, PushStreamInfo> map = roomCreateInfo.pushStreamInfoMap;
            String str3 = null;
            if (map != null && (pushStreamInfo = map.get(4L)) != null) {
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
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("genBroadcastSupportDefinitionList(). initialQuality=");
                    LIZ.append(quality3);
                    LIZ.append(";selectedSdkKey=");
                    LIZ.append(str);
                    LIZ.append(";needShowsSuggestedSdkKey=");
                    JBR.LJIIJ(LIZ, str3, LIZ, "GamePreparationDefinitionDialogTag");
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        PushStreamInfo.Quality item = (PushStreamInfo.Quality) it.next();
                        o.LJIIIIZZ(item, "item");
                        C09730Zt c09730Zt = new C09730Zt(item);
                        if (C29306Beo.LJIJJLI(str) && o.LJ(str, item.sdkKey)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c09730Zt.LIZLLL = z;
                        if (C29306Beo.LJIJJLI(str3) && o.LJ(str3, item.sdkKey)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c09730Zt.LJ = z2;
                        arrayList2.add(c09730Zt);
                    }
                }
                if (C30922CBq.LIZIZ) {
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        C09730Zt c09730Zt2 = (C09730Zt) it2.next();
                        sb.append(c09730Zt2.LIZJ);
                        sb.append(",");
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("selected=");
                        LIZ2.append(c09730Zt2.LIZLLL);
                        sb.append(X1D.LIZIZ(LIZ2));
                        sb.append(",");
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("suggested=");
                        LIZ3.append(c09730Zt2.LJ);
                        sb.append(X1D.LIZIZ(LIZ3));
                        sb.append("; ");
                    }
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("genBroadcastSupportDefinitionList(). broadcastSupportList=");
                    LIZ4.append((Object) sb);
                    LIZ4.append(';');
                    C0NB.LJIIIZ("GamePreparationDefinitionDialogTag", X1D.LIZIZ(LIZ4));
                }
            }
        }
        return arrayList2;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.k10));
        return c0kb;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(GamePreparationDefinitionDialogAlive.class, Boolean.FALSE);
        }
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GamePreparationDefinitionDialogTag", "onDestroy()");
        }
    }

    @Override // X.InterfaceC11010bx
    public final void LLLLLJLJLL() {
        close();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions Ll(Context context) {
        o.LJIIIZ(context, "context");
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZIZ(2);
        sheetOptions.cornerRadius = C15380j0.LIZ(12.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(GamePreparationDefinitionDialogAlive.class, Boolean.TRUE);
        }
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GamePreparationDefinitionDialogTag", "onCreate()");
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "3420187659828473247");
        if (c03880Dg.LIZJ(10501, "com/bytedance/android/live/broadcast/speeddetector/GamePreparationDefinitionDialog", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/bytedance/android/live/broadcast/speeddetector/GamePreparationDefinitionDialog", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        if (!z) {
            C12770en.LIZJ("quality_setting");
        }
        c03880Dg.LIZIZ(10501, "com/bytedance/android/live/broadcast/speeddetector/GamePreparationDefinitionDialog", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.cx9, viewGroup, false, "inflater.inflate(\n      …         false,\n        )");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GamePreparationDefinitionDialogTag", "onViewCreated()");
        }
        C12770en.LIZJ("quality_setting");
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.lnr);
        if (constraintLayout != null) {
            C16880lQ.LJIL(constraintLayout, new IDCListenerS135S0100000(this, 33));
        }
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.lv0(this, GamePreparationPageDestroyEvent.class, new IDqS416S0100000(this, 154));
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.qv0(this, this, BroadcastShareScreenDefinition.class, new IDqS416S0100000(this, 155));
        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) dataChannelGlobal.mv0(BroadcastShareScreenDefinition.class);
        if (quality == null || (str = quality.sdkKey) == null) {
            str = "";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_definition_selection_page_show");
        C06540Nm.LJFF((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id", str, "current_definition");
        LIZ.LJIJ("screen_share");
        LIZ.LJJIIJZLJL();
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onViewCreated(). quality=");
            LIZ2.append(quality);
            C0NB.LJIIIZ("GamePreparationDefinitionDialogTag", X1D.LIZIZ(LIZ2));
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.lnq);
        this.LLD = recyclerView;
        if (recyclerView != null) {
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        }
        C1GO c1go = new C1GO(this.LLD, Ml(), C51029K0z.LJIILIIL(this), this);
        this.LLF = c1go;
        RecyclerView recyclerView2 = this.LLD;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.setAdapter(c1go);
    }
}
