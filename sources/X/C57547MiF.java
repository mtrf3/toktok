package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MiF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57547MiF extends C8HS<UserWithAweme> implements InterfaceC57554MiM, InterfaceC57553MiL, InterfaceC57555MiN {
    public final GalleryLayoutManager LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public String LJLJI;
    public InterfaceC57556MiO<ViewOnClickListenerC57546MiE> LJLJJI;
    public InterfaceC57527Mhv LJLJJL;
    public int LJLJJLL;
    public int LJLJL;

    @Override // X.InterfaceC57555MiN
    public final void LJIIJ() {
        this.LJLILLLLZI.invoke();
    }

    @Override // X.InterfaceC57554MiM
    public final void LJLL(int i) {
        GalleryLayoutManager galleryLayoutManager = this.LJLIL;
        int i2 = i + 1;
        RecyclerView recyclerView = galleryLayoutManager.LLIIII;
        if (recyclerView != null && i2 >= 0) {
            galleryLayoutManager.LLIIII(recyclerView, null, i2);
        }
    }

    public final void LJLLLLLL(Context context) {
        o.LJIIIZ(context, "context");
        if (C53946LFe.LIZJ(context, null).LJFF) {
            double d = C53946LFe.LIZJ(context, null).LIZJ * 0.5d;
            this.LJLJL = (int) (d / 1.34f);
            this.LJLJJLL = (int) d;
        } else {
            int i = (int) (C53946LFe.LIZJ(context, null).LIZIZ * 0.712f);
            this.LJLJL = i;
            this.LJLJJLL = (int) (i * 1.34f);
        }
    }

    @Override // X.C8HS
    public final void addData(List<? extends UserWithAweme> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        List<T> list2 = this.mmItems;
        if (list2 != 0) {
            list2.addAll(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        this.mmItems = arrayList;
    }

    public C57547MiF(GalleryLayoutManager galleryLayoutManager, AqS159S0100000_9 aqS159S0100000_9) {
        super(false, 1, null);
        this.LJLIL = galleryLayoutManager;
        this.LJLILLLLZI = aqS159S0100000_9;
        this.LJLJI = "";
        this.LJLJJLL = -1;
        this.LJLJL = -1;
    }

    @Override // X.InterfaceC57553MiL
    public final void LJJZZI(User user, int i) {
        RecyclerView recyclerView;
        o.LJIIIZ(user, "user");
        GalleryLayoutManager galleryLayoutManager = this.LJLIL;
        int i2 = galleryLayoutManager.LJZL;
        if (i2 >= 0 && i2 == i && (recyclerView = galleryLayoutManager.LLIIII) != null && !recyclerView.LJJJLIIL()) {
            List<UserWithAweme> data = getData();
            if (data != null) {
                ListProtector.remove(data, this.LJLIL.LJZL);
            }
            notifyItemRemoved(this.LJLIL.LJZL);
        }
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        UserWithAweme userWithAweme;
        o.LJIIIZ(viewHolder, "viewHolder");
        ViewOnClickListenerC57546MiE viewOnClickListenerC57546MiE = (ViewOnClickListenerC57546MiE) viewHolder;
        InterfaceC57527Mhv interfaceC57527Mhv = this.LJLJJL;
        InterfaceC57556MiO<ViewOnClickListenerC57546MiE> interfaceC57556MiO = this.LJLJJI;
        List<T> list = this.mmItems;
        if (list == 0 || i < 0 || i >= list.size()) {
            userWithAweme = null;
        } else {
            userWithAweme = (UserWithAweme) ListProtector.get(list, i);
        }
        o.LJI(userWithAweme);
        String requestId = this.LJLJI;
        o.LJIIIZ(requestId, "requestId");
        viewOnClickListenerC57546MiE.LJZL = userWithAweme;
        viewOnClickListenerC57546MiE.LJLJL = interfaceC57527Mhv;
        viewOnClickListenerC57546MiE.LJLJLJ = interfaceC57556MiO;
        Video video = userWithAweme.getAweme().getVideo();
        viewOnClickListenerC57546MiE.LJZI = video;
        int i2 = viewOnClickListenerC57546MiE.LJLJJL;
        int i3 = viewOnClickListenerC57546MiE.LJLJJLL;
        if (video != null && video.getWidth() != 0 && video.getHeight() != 0) {
            i3 = O6R.LJJIIZ((i2 / video.getWidth()) * video.getHeight());
        }
        viewOnClickListenerC57546MiE.P().getLayoutParams().width = i2;
        viewOnClickListenerC57546MiE.P().getLayoutParams().height = i3;
        Object value = viewOnClickListenerC57546MiE.LJLLL.getValue();
        o.LJIIIIZZ(value, "<get-mSurface>(...)");
        ((View) value).getLayoutParams().width = i2;
        Object value2 = viewOnClickListenerC57546MiE.LJLLL.getValue();
        o.LJIIIIZZ(value2, "<get-mSurface>(...)");
        ((View) value2).getLayoutParams().height = i3;
        viewOnClickListenerC57546MiE.P().setVisibility(0);
        Video video2 = viewOnClickListenerC57546MiE.LJZI;
        if (video2 != null) {
            C78765Uvh.LJFF(viewOnClickListenerC57546MiE.P(), video2.getOriginCover());
        }
        viewOnClickListenerC57546MiE.U();
        View view = viewHolder.itemView;
        o.LJIIIIZZ(view, "viewHolder.itemView");
        if (C53322KwI.LIZ() && this.LJLJL != -1 && this.LJLJJLL != -1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                int i4 = this.LJLJL;
                if (i4 != layoutParams.width || this.LJLJJLL != layoutParams.height) {
                    layoutParams.width = i4;
                }
                layoutParams.height = this.LJLJJLL;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        View LIZ = C1DI.LIZ(viewGroup, "viewGroup", R.layout.dsu, viewGroup, false, "from(viewGroup.context)\n…d_card, viewGroup, false)");
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "viewGroup.context");
        if (C53322KwI.LIZ()) {
            if (this.LJLJL == -1 || this.LJLJJLL == -1) {
                LJLLLLLL(context);
            }
            ViewGroup.LayoutParams layoutParams = LIZ.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.LJLJL;
                layoutParams.height = this.LJLJJLL;
            } else {
                layoutParams = new RecyclerView.LayoutParams(this.LJLJL, this.LJLJJLL);
            }
            LIZ.setLayoutParams(layoutParams);
        }
        return new ViewOnClickListenerC57546MiE(LIZ, this, this, this, this.LJLIL);
    }
}
