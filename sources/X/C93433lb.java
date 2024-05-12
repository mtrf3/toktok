package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C93433lb extends AbstractC93453ld implements SectionIndexer {
    public SectionIndexer LJLLJ;
    public final C93533ll LJLLL = new C93533ll();

    @Override // X.AbstractC93453ld, X.AbstractC029409q
    public final int getItemCount() {
        List<IMContact> list = this.LJLJI;
        if (list == null) {
            return 0;
        }
        return ((ArrayList) list).size();
    }

    @Override // android.widget.SectionIndexer
    public final Object[] getSections() {
        SectionIndexer sectionIndexer = this.LJLLJ;
        if (sectionIndexer != null) {
            return sectionIndexer.getSections();
        }
        return new String[]{" "};
    }

    @Override // X.AbstractC93453ld
    public final String LJLLLLLL(IMContact iMContact) {
        IMUser LIZ = C81573Ib.LIZ(iMContact);
        if (LIZ != null) {
            if (!TextUtils.isEmpty(LIZ.getRemarkName()) && !TextUtils.isEmpty(LIZ.getNickName())) {
                return EF7.LIZIZ().getString(R.string.h7l, LIZ.getNickName());
            }
            return LIZ.getSignature();
        }
        return null;
    }

    public final C93533ll LLFFF(int i) {
        C93533ll c93533ll = this.LJLLL;
        if (c93533ll.LIZ == i) {
            return c93533ll;
        }
        c93533ll.LIZ = i;
        int sectionForPosition = getSectionForPosition(i);
        if (sectionForPosition != -1 && getPositionForSection(sectionForPosition) == i) {
            this.LJLLL.getClass();
            this.LJLLL.LIZIZ = (String) getSections()[sectionForPosition];
        } else {
            this.LJLLL.getClass();
            this.LJLLL.LIZIZ = null;
        }
        C93533ll c93533ll2 = this.LJLLL;
        getPositionForSection(sectionForPosition + 1);
        c93533ll2.getClass();
        return this.LJLLL;
    }

    @Override // X.AbstractC93453ld, X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i < 0) {
            return 1;
        }
        return super.getItemViewType(i);
    }

    @Override // android.widget.SectionIndexer
    public final int getPositionForSection(int i) {
        SectionIndexer sectionIndexer = this.LJLLJ;
        if (sectionIndexer != null) {
            return sectionIndexer.getPositionForSection(i);
        }
        return -1;
    }

    @Override // android.widget.SectionIndexer
    public final int getSectionForPosition(int i) {
        SectionIndexer sectionIndexer = this.LJLLJ;
        if (sectionIndexer != null) {
            return sectionIndexer.getSectionForPosition(i);
        }
        return -1;
    }

    @Override // X.AbstractC93453ld
    /* renamed from: LJZI */
    public final void onBindViewHolder(C93423la c93423la, int i) {
        if (i < 0) {
            return;
        }
        c93423la.L(i, (IMContact) ListProtector.get(this.LJLJI, i));
    }

    @Override // X.AbstractC93453ld
    public C93423la LJZL(int i, ViewGroup viewGroup) {
        return new C93423la(this) { // from class: X.3lj
            {
                super(this, null);
            }
        };
    }

    @Override // X.AbstractC93453ld, X.AbstractC029409q
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C93423la c93423la, int i) {
        onBindViewHolder(c93423la, i);
    }

    @Override // X.AbstractC93453ld, X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public C93423la com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        C93423la LJZL = LJZL(i, viewGroup);
        C0AX.LIZ(viewGroup, LJZL.itemView, R.id.lj7);
        View view = LJZL.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (LJZL.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LJZL.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) LJZL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(LJZL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LJZL.getClass().getName();
        return LJZL;
    }
}
