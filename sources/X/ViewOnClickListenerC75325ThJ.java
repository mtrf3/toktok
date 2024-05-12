package X;

import Y.AObserverS81S0100000_13;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import au3.IDdS57S0100000_13;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ShowUserListDialog;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ThJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class ViewOnClickListenerC75325ThJ implements View.OnClickListener {
    public final Context LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public int LJLJI;
    public final AObserverS81S0100000_13 LJLJJI;
    public final AObserverS81S0100000_13 LJLJJL;
    public final AObserverS81S0100000_13 LJLJJLL;
    public final AObserverS81S0100000_13 LJLJL;
    public ViewGroup LJLJLJ;
    public C75378TiA LJLJLLL;
    public boolean LJLL;
    public AbstractC75323ThH LJLLI;
    public ViewGroup LJLLILLLL;

    public int LIZIZ() {
        return R.layout.dn5;
    }

    public int LIZJ() {
        return R.id.lsp;
    }

    public String LIZLLL() {
        return "anchor";
    }

    public void LJ() {
        C47061t0 c47061t0;
        ViewGroup viewGroup = this.LJLLILLLL;
        if (viewGroup != null) {
            C16880lQ.LJIIL(viewGroup, this);
        }
        ViewGroup viewGroup2 = this.LJLLILLLL;
        if (viewGroup2 != null && (c47061t0 = (C47061t0) viewGroup2.findViewById(R.id.hsi)) != null) {
            C16880lQ.LJJI(c47061t0, this);
        }
    }

    public final boolean LJFF() {
        MutableLiveData<C75330ThO> LJFF;
        C75330ThO value;
        AbstractC75323ThH abstractC75323ThH = this.LJLLI;
        if (abstractC75323ThH == null || (LJFF = abstractC75323ThH.LJFF()) == null || (value = LJFF.getValue()) == null || value.LJLIL != C79004UzY.LJIIIZ()) {
            return false;
        }
        return true;
    }

    public void LJII() {
        User LJIIJ;
        boolean z;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        Boolean bool;
        AbstractC75323ThH abstractC75323ThH = this.LJLLI;
        if (abstractC75323ThH == null || (LJIIJ = abstractC75323ThH.LJIIJ()) == null) {
            return;
        }
        AbstractC75323ThH abstractC75323ThH2 = this.LJLLI;
        if (abstractC75323ThH2 != null && (dataChannel2 = abstractC75323ThH2.LIZ) != null && (bool = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        C32004ChE c32004ChE = new C32004ChE(LJIIJ);
        c32004ChE.LIZIZ = "anchor_link_guest";
        c32004ChE.LJFF = C74947TbD.LJJI();
        if (z) {
            HashMap hashMap = new HashMap();
            AbstractC75323ThH abstractC75323ThH3 = this.LJLLI;
            if (abstractC75323ThH3 != null) {
                hashMap.put("link_id", abstractC75323ThH3.LIZIZ);
                String LJIIIIZZ = abstractC75323ThH3.LJIIIIZZ();
                if (LJIIIIZZ == null) {
                    LJIIIIZZ = "guest_apply_anchor";
                }
                hashMap.put("guest_invite_type", LJIIIIZZ);
            }
            c32004ChE.LJ = hashMap;
        } else {
            c32004ChE.LJI = C74934Tb0.LIZ();
        }
        AbstractC75323ThH abstractC75323ThH4 = this.LJLLI;
        if (abstractC75323ThH4 == null || (dataChannel = abstractC75323ThH4.LIZ) == null) {
            return;
        }
        dataChannel.qv0(SendGiftEvent.class, c32004ChE);
    }

    public void LJIIIIZZ() {
        DataChannel dataChannel;
        AbstractC75323ThH abstractC75323ThH = this.LJLLI;
        if (abstractC75323ThH != null && (dataChannel = abstractC75323ThH.LIZ) != null) {
            dataChannel.pv0(ShowUserListDialog.class);
        }
    }

    public void LJIIIZ() {
        C75378TiA c75378TiA;
        MutableLiveData<C75330ThO> LJFF;
        MutableLiveData<ImageModel> LJ;
        MutableLiveData<Integer> LJIIJJI;
        LiveData liveData;
        AbstractC75323ThH abstractC75323ThH = this.LJLLI;
        if (abstractC75323ThH != null && (liveData = (LiveData) abstractC75323ThH.LJIIIZ.getValue()) != null) {
            liveData.removeObserver(this.LJLJL);
        }
        AbstractC75323ThH abstractC75323ThH2 = this.LJLLI;
        if (abstractC75323ThH2 != null && (LJIIJJI = abstractC75323ThH2.LJIIJJI()) != null) {
            LJIIJJI.removeObserver(this.LJLJJLL);
        }
        AbstractC75323ThH abstractC75323ThH3 = this.LJLLI;
        if (abstractC75323ThH3 != null && (LJ = abstractC75323ThH3.LJ()) != null) {
            LJ.removeObserver(this.LJLJJL);
        }
        AbstractC75323ThH abstractC75323ThH4 = this.LJLLI;
        if (abstractC75323ThH4 != null && (LJFF = abstractC75323ThH4.LJFF()) != null) {
            LJFF.removeObserver(this.LJLJJI);
        }
        if (this.LJLL && (c75378TiA = this.LJLJLLL) != null) {
            c75378TiA.LIZJ = true;
        }
        this.LJLJLLL = null;
        this.LJLLI = null;
        ViewGroup viewGroup = this.LJLLILLLL;
        if (viewGroup != null) {
            TV3.LJIIJJI(viewGroup);
        }
    }

    public final void LJI(ImageModel imageModel) {
        C47061t0 c47061t0;
        View findViewById;
        if (imageModel == null) {
            return;
        }
        ViewGroup viewGroup = this.LJLLILLLL;
        if (viewGroup != null && (findViewById = viewGroup.findViewById(R.id.ajj)) != null) {
            C87277YNd.LJJIIZ(findViewById);
        }
        ViewGroup viewGroup2 = this.LJLLILLLL;
        if (viewGroup2 != null && (c47061t0 = (C47061t0) viewGroup2.findViewById(R.id.hsi)) != null) {
            C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(imageModel);
            int width = c47061t0.getWidth();
            int height = c47061t0.getHeight();
            LJIIIZ.LJ = width;
            LJIIIZ.LJFF = height;
            LJIIIZ.LJIIL = Boolean.TRUE;
            LJIIIZ.LJIIJJI = new IDdS57S0100000_13(c47061t0, 0);
            LJIIIZ.LJIIJJI(c47061t0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null && view.getId() == R.id.hsi) {
            if (LJFF()) {
                LJIIIIZZ();
            } else {
                LJII();
            }
        }
    }

    public ViewOnClickListenerC75325ThJ(Context context, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = context;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = -1;
        this.LJLJJI = new AObserverS81S0100000_13(this, 1);
        this.LJLJJL = new AObserverS81S0100000_13(this, 0);
        this.LJLJJLL = new AObserverS81S0100000_13(this, 3);
        this.LJLJL = new AObserverS81S0100000_13(this, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        if (r1 != null) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZ(X.AbstractC75323ThH r6, android.view.ViewGroup r7) {
        /*
            r5 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r5.LJLLI = r6
            r5.LJLJLJ = r7
            int r0 = r5.LIZJ()
            android.view.View r1 = r7.findViewById(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r4 = 0
            r3 = 0
            if (r1 == 0) goto L8a
        L17:
            android.content.Context r0 = r1.getContext()
            boolean r0 = X.CCJ.LIZ(r0)
            if (r0 == 0) goto L29
            r0 = 1
            r1.setLayoutDirection(r0)
            r0 = 4
            r1.setTextDirection(r0)
        L29:
            r5.LJLLILLLL = r1
            r5.LJ()
            r2 = -1
            r5.LJLJI = r2
            androidx.lifecycle.MutableLiveData r0 = r6.LJFF()
            if (r0 != 0) goto L51
            android.content.Context r0 = r5.LJLIL
            android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r0)
            r0 = 2131564303(0x7f0d170f, float:1.8754087E38)
            android.view.View r1 = X.C16880lQ.LLLLIILL(r1, r0, r3, r4)
            X.C278517l.LIZIZ(r2, r2, r1)
            android.view.ViewGroup r0 = r5.LJLJLJ
            if (r0 == 0) goto L51
            r0.removeAllViews()
            X.TV3.LJIILIIL(r2, r1, r0)
        L51:
            androidx.lifecycle.MutableLiveData r2 = r6.LJFF()
            if (r2 == 0) goto L5e
            androidx.lifecycle.LifecycleOwner r1 = r5.LJLILLLLZI
            Y.AObserverS81S0100000_13 r0 = r5.LJLJJI
            r2.observe(r1, r0)
        L5e:
            androidx.lifecycle.MutableLiveData r2 = r6.LJ()
            if (r2 == 0) goto L6b
            androidx.lifecycle.LifecycleOwner r1 = r5.LJLILLLLZI
            Y.AObserverS81S0100000_13 r0 = r5.LJLJJL
            r2.observe(r1, r0)
        L6b:
            androidx.lifecycle.MutableLiveData r2 = r6.LJIIJJI()
            if (r2 == 0) goto L78
            androidx.lifecycle.LifecycleOwner r1 = r5.LJLILLLLZI
            Y.AObserverS81S0100000_13 r0 = r5.LJLJJLL
            r2.observe(r1, r0)
        L78:
            X.Ol8 r0 = r6.LJIIIZ
            java.lang.Object r2 = r0.getValue()
            androidx.lifecycle.LiveData r2 = (androidx.lifecycle.LiveData) r2
            if (r2 == 0) goto L89
            androidx.lifecycle.LifecycleOwner r1 = r5.LJLILLLLZI
            Y.AObserverS81S0100000_13 r0 = r5.LJLJL
            r2.observe(r1, r0)
        L89:
            return
        L8a:
            android.content.Context r0 = r5.LJLIL
            if (r0 != 0) goto L90
        L8e:
            r1 = r3
            goto L29
        L90:
            android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r0)
            int r0 = r5.LIZIZ()
            android.view.View r1 = X.C16880lQ.LLLLIILL(r1, r0, r3, r4)
            int r0 = r5.LIZJ()
            r1.setId(r0)
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L8e
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L8e
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC75325ThJ.LIZ(X.ThH, android.view.ViewGroup):void");
    }
}
