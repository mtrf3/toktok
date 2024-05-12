package com.bytedance.android.livesdk.rank.impl.view;

import X.B9K;
import X.BCW;
import X.BJM;
import X.BZI;
import X.C0OW;
import X.C15380j0;
import X.C16880lQ;
import X.C28348BAq;
import X.C28349BAr;
import X.C28351BAt;
import X.C28507BGt;
import X.C28509BGv;
import X.C28787BRn;
import X.C29306Beo;
import X.C2A7;
import X.C32207CkV;
import X.C47121t6;
import X.CCJ;
import X.UCH;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class AudienceListGiftGuideDialog extends LiveDialogFragment {
    public ImageView LJLIL;
    public C47121t6 LJLILLLLZI;
    public C47121t6 LJLJI;
    public C2A7 LJLJJI;
    public View LJLJJL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public int LJLJJLL = -1;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        Boolean bool;
        int i;
        int i2;
        int i3;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(BCW.class);
        } else {
            bool = null;
        }
        boolean LJJ = C29306Beo.LJJ(bool);
        C28507BGt c28507BGt = new C28507BGt(R.layout.cvt);
        if (LJJ) {
            i = R.style.aai;
        } else if (CCJ.LIZ(getContext())) {
            i = R.style.aam;
        } else {
            i = R.style.aan;
        }
        c28507BGt.LIZJ = i;
        if (LJJ) {
            i2 = 80;
        } else if (CCJ.LIZ(getContext())) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        c28507BGt.LJII = i2;
        c28507BGt.LJI = 0.0f;
        int LIZJ = B9K.LIZJ(getContext());
        if (LJJ) {
            i3 = -1;
        } else {
            i3 = LIZJ;
        }
        c28507BGt.LJIIIZ = i3;
        if (LJJ) {
            LIZJ = -1;
        }
        c28507BGt.LJIIJ = LIZJ;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        String str;
        Room room;
        LiveMode streamType;
        Room room2;
        Room room3;
        Resources resources;
        Drawable drawable;
        ImageView imageView;
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (ImageView) view.findViewById(R.id.eya);
        Context context = getContext();
        C32207CkV c32207CkV = null;
        if (context != null && (imageView = this.LJLIL) != null) {
            Resources resources2 = context.getResources();
            if (this.LJLJJLL + 1 != 1) {
                i = R.drawable.d1f;
            } else {
                i = R.drawable.d1e;
            }
            imageView.setImageDrawable(C0OW.LIZ(resources2, i, null));
        }
        this.LJLILLLLZI = (C47121t6) view.findViewById(R.id.lzv);
        this.LJLJI = (C47121t6) view.findViewById(R.id.lzu);
        C47121t6 c47121t6 = this.LJLILLLLZI;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIILJJIL(R.string.ooe));
        }
        C47121t6 c47121t62 = this.LJLJI;
        if (c47121t62 != null) {
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.kd9);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_badeg_modal_descNew)");
            String LLLZ = C16880lQ.LLLZ(LJIILJJIL, Arrays.copyOf(new Object[]{String.valueOf(this.LJLJJLL + 1)}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            c47121t62.setText(LLLZ);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context2 = getContext();
        if (context2 != null && (resources = context2.getResources()) != null && (drawable = resources.getDrawable(R.drawable.d1g)) != null) {
            drawable.setBounds(0, 0, C15380j0.LIZ(16.0f), C15380j0.LIZ(16.0f));
            c32207CkV = new C32207CkV(drawable);
        }
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.kd9);
        o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_badeg_modal_descNew)");
        String LLLZ2 = C16880lQ.LLLZ(LJIILJJIL2, Arrays.copyOf(new Object[]{String.valueOf(this.LJLJJLL + 1)}, 1));
        o.LJIIIIZZ(LLLZ2, "format(format, *args)");
        spannableStringBuilder.append((CharSequence) LLLZ2);
        int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, "{0:image}", 0, false, 6);
        spannableStringBuilder.setSpan(c32207CkV, LJJLIIIJL, LJJLIIIJL + 9, 33);
        C47121t6 c47121t63 = this.LJLJI;
        if (c47121t63 != null) {
            c47121t63.setText(spannableStringBuilder);
        }
        C2A7 c2a7 = (C2A7) view.findViewById(R.id.az2);
        this.LJLJJI = c2a7;
        if (c2a7 != null) {
            c2a7.setText(C15380j0.LJIILJJIL(R.string.kd7));
        }
        C2A7 c2a72 = this.LJLJJI;
        if (c2a72 != null) {
            C16880lQ.LJJIII(c2a72, new C28351BAt(this));
        }
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.e95);
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new C28348BAq(this));
        }
        View findViewById = view.findViewById(R.id.liz);
        this.LJLJJL = findViewById;
        if (findViewById != null) {
            C16880lQ.LJIIJ(new C28349BAr(this), findViewById);
        }
        DataChannel dataChannel = this.dataChannel;
        int i2 = this.LJLJJLL;
        BZI LIZ = C28787BRn.LIZ("livesdk_top2_empty_slot_page_show");
        LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
        LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        long j2 = 0;
        if (dataChannel != null && (room3 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room3.getOwnerUserId();
        } else {
            j = 0;
        }
        LIZ.LJIJJ(Long.valueOf(j), "anchor_id");
        if (dataChannel != null && (room2 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j2 = room2.getId();
        }
        LIZ.LJIJJ(Long.valueOf(j2), "room_id");
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null) {
            str = C28509BGv.LIZ(streamType);
        } else {
            str = "";
        }
        LIZ.LJIJJ(str, "live_type");
        LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
        if (C29306Beo.LJIIJ(dataChannel)) {
            LIZ.LJIJJ("null", "user_rank");
        } else {
            LIZ.LJIJJ(Long.valueOf(UCH.LJ()), "user_rank");
        }
        LIZ.LJIJJ(Integer.valueOf(i2 + 1), "slot_rank");
        LIZ.LJJIIJZLJL();
    }
}
