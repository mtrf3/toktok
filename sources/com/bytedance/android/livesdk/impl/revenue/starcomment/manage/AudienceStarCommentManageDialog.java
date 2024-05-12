package com.bytedance.android.livesdk.impl.revenue.starcomment.manage;

import X.AbstractC029409q;
import X.B83;
import X.BQO;
import X.C15380j0;
import X.C15650jR;
import X.C16880lQ;
import X.C29374Bfu;
import X.C31415CUp;
import X.C78720Uuy;
import X.CVC;
import Y.ACListenerS31S0300000_5;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AudienceStarCommentManageDialog extends StarCommentManageDialog {
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public int LJLJJI = -1;
    public String LJLJJL = "";
    public int LJLJJLL = -1;

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog, com.bytedance.android.livesdk.impl.revenue.starcomment.manage.DarkDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog, com.bytedance.android.livesdk.impl.revenue.starcomment.manage.DarkDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
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

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog
    public final void vl(boolean z) {
        AbstractC029409q adapter = ((RecyclerView) _$_findCachedViewById(R.id.isn)).getAdapter();
        if (adapter instanceof C31415CUp) {
            C31415CUp c31415CUp = (C31415CUp) adapter;
            List<?> list = c31415CUp.LJLIL;
            ArrayList LIZIZ = s1.LIZIZ(list, "adapter.items");
            for (Object obj : list) {
                if ((obj instanceof CVC) && ((CVC) obj).LJLILLLLZI.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                    LIZIZ.add(obj);
                }
            }
            if (!z && LIZIZ.size() < this.LJLJJLL) {
                dismiss();
            }
            this.LJLJJLL = LIZIZ.size();
            if (LIZIZ.isEmpty()) {
                ((TextView) _$_findCachedViewById(R.id.jn7)).setText("-");
                ((TextView) _$_findCachedViewById(R.id.jn8)).setText("");
                _$_findCachedViewById(R.id.ec3).setVisibility(8);
                dismiss();
                return;
            }
            if (LIZIZ.size() == 1) {
                Object obj2 = ListProtector.get(LIZIZ, 0);
                o.LJII(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdk.revenue.StarCommentData");
                CVC cvc = (CVC) obj2;
                ((TextView) _$_findCachedViewById(R.id.jn7)).setText(String.valueOf(cvc.LJLLL));
                ((TextView) _$_findCachedViewById(R.id.jn8)).setText(C15380j0.LJIILL(R.string.o4o, Long.valueOf(cvc.LIZ())));
                _$_findCachedViewById(R.id.ec3).setVisibility(8);
                this.LJLJJI = 0;
                this.LJLJJL = cvc.LJLIL;
                if (!z) {
                    return;
                }
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isn);
                List<?> list2 = c31415CUp.LJLIL;
                o.LJIIIIZZ(list2, "adapter.items");
                recyclerView.LJLI(list2.indexOf(cvc));
                return;
            }
            _$_findCachedViewById(R.id.ec3).setVisibility(0);
            Iterator it = LIZIZ.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof CVC) && o.LJ(((CVC) next).LJLIL, this.LJLJJL)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            this.LJLJJI = i;
            if (i < 0) {
                this.LJLJJI = 0;
            }
            Object obj3 = ListProtector.get(LIZIZ, this.LJLJJI);
            if (!(obj3 instanceof CVC)) {
                return;
            }
            CVC cvc2 = (CVC) obj3;
            ((TextView) _$_findCachedViewById(R.id.jn8)).setText(C15380j0.LJIILL(R.string.o59, Integer.valueOf(this.LJLJJI + 1), Integer.valueOf(LIZIZ.size()), Long.valueOf(cvc2.LIZ())));
            ((TextView) _$_findCachedViewById(R.id.jn7)).setText(String.valueOf(cvc2.LJLLL));
            cvc2.LJLLLL = true;
            if (z) {
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.isn);
                List<?> list3 = c31415CUp.LJLIL;
                o.LJIIIIZZ(list3, "adapter.items");
                recyclerView2.LJLI(list3.indexOf(obj3));
            }
            C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.ec3), new ACListenerS31S0300000_5(adapter, LIZIZ, this, 18));
        }
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<String> list;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((ImageView) _$_findCachedViewById(R.id.jqo)).setVisibility(4);
        _$_findCachedViewById(R.id.ie5).setVisibility(8);
        BQO LIZ = C15650jR.LIZ();
        ImageModel avatarThumb = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb();
        if (avatarThumb != null) {
            list = avatarThumb.getUrls();
        } else {
            list = null;
        }
        C78720Uuy LIZ2 = LIZ.LIZ(list);
        LIZ2.LJIIL = Boolean.TRUE;
        LIZ2.LIZLLL(ImageView.ScaleType.CENTER_CROP);
        int width = _$_findCachedViewById(R.id.jmz).getWidth();
        int height = _$_findCachedViewById(R.id.jmz).getHeight();
        LIZ2.LJ = width;
        LIZ2.LJFF = height;
        LIZ2.LJIIIIZZ = R.drawable.d65;
        LIZ2.LJIIJJI(_$_findCachedViewById(R.id.jmz));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, LiveEndEvent.class, new AqS171S0100000_5(this, 397));
        }
    }
}
