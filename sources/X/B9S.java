package X;

import Y.ACListenerS40S0200000_5;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.dataChannel.AudienceLastSelectDefinitionInfo;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B9S extends AbstractC029409q<B9T> {
    public final RecyclerView LJLIL;
    public final List<B9G> LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final DataChannel LJLJJL;
    public final B9J LJLJJLL;
    public int LJLJL;
    public final Handler LJLJLJ;
    public boolean LJLJLLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    public final void LJLLLLLL(B9T b9t) {
        int bindingAdapterPosition;
        int i;
        if (!this.LJLJLLL && (bindingAdapterPosition = b9t.getBindingAdapterPosition()) != (i = this.LJLJL)) {
            String str = "";
            if (this.LJLJJI) {
                this.LJLJLLL = true;
                String str2 = ((B9G) ListProtector.get(this.LJLILLLLZI, bindingAdapterPosition)).LIZJ;
                String str3 = ((B9G) ListProtector.get(this.LJLILLLLZI, i)).LIZJ;
                if (str3 == null) {
                    str3 = "";
                }
                StringBuilder LIZJ = C06460Ne.LIZJ("handleAnchorItemSelect. oldPosition=", i, ". ; newPosition=", bindingAdapterPosition, ",  newResolution=");
                LIZJ.append(str2);
                LIZJ.append('.');
                C0NB.LJIIIZ("LiveDefinitionSelectionDialog", X1D.LIZIZ(LIZJ));
                PushStreamInfo.Quality quality = new PushStreamInfo.Quality();
                quality.sdkKey = ((B9G) ListProtector.get(this.LJLILLLLZI, bindingAdapterPosition)).LIZJ;
                quality.name = ((B9G) ListProtector.get(this.LJLILLLLZI, bindingAdapterPosition)).LIZ;
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                dataChannelGlobal.tv0(BroadcastShareScreenDefinition.class, quality);
                HashMap hashMap = new HashMap();
                String str4 = quality.name;
                o.LJIIIIZZ(str4, "quality.name");
                hashMap.put("name", str4);
                String str5 = quality.sdkKey;
                o.LJIIIIZZ(str5, "quality.sdkKey");
                hashMap.put("sdk_key", str5);
                InterfaceC30442Bx8.LLLZI.LIZ(hashMap);
                String str6 = quality.sdkKey;
                o.LJIIIIZZ(str6, "quality.sdkKey");
                LJLZ(str6, str3, true);
                LJZ(bindingAdapterPosition);
                LJZL(i);
                this.LJLJL = bindingAdapterPosition;
                this.LJLJJLL.LLLLLJLJLL();
                this.LJLJLLL = false;
                if (!C77357UXp.LJJIII()) {
                    return;
                }
                ((C32537Cpp) dataChannelGlobal.gv0(C29041BaX.class)).LIZ = "";
                return;
            }
            this.LJLJLLL = true;
            String str7 = ((B9G) ListProtector.get(this.LJLILLLLZI, bindingAdapterPosition)).LIZJ;
            String str8 = ((B9G) ListProtector.get(this.LJLILLLLZI, i)).LIZJ;
            if (str8 == null) {
                str8 = "";
            }
            String str9 = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
            if (str9 != null) {
                str = str9;
            }
            InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(str);
            if (LIZIZ == null) {
                return;
            }
            LIZIZ.switchResolution(str7, new B9I(this, bindingAdapterPosition, str, str8, i));
        }
    }

    public final void LJZ(int i) {
        C41061jK c41061jK;
        QZP.LIZJ("selectItemUI. position=", i, "LiveDefinitionSelectionDialog");
        ((B9G) ListProtector.get(this.LJLILLLLZI, i)).LIZLLL = true;
        RecyclerView recyclerView = this.LJLIL;
        RecyclerView.ViewHolder viewHolder = null;
        if (recyclerView != null) {
            viewHolder = recyclerView.LJJIZ(i);
        }
        B9T b9t = (B9T) viewHolder;
        if (b9t != null) {
            ConstraintLayout constraintLayout = b9t.LJLIL;
            if (constraintLayout != null) {
                constraintLayout.setSelected(true);
            }
            if (b9t != null) {
                C47121t6 c47121t6 = b9t.LJLILLLLZI;
                if (c47121t6 != null) {
                    c47121t6.setSelected(true);
                }
                if (b9t == null || (c41061jK = b9t.LJLJJL) == null) {
                    return;
                }
                c41061jK.setChecked(true);
            }
        }
    }

    public final void LJZL(int i) {
        C41061jK c41061jK;
        QZP.LIZJ("unSelectItem. position=", i, "LiveDefinitionSelectionDialog");
        ((B9G) ListProtector.get(this.LJLILLLLZI, i)).LIZLLL = false;
        RecyclerView recyclerView = this.LJLIL;
        RecyclerView.ViewHolder viewHolder = null;
        if (recyclerView != null) {
            viewHolder = recyclerView.LJJIZ(i);
        }
        B9T b9t = (B9T) viewHolder;
        if (b9t != null) {
            ConstraintLayout constraintLayout = b9t.LJLIL;
            if (constraintLayout != null) {
                constraintLayout.setSelected(false);
            }
            if (b9t != null) {
                C47121t6 c47121t6 = b9t.LJLILLLLZI;
                if (c47121t6 != null) {
                    c47121t6.setSelected(false);
                }
                if (b9t == null || (c41061jK = b9t.LJLJJL) == null) {
                    return;
                }
                c41061jK.setChecked(false);
            }
        }
    }

    public final void LJZI(boolean z, PushStreamInfo.Quality quality) {
        int i;
        String str;
        String str2 = quality.sdkKey;
        o.LJIIIIZZ(str2, "quality.sdkKey");
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (o.LJ("auto", lowerCase)) {
            long currentTimeMillis = System.currentTimeMillis();
            C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.C;
            Long LIZJ = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ, "AUTO_SWITCH_SHOW_TIME.value");
            if (currentTimeMillis - LIZJ.longValue() > 86400000) {
                C30868C9o.LIZJ(R.string.ovj);
                c48459J0d.LIZ(Long.valueOf(System.currentTimeMillis()));
                return;
            }
            return;
        }
        if (z) {
            i = R.string.o1b;
        } else {
            i = R.string.kqf;
        }
        String str3 = quality.name;
        o.LJIIIIZZ(str3, "quality.name");
        RecyclerView recyclerView = this.LJLIL;
        Context context = null;
        if (recyclerView != null) {
            context = recyclerView.getContext();
        }
        Activity LJIILJJIL = g0.LJIILJJIL(context);
        if (LJIILJJIL == null || (str = LJIILJJIL.getString(i, str3)) == null) {
            str = "";
        }
        C30868C9o.LJI(str);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(B9T b9t, int i) {
        B9T holder = b9t;
        o.LJIIIZ(holder, "holder");
        B9G quality = (B9G) ListProtector.get(this.LJLILLLLZI, i);
        o.LJIIIZ(quality, "quality");
        C41061jK c41061jK = holder.LJLJJL;
        if (c41061jK != null) {
            c41061jK.setClickable(false);
        }
        C47121t6 c47121t6 = holder.LJLILLLLZI;
        if (c47121t6 != null) {
            c47121t6.setText(quality.LIZ);
        }
        C47121t6 c47121t62 = holder.LJLJI;
        if (c47121t62 != null) {
            String str = quality.LIZIZ;
            if (str == null) {
                str = "";
            }
            c47121t62.setText(str);
        }
        C41061jK c41061jK2 = holder.LJLJJL;
        if (c41061jK2 != null) {
            c41061jK2.setChecked(quality.LIZLLL);
        }
        ConstraintLayout constraintLayout = holder.LJLIL;
        if (constraintLayout != null) {
            constraintLayout.setSelected(quality.LIZLLL);
        }
        C47121t6 c47121t63 = holder.LJLILLLLZI;
        if (c47121t63 != null) {
            c47121t63.setSelected(quality.LIZLLL);
        }
        if (C77357UXp.LJJIII() && quality.LJ) {
            C47121t6 c47121t64 = holder.LJLJJI;
            if (c47121t64 != null) {
                c47121t64.setVisibility(0);
            }
        } else {
            C47121t6 c47121t65 = holder.LJLJJI;
            if (c47121t65 != null) {
                c47121t65.setVisibility(8);
            }
        }
        C47121t6 c47121t66 = holder.LJLILLLLZI;
        if (c47121t66 != null) {
            C16880lQ.LJJIIZ(c47121t66, new ACListenerS40S0200000_5(holder, this, 16));
        }
        C16880lQ.LJIIJ(new ACListenerS40S0200000_5(holder, this, 17), holder.itemView);
    }

    @Override // X.AbstractC029409q
    public final B9T onCreateViewHolder(ViewGroup parent, int i) {
        int i2;
        o.LJIIIZ(parent, "parent");
        if (this.LJLJJI) {
            i2 = R.layout.cw8;
        } else {
            i2 = R.layout.cw9;
        }
        View view = C28289B8j.LIZ(parent, i2, parent, false);
        o.LJIIIIZZ(view, "view");
        B9T b9t = new B9T(view);
        C0AX.LIZ(parent, b9t.itemView, R.id.lj7);
        View view2 = b9t.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (b9t.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(B9T.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) b9t.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(b9t.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = B9T.class.getName();
        return b9t;
    }

    public final void LJLZ(String str, String str2, boolean z) {
        Object obj;
        String str3;
        String previousDefinition;
        String str4;
        String valueOf;
        java.util.Map map;
        java.util.Map map2;
        LiveMode liveMode;
        DataChannel dataChannel = this.LJLJJL;
        String str5 = "";
        if (dataChannel == null || (obj = dataChannel.kv0(BCN.class)) == null) {
            obj = "";
        }
        String obj2 = obj.toString();
        DataChannel dataChannel2 = this.LJLJJL;
        if (dataChannel2 != null && (liveMode = (LiveMode) dataChannel2.kv0(BCX.class)) != null) {
            str5 = C28509BGv.LIZ(liveMode);
        }
        boolean z2 = this.LJLJI;
        String str6 = "1";
        if (z2) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        } else if (!z2) {
            str3 = "1";
        } else {
            throw new C162476Zf();
        }
        DataChannel dataChannel3 = this.LJLJJL;
        if (dataChannel3 == null || (map2 = (java.util.Map) dataChannel3.kv0(AudienceLastSelectDefinitionInfo.class)) == null || (previousDefinition = (String) map2.get("sdk_key")) == null) {
            previousDefinition = str2;
        }
        try {
            DataChannel dataChannel4 = this.LJLJJL;
            if (dataChannel4 == null || (map = (java.util.Map) dataChannel4.kv0(AudienceLastSelectDefinitionInfo.class)) == null || (valueOf = (String) map.get("start_time")) == null) {
                valueOf = String.valueOf(System.currentTimeMillis());
            }
            str4 = String.valueOf((System.currentTimeMillis() - CastLongProtector.parseLong(valueOf)) / 1000);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("reportSelectSuccess. catch exception=");
            LIZ.append(e);
            C0NB.LJIIIZ("LiveDefinitionSelectionDialog", X1D.LIZIZ(LIZ));
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        if (z) {
            String LJIJI = C77357UXp.LJIJI();
            o.LJIIIZ(previousDefinition, "previousDefinition");
            boolean LJ = o.LJ(LJIJI, str);
            if (!LJ) {
                if (!LJ) {
                    str6 = CardStruct.IStatusCode.DEFAULT;
                } else {
                    throw new C162476Zf();
                }
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_live_anchor_definition_selection_select_success");
            C06540Nm.LJFF((C29374Bfu) B83.LIZ().LIZIZ(), LIZ2, "anchor_id", previousDefinition, "previous_definition");
            LIZ2.LJIJJ(str, "current_definition");
            LIZ2.LJIJJ("click", "switch_type");
            LIZ2.LJIJJ(str6, "is_recommend_definition");
            LIZ2.LJIJ("screen_share");
            LIZ2.LJJIIJZLJL();
            return;
        }
        C78963Uyt.LJJIJLIJ(obj2, str5, str3, str4, previousDefinition, "normal", str);
    }

    public B9S(RecyclerView recyclerView, List<B9G> list, boolean z, boolean z2, DataChannel dataChannel, B9J finishSelectionListener) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(finishSelectionListener, "finishSelectionListener");
        this.LJLIL = recyclerView;
        this.LJLILLLLZI = list;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = dataChannel;
        this.LJLJJLL = finishSelectionListener;
        this.LJLJLJ = new Handler(C16880lQ.LLJJJJ());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((B9G) ListProtector.get(this.LJLILLLLZI, i)).LIZLLL) {
                this.LJLJL = i;
                return;
            }
        }
    }
}
