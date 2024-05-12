package X;

import Y.ACListenerS24S0101000_5;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B9U extends AbstractC029409q<B9V> {
    public List<Room> LJLIL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<Room> list = this.LJLIL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(B9V b9v, int i) {
        Room room;
        ViewGroup.LayoutParams layoutParams;
        ImageModel imageModel;
        String str;
        boolean z;
        User user;
        long j;
        Long l;
        View findViewById;
        TextView textView;
        String str2;
        OfficialChannelInfo officialChannelInfo;
        OfficialChannelInfo officialChannelInfo2;
        TextView textView2;
        User owner;
        FollowInfo followInfo;
        List<String> list;
        B9V holder = b9v;
        o.LJIIIZ(holder, "holder");
        List<Room> list2 = holder.LJLIL.LJLIL;
        User user2 = null;
        if (list2 != null) {
            room = (Room) ListProtector.get(list2, i);
        } else {
            room = null;
        }
        View view = holder.itemView;
        if ((view instanceof ViewGroup) && view != null) {
            layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C15380j0.LIZ(171.0f);
            }
        } else {
            layoutParams = null;
        }
        View view2 = holder.itemView;
        if ((view2 instanceof ViewGroup) && view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
        ImageView imageView = (ImageView) holder.itemView.findViewById(R.id.j6t);
        if (imageView != null) {
            B9U b9u = holder.LJLIL;
            if (room != null) {
                imageModel = room.getCover();
                if (room.getSquareCoverImg() != null) {
                    ImageModel squareCoverImg = room.getSquareCoverImg();
                    if (squareCoverImg != null) {
                        list = squareCoverImg.getUrls();
                    } else {
                        list = null;
                    }
                    if (!C32151Nz.LJJIIJZLJL(list)) {
                        imageModel = room.getSquareCoverImg();
                    }
                }
                if (imageModel == null && room != null && room.getOwner() != null) {
                    imageModel = room.getOwner().getAvatarMedium();
                }
            } else {
                imageModel = null;
            }
            C15640jQ.LJII(imageView, imageModel, R.drawable.cd7, 2);
            TextView textView3 = (TextView) holder.itemView.findViewById(R.id.j70);
            if (room != null) {
                str = room.getTitle();
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(str);
            }
            TextView textView4 = (TextView) holder.itemView.findViewById(R.id.a2v);
            if (room != null) {
                user = room.getOwner();
            } else {
                user = null;
            }
            String user3 = C05170If.LIZ(user);
            o.LJIIIIZZ(user3, "user");
            if (user3.length() == 0) {
                textView4.setVisibility(8);
            } else {
                textView4.setText(user3);
            }
            TextView textView5 = (TextView) holder.itemView.findViewById(R.id.j6s);
            if (room != null) {
                j = room.getUserCount();
            } else {
                j = 0;
            }
            textView5.setText(C28329B9x.LIZ(j));
            C16880lQ.LJIIJ(new ACListenerS24S0101000_5(i, b9u, 18), holder.itemView);
            if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                l = Long.valueOf(followInfo.getFollowStatus());
            } else {
                l = null;
            }
            if (l != null && (l.longValue() == 1 || l.longValue() == 2)) {
                View findViewById2 = holder.itemView.findViewById(R.id.dlg);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                }
                if (C15380j0.LJIIZILJ() && (findViewById = holder.itemView.findViewById(R.id.dlg)) != null) {
                    findViewById.setBackgroundResource(R.drawable.ch8);
                }
                if (C15380j0.LJIIZILJ()) {
                    View findViewById3 = holder.itemView.findViewById(R.id.fx9);
                    if (findViewById3 != null) {
                        findViewById3.setBackgroundResource(R.drawable.che);
                    }
                } else {
                    View findViewById4 = holder.itemView.findViewById(R.id.fx9);
                    if (findViewById4 != null) {
                        findViewById4.setBackgroundResource(R.drawable.chd);
                    }
                }
            }
            IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
            if (iMicRoomService != null && iMicRoomService.jT(room)) {
                if (l == null || (l.longValue() != 1 && l.longValue() != 2)) {
                    View findViewById5 = holder.itemView.findViewById(R.id.fx9);
                    if ((findViewById5 instanceof TextView) && (textView2 = (TextView) findViewById5) != null) {
                        textView2.setText(R.string.mrq);
                    }
                } else {
                    View findViewById6 = holder.itemView.findViewById(R.id.fx9);
                    if ((findViewById6 instanceof TextView) && (textView = (TextView) findViewById6) != null) {
                        textView.setText(R.string.m8p);
                    }
                }
                if (room != null && (officialChannelInfo2 = room.officialChannelInfo) != null) {
                    str2 = officialChannelInfo2.channelName;
                } else {
                    str2 = null;
                }
                textView3.setText(str2);
                if (room != null && (officialChannelInfo = room.officialChannelInfo) != null) {
                    user2 = officialChannelInfo.channelUser;
                }
                textView4.setText(C05170If.LIZ(user2));
            }
            holder.itemView.setTag(room);
            if (room != null && !TextUtils.isEmpty(room.getMultiStreamData())) {
                HashMap LIZ = C45243HpH.LIZ("enter_from_merge", "live_end", "enter_method", "live_cover");
                String multiStreamData = room.getMultiStreamData();
                o.LJIIIIZZ(multiStreamData, "room.multiStreamData");
                LIZ.put("stream_info", multiStreamData);
                C39870Fko c39870Fko = C39870Fko.LIZJ;
                LiveCoreSDKData.Options options = room.getOptions();
                c39870Fko.getClass();
                String json = GsonProtectorUtils.toJson((Gson) C39870Fko.LIZIZ.getValue(), options);
                if (json != null) {
                    LIZ.put("options", json);
                }
                ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).F2(LIZ);
            }
        }
    }

    @Override // X.AbstractC029409q
    public final B9V onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        B9V b9v = new B9V(this, C29306Beo.LJIIIIZZ(R.layout.d9h, parent, false));
        C0AX.LIZ(parent, b9v.itemView, R.id.lj7);
        View view = b9v.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (b9v.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(B9V.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) b9v.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(b9v.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = B9V.class.getName();
        return b9v;
    }
}
