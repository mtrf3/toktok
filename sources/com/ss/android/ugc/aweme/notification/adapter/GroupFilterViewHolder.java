package com.ss.android.ugc.aweme.notification.adapter;

import X.C04270Et;
import X.C06490Nh;
import X.C16880lQ;
import X.C221108m2;
import X.C53405Kxd;
import X.C56702MNe;
import X.C56732MOi;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78765Uvh;
import X.C7FA;
import X.SHA;
import Y.AObserverS77S0100000_9;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class GroupFilterViewHolder extends PowerCell<C56732MOi> implements View.OnClickListener {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 361));
    public View LJLILLLLZI;
    public TuxIconView LJLJI;
    public SHA LJLJJI;
    public TextView LJLJJL;
    public TuxIconView LJLJJLL;
    public ImageView LJLJL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C56732MOi c56732MOi) {
        Integer valueOf;
        LiveData liveData;
        C56732MOi t = c56732MOi;
        o.LJIIIZ(t, "t");
        FilterViewModel filterViewModel = (FilterViewModel) this.LJLIL.getValue();
        if (filterViewModel == null || (liveData = (LiveData) filterViewModel.LJLIL.getValue()) == null || (valueOf = (Integer) liveData.getValue()) == null) {
            valueOf = Integer.valueOf(C56702MNe.LIZ);
        }
        int intValue = valueOf.intValue();
        NoticeChannelInfo noticeChannelInfo = t.LJLJLJ;
        if (noticeChannelInfo != null) {
            M(noticeChannelInfo, intValue);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        L(intValue, t);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FilterViewModel filterViewModel;
        C56732MOi item = getItem();
        if (item != null) {
            int i = item.LJLIL;
            FilterViewModel filterViewModel2 = (FilterViewModel) this.LJLIL.getValue();
            if (filterViewModel2 != null) {
                ((LiveData) filterViewModel2.LJLIL.getValue()).postValue(Integer.valueOf(i));
            }
        }
        C56732MOi item2 = getItem();
        if (item2 != null && (filterViewModel = (FilterViewModel) this.LJLIL.getValue()) != null) {
            ((LiveData) filterViewModel.LJLILLLLZI.getValue()).postValue(item2);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        FilterViewModel filterViewModel;
        LiveData liveData;
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.t9, viewGroup, false);
        View findViewById = LIZIZ.findViewById(R.id.bdd);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.cl_notification_root)");
        this.LJLILLLLZI = findViewById;
        View findViewById2 = LIZIZ.findViewById(R.id.e9w);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.ic_notification_group)");
        this.LJLJI = (TuxIconView) findViewById2;
        this.LJLJJI = (SHA) LIZIZ.findViewById(R.id.f7x);
        View findViewById3 = LIZIZ.findViewById(R.id.mcf);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.tv_notification_group)");
        this.LJLJJL = (TextView) findViewById3;
        View findViewById4 = LIZIZ.findViewById(R.id.e9x);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.ic_notification_selector)");
        this.LJLJJLL = (TuxIconView) findViewById4;
        View findViewById5 = LIZIZ.findViewById(R.id.f7y);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.iv_notification_red_dot)");
        this.LJLJL = (ImageView) findViewById5;
        if (Build.VERSION.SDK_INT >= 23) {
            View view = this.LJLILLLLZI;
            if (view != null) {
                view.setForeground(C04270Et.LIZIZ(view.getContext(), R.drawable.zb));
            } else {
                o.LJIJI("mVRoot");
                throw null;
            }
        } else {
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                C7FA.LIZIZ(view2);
            } else {
                o.LJIJI("mVRoot");
                throw null;
            }
        }
        C16880lQ.LJIIJ(this, LIZIZ);
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if (currentLifecycleOwner != null && (filterViewModel = (FilterViewModel) this.LJLIL.getValue()) != null && (liveData = (LiveData) filterViewModel.LJLIL.getValue()) != null) {
            liveData.observe(currentLifecycleOwner, new AObserverS77S0100000_9(this, 33));
        }
        return LIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ae, code lost:
    
        if (r0 > 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(int r8, X.C56732MOi r9) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.GroupFilterViewHolder.L(int, X.MOi):void");
    }

    public final void M(NoticeChannelInfo noticeChannelInfo, int i) {
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(4);
            SHA sha = this.LJLJJI;
            if (sha != null) {
                sha.setVisibility(0);
                C78765Uvh.LJFF(sha, noticeChannelInfo.logo);
            }
            TextView textView = this.LJLJJL;
            if (textView != null) {
                textView.setText(noticeChannelInfo.name);
                if (noticeChannelInfo.group == i) {
                    TuxIconView tuxIconView2 = this.LJLJJLL;
                    if (tuxIconView2 != null) {
                        tuxIconView2.setVisibility(0);
                        ImageView imageView = this.LJLJL;
                        if (imageView != null) {
                            imageView.setVisibility(8);
                            return;
                        } else {
                            o.LJIJI("mIvDot");
                            throw null;
                        }
                    }
                    o.LJIJI("mIvSelectIcon");
                    throw null;
                }
                TuxIconView tuxIconView3 = this.LJLJJLL;
                if (tuxIconView3 != null) {
                    tuxIconView3.setVisibility(8);
                    boolean z = !noticeChannelInfo.hasRead;
                    if (C53405Kxd.LIZLLL() || !z) {
                        ImageView imageView2 = this.LJLJL;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                            return;
                        } else {
                            o.LJIJI("mIvDot");
                            throw null;
                        }
                    }
                    ImageView imageView3 = this.LJLJL;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                        return;
                    } else {
                        o.LJIJI("mIvDot");
                        throw null;
                    }
                }
                o.LJIJI("mIvSelectIcon");
                throw null;
            }
            o.LJIJI("mTvGroupFilter");
            throw null;
        }
        o.LJIJI("mIvGroupFilter");
        throw null;
    }
}
