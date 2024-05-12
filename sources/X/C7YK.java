package X;

import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7YK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YK extends LinearLayout {
    public LinearLayout LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public SmartAvatarImageView LJLJJI;
    public FrameLayout LJLJJL;
    public C57446Mgc LJLJJLL;
    public TuxIconView LJLJL;
    public ImageView LJLJLJ;
    public Music LJLJLLL;
    public boolean LJLL;

    public final String getMusicOwnerDisplayName() {
        CharSequence text;
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null && (text = tuxTextView.getText()) != null) {
            return text.toString();
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7YK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bv6, C16880lQ.LLZIL(context), this);
        if ((LLLZIIL instanceof LinearLayout) && LLLZIIL != null) {
            this.LJLIL = (LinearLayout) LLLZIIL.findViewById(R.id.gs1);
            this.LJLILLLLZI = (TuxTextView) LLLZIIL.findViewById(R.id.gs3);
            this.LJLJI = (TuxTextView) LLLZIIL.findViewById(R.id.gs2);
            this.LJLJJI = (SmartAvatarImageView) LLLZIIL.findViewById(R.id.grs);
            this.LJLJJL = (FrameLayout) LLLZIIL.findViewById(R.id.grt);
            this.LJLJJLL = (C57446Mgc) LLLZIIL.findViewById(R.id.grz);
            this.LJLJL = (TuxIconView) LLLZIIL.findViewById(R.id.gs0);
            this.LJLJLJ = (ImageView) LLLZIIL.findViewById(R.id.gtd);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        measureChild(childAt, i, i2);
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.min(childAt.getMeasuredWidth(), KL2.LJIIJJI(getContext()) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(168))), LiveLayoutPreloadThreadPriority.DEFAULT), childAt.getMeasuredHeight());
        super.onMeasure(i, i2);
    }

    public final void LIZ(List<MusicOwnerInfo> list, FragmentManager fragmentManager, Music music) {
        String str;
        Resources resources;
        String string;
        ImageView imageView;
        Integer followStatus;
        int i;
        int i2;
        Integer followStatus2;
        ImageView imageView2;
        this.LJLJLLL = music;
        if (((ArrayList) list).isEmpty() || fragmentManager == null) {
            setVisibility(8);
            return;
        }
        MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) ORZ.LJLLLLLL(0, list);
        if (musicOwnerInfo == null) {
            FrameLayout frameLayout = this.LJLJJL;
            if (frameLayout != null) {
                C79146V4k.LJJIJLIJ(frameLayout);
            }
        } else {
            FrameLayout frameLayout2 = this.LJLJJL;
            if (frameLayout2 != null) {
                C79146V4k.LJJLIIIJLJLI(frameLayout2);
            }
            SmartAvatarImageView smartAvatarImageView = this.LJLJJI;
            if (smartAvatarImageView != null) {
                W5F LJII = W5U.LJII(C78939UyV.LJ(musicOwnerInfo.getAvatar()));
                LJII.LJJIJIIJIL = true;
                LJII.LJJIIJ = smartAvatarImageView;
                C16880lQ.LLJJJ(LJII);
            }
        }
        C7YJ c7yj = new C7YJ(list, fragmentManager, music, this);
        LinearLayout linearLayout = this.LJLIL;
        if (linearLayout != null) {
            C78897Uxp.LJJJJLI(linearLayout, null);
        }
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() == 1) {
            MusicOwnerInfo musicOwnerInfo2 = (MusicOwnerInfo) ORZ.LJLLLLLL(0, list);
            if (musicOwnerInfo2 == null) {
                return;
            }
            TuxTextView tuxTextView = this.LJLILLLLZI;
            if (tuxTextView != null) {
                tuxTextView.setText(musicOwnerInfo2.getNickName());
            }
            TuxTextView tuxTextView2 = this.LJLJI;
            if (tuxTextView2 != null) {
                C79146V4k.LJJIJLIJ(tuxTextView2);
            }
            TuxIconView tuxIconView = this.LJLJL;
            if (tuxIconView != null) {
                C79146V4k.LJJIJLIJ(tuxIconView);
            }
            MusicOwnerInfo musicOwnerInfo3 = (MusicOwnerInfo) ORZ.LJLLLLLL(0, list);
            if (musicOwnerInfo3 != null && musicOwnerInfo3.getVerified() && (imageView2 = this.LJLJLJ) != null) {
                C79146V4k.LJJLIIIJLJLI(imageView2);
            }
            if (!C78939UyV.LJJJJLL(musicOwnerInfo2) || (((followStatus = musicOwnerInfo2.getFollowStatus()) == null || followStatus.intValue() != 0) && (((followStatus2 = musicOwnerInfo2.getFollowStatus()) == null || followStatus2.intValue() != 4) && !this.LJLL))) {
                C57446Mgc c57446Mgc = this.LJLJJLL;
                if (c57446Mgc != null) {
                    C79146V4k.LJJIJLIJ(c57446Mgc);
                }
            } else {
                this.LJLL = true;
                C57446Mgc c57446Mgc2 = this.LJLJJLL;
                if (c57446Mgc2 != null) {
                    C79146V4k.LJJLIIIJLJLI(c57446Mgc2);
                }
                Integer followStatus3 = musicOwnerInfo2.getFollowStatus();
                if (followStatus3 == null || followStatus3.intValue() != 1) {
                    C57446Mgc c57446Mgc3 = this.LJLJJLL;
                    if (c57446Mgc3 != null) {
                        C78897Uxp.LJJJJLI(c57446Mgc3, null);
                    }
                } else {
                    C57446Mgc c57446Mgc4 = this.LJLJJLL;
                    if (c57446Mgc4 != null) {
                        c57446Mgc4.setOnTouchListener(null);
                    }
                }
                C57446Mgc c57446Mgc5 = this.LJLJJLL;
                if (c57446Mgc5 != null) {
                    c57446Mgc5.setDataChangeListener(new AqS134S0200000_3(this, musicOwnerInfo2, 167));
                }
                User user = new User();
                user.setUid(musicOwnerInfo2.getUid());
                user.setSecUid(musicOwnerInfo2.getSecUid());
                user.setNickname(musicOwnerInfo2.getNickName());
                Integer followStatus4 = musicOwnerInfo2.getFollowStatus();
                if (followStatus4 != null) {
                    i = followStatus4.intValue();
                } else {
                    i = 0;
                }
                user.setFollowStatus(i);
                Integer followerStatus = musicOwnerInfo2.getFollowerStatus();
                if (followerStatus != null) {
                    i2 = followerStatus.intValue();
                } else {
                    i2 = 0;
                }
                user.setFollowerStatus(i2);
                user.setPrivateAccount(musicOwnerInfo2.isPrivateAccount());
                C57446Mgc c57446Mgc6 = this.LJLJJLL;
                if (c57446Mgc6 != null) {
                    C7YW c7yw = new C7YW();
                    c7yw.LIZ = user;
                    c7yw.LIZIZ(EnumC57119MbL.NORMAL);
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    c7yw.LJFF = C57434MgQ.LIZIZ(context);
                    c7yw.LIZLLL = C113554cx.LJJL(new OSZ(Boolean.FALSE, 52), new OSZ(Boolean.TRUE, 52));
                    c57446Mgc6.LJLILLLLZI.LJJJJJL(c7yw.LIZ());
                }
                C57446Mgc c57446Mgc7 = this.LJLJJLL;
                if (c57446Mgc7 != null) {
                    c57446Mgc7.setTracker(new AqS153S0100000_3(this, 1224));
                }
            }
            LinearLayout linearLayout2 = this.LJLIL;
            if (linearLayout2 != null) {
                C16880lQ.LJIIZILJ(linearLayout2, new ACListenerS23S0100000_3(c7yj, 180));
                return;
            }
            return;
        }
        TuxTextView tuxTextView3 = this.LJLILLLLZI;
        String str2 = "";
        if (tuxTextView3 != null) {
            MusicOwnerInfo musicOwnerInfo4 = (MusicOwnerInfo) ORZ.LJLLLLLL(0, list);
            if (musicOwnerInfo4 == null || (str = musicOwnerInfo4.getNickName()) == null) {
                str = "";
            }
            tuxTextView3.setText(str);
        }
        TuxTextView tuxTextView4 = this.LJLJI;
        if (tuxTextView4 != null) {
            C79146V4k.LJJLIIIJLJLI(tuxTextView4);
        }
        MusicOwnerInfo musicOwnerInfo5 = (MusicOwnerInfo) ORZ.LJLLLLLL(0, list);
        if (musicOwnerInfo5 != null && musicOwnerInfo5.getVerified() && (imageView = this.LJLJLJ) != null) {
            C79146V4k.LJJLIIIJLJLI(imageView);
        }
        TuxTextView tuxTextView5 = this.LJLJI;
        if (tuxTextView5 != null) {
            Context context2 = getContext();
            if (context2 != null && (resources = context2.getResources()) != null && (string = resources.getString(R.string.iic, Integer.valueOf(arrayList.size() - 1))) != null) {
                str2 = string;
            }
            tuxTextView5.setText(str2);
        }
        TuxIconView tuxIconView2 = this.LJLJL;
        if (tuxIconView2 != null) {
            C79146V4k.LJJLIIIJLJLI(tuxIconView2);
        }
        C57446Mgc c57446Mgc8 = this.LJLJJLL;
        if (c57446Mgc8 != null) {
            C79146V4k.LJJIJLIJ(c57446Mgc8);
        }
        LinearLayout linearLayout3 = this.LJLIL;
        if (linearLayout3 != null) {
            C16880lQ.LJIIZILJ(linearLayout3, new ACListenerS23S0100000_3(c7yj, 180));
        }
    }
}
