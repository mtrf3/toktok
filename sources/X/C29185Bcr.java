package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.broadcast.PreScheduleResultChannel;
import com.bytedance.android.livesdk.broadcast.SelectedStreamResolutionChannel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import webcast.api.creator.PreScheduleStream;
import webcast.api.creator.StreamResolution;

/* renamed from: X.Bcr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29185Bcr extends AbstractC029409q<C29187Bct> {
    public final PreScheduleStream LJLIL;
    public final DataChannel LJLILLLLZI;
    public int LJLJI;
    public final List<StreamResolution> LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJI.size();
    }

    public C29185Bcr(Fragment fragment, PreScheduleStream preScheduleStream) {
        int i;
        int i2;
        OSZ osz;
        OSZ osz2;
        Integer num;
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = preScheduleStream;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(fragment);
        this.LJLILLLLZI = LJIILIIL;
        this.LJLJI = -1;
        this.LJLJJI = preScheduleStream.streamResolutionList;
        if (LJIILIIL != null && (osz2 = (OSZ) LJIILIIL.kv0(PreScheduleResultChannel.class)) != null && (num = (Integer) osz2.getFirst()) != null) {
            i = num.intValue();
        } else {
            i = preScheduleStream.recommendStreamResolution;
        }
        this.LJLJJL = i;
        if (LJIILIIL != null && (osz = (OSZ) LJIILIIL.kv0(PreScheduleResultChannel.class)) != null) {
            i2 = ((Number) osz.getSecond()).intValue();
        } else {
            i2 = 0;
        }
        this.LJLJJLL = i2;
        if (LJIILIIL != null) {
            LJIILIIL.lv0(fragment, PreScheduleResultChannel.class, new AqS171S0100000_5(this, 822));
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C29187Bct c29187Bct, int i) {
        boolean z;
        int i2;
        Integer num;
        C29187Bct holder = c29187Bct;
        o.LJIIIZ(holder, "holder");
        StreamResolution streamResolution = (StreamResolution) ListProtector.get(holder.LJLIL.LJLJJI, i);
        int i3 = streamResolution.streamResolution;
        ((TextView) holder.itemView.findViewById(R.id.ije)).setText(streamResolution.resolutionText);
        ((TextView) holder.itemView.findViewById(R.id.ija)).setText(streamResolution.resolutionDescribe);
        View findViewById = holder.itemView.findViewById(R.id.ksh);
        boolean z2 = true;
        if (holder.LJLIL.LJLJJL == i3) {
            z = true;
        } else {
            z = false;
        }
        C29306Beo.LJJLIIIJJI(findViewById, z);
        CompoundButton compoundButton = (CompoundButton) holder.itemView.findViewById(R.id.ijc);
        DataChannel dataChannel = holder.LJLIL.LJLILLLLZI;
        if (dataChannel != null && (num = (Integer) dataChannel.kv0(SelectedStreamResolutionChannel.class)) != null) {
            i2 = num.intValue();
        } else {
            i2 = holder.LJLIL.LJLJJL;
        }
        if (i2 != i3) {
            z2 = false;
        }
        compoundButton.setChecked(z2);
        C16880lQ.LJIIJ(new ViewOnClickListenerC29186Bcs(holder, holder.LJLIL, i, i3, streamResolution), holder.itemView);
    }

    @Override // X.AbstractC029409q
    public final C29187Bct onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C29187Bct c29187Bct = new C29187Bct(this, C29306Beo.LJIIIIZZ(R.layout.ddm, parent, false));
        C0AX.LIZ(parent, c29187Bct.itemView, R.id.lj7);
        View view = c29187Bct.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c29187Bct.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C29187Bct.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c29187Bct.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c29187Bct.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C29187Bct.class.getName();
        return c29187Bct;
    }
}
