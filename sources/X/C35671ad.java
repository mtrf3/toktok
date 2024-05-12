package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import au3.IDdS55S0100000;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35671ad extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final int LJLIL;
    public final EnumC05740Kk LJLILLLLZI;
    public final InterfaceC65784Pro<Boolean> LJLJI;
    public final InterfaceC88472Yns<AbstractC07650Rt, C76800UCe> LJLJJI;
    public final C25380z8<C279917z> LJLJJL;
    public final HashMap<Long, Integer> LJLJJLL;

    public final List<C279917z> getData() {
        List<C279917z> list = this.LJLJJL.LJFF;
        o.LJIIIIZZ(list, "differ.currentList");
        return list;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return getData().size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJLZ(List<C279917z> songList) {
        o.LJIIIZ(songList, "songList");
        C25380z8<C279917z> c25380z8 = this.LJLJJL;
        int i = c25380z8.LJI + 1;
        c25380z8.LJI = i;
        List<C279917z> list = c25380z8.LJ;
        if (songList == list) {
            return;
        }
        List<C279917z> list2 = c25380z8.LJFF;
        if (list == null) {
            c25380z8.LJ = songList;
            c25380z8.LJFF = Collections.unmodifiableList(songList);
            c25380z8.LIZ.LJLIIIL(0, songList.size());
            c25380z8.LIZ(list2, null);
            return;
        }
        c25380z8.LIZIZ.LIZ.execute(new RunnableC25350z5(c25380z8, list, songList, i));
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (((C279917z) ListProtector.get(getData(), i)).LJIIIIZZ()) {
            return 5;
        }
        int i2 = C24240xI.LIZ[this.LJLILLLLZI.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return 0;
                    }
                    return 1;
                }
                return 3;
            }
            return 0;
        }
        return 4;
    }

    public final void LJLLLLLL(int i, long j) {
        Iterator<C279917z> it = getData().iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().LIZ == j) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDownloadProgress, find: ");
        LIZ.append(i2);
        LIZ.append(", progress: ");
        LIZ.append(i);
        C0NB.LIZIZ("KaraokeSongListAdapter", X1D.LIZIZ(LIZ));
        if (i2 != -1) {
            if (i >= 100) {
                this.LJLJJLL.remove(Long.valueOf(j));
            } else {
                this.LJLJJLL.put(Long.valueOf(j), Integer.valueOf(i));
            }
            C0NB.LIZIZ("KaraokeSongListAdapter", "onDownloadProgress1");
            C0NB.LIZIZ("KaraokeSongListAdapter", "onDownloadProgress12");
            notifyItemChanged(i2, Integer.valueOf(i));
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof C36841cW) {
            C36841cW c36841cW = (C36841cW) holder;
            C279917z songInfo = (C279917z) ListProtector.get(getData(), i);
            InterfaceC88472Yns<AbstractC07650Rt, C76800UCe> actionCarrier = this.LJLJJI;
            o.LJIIIZ(songInfo, "songInfo");
            o.LJIIIZ(actionCarrier, "actionCarrier");
            c36841cW.LJLJLLL = actionCarrier;
            c36841cW.M(songInfo, i, EnumC24230xH.FULL_UPDATE);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c44121oG;
        C36841cW c36841cW;
        o.LJIIIZ(parent, "parent");
        int i2 = 5;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            c44121oG = new C36841cW(this.LJLIL, C29306Beo.LJIIIIZZ(R.layout.d_j, parent, false));
                        } else {
                            final View LJIIIIZZ = C29306Beo.LJIIIIZZ(R.layout.d6q, parent, false);
                            c44121oG = new RecyclerView.ViewHolder(LJIIIIZZ) { // from class: X.1cV
                                {
                                    super(LJIIIIZZ);
                                    C29306Beo.LJJLJLI(LJIIIIZZ.findViewById(R.id.g94));
                                }
                            };
                        }
                    } else {
                        final int i3 = this.LJLIL;
                        final View LJIIIIZZ2 = C29306Beo.LJIIIIZZ(R.layout.d_j, parent, false);
                        final IDqS416S0100000 iDqS416S0100000 = new IDqS416S0100000(this, 298);
                        c44121oG = new C44121oG(i3, LJIIIIZZ2, iDqS416S0100000) { // from class: X.27d
                            @Override // X.C44121oG, X.C36841cW
                            public final void M(C279917z songInfo, int i4, EnumC24230xH payload) {
                                o.LJIIIZ(songInfo, "songInfo");
                                o.LJIIIZ(payload, "payload");
                                super.M(songInfo, i4, payload);
                                if (C260410m.LIZ[payload.ordinal()] == 1) {
                                    View itemView = this.itemView;
                                    o.LJIIIIZZ(itemView, "itemView");
                                    C29306Beo.LJJJLL(itemView, 500L, new IDqS416S0100000(this, 338));
                                }
                            }
                        };
                    }
                } else {
                    final int i4 = this.LJLIL;
                    final View LJIIIIZZ3 = C29306Beo.LJIIIIZZ(R.layout.d_j, parent, false);
                    final IDqS416S0100000 iDqS416S01000002 = new IDqS416S0100000(this, 297);
                    c44121oG = new C44121oG(i4, LJIIIIZZ3, iDqS416S01000002) { // from class: X.27c
                        public final ViewGroup LJLLLL;
                        public final List<C47061t0> LJLLLLLL;

                        @Override // X.C44121oG
                        public final void Q(C279917z songInfo) {
                            o.LJIIIZ(songInfo, "songInfo");
                            C29306Beo.LJI(this.LJLLL);
                            X(songInfo);
                        }

                        public final void X(C279917z c279917z) {
                            String str;
                            if (!c279917z.LJI().isEmpty()) {
                                C29306Beo.LJJLJLI(this.LJLLLL);
                                int i5 = 0;
                                for (C47061t0 c47061t0 : this.LJLLLLLL) {
                                    int i6 = i5 + 1;
                                    if (i5 >= 0) {
                                        C47061t0 c47061t02 = c47061t0;
                                        ImageModel imageModel = (ImageModel) ORZ.LJLLLLLL(i5, c279917z.LJI());
                                        if (imageModel != null) {
                                            C29306Beo.LJJLJLI(c47061t02);
                                            if (i5 < 2 || (i5 == 2 && c279917z.LJIILJJIL == 3)) {
                                                C78720Uuy LIZJ = C15650jR.LIZ().LIZJ(Boolean.FALSE);
                                                LIZJ.LJIIL = Boolean.TRUE;
                                                LIZJ.LJIIIIZZ = R.drawable.cul;
                                                LIZJ.LJIIJJI = new IDdS55S0100000(c47061t02, 2);
                                                LIZJ.LJIIIZ(imageModel);
                                                LIZJ.LJIIJJI(c47061t02);
                                                if (Build.VERSION.SDK_INT >= 23 && c47061t02 != null) {
                                                    c47061t02.setForeground(C15380j0.LJI(R.drawable.d6i));
                                                }
                                            } else if (Build.VERSION.SDK_INT >= 23) {
                                                if (c47061t02 != null) {
                                                    c47061t02.setForeground(null);
                                                    c47061t02.setImageResource(R.drawable.cvt);
                                                }
                                            } else {
                                                if (c47061t02 == null) {
                                                }
                                                c47061t02.setImageResource(R.drawable.cvt);
                                            }
                                        } else {
                                            C29306Beo.LJI(c47061t02);
                                        }
                                        i5 = i6;
                                    } else {
                                        C47261Igj.LJJJJJ();
                                        throw null;
                                    }
                                }
                            } else {
                                C29306Beo.LJI(this.LJLLLL);
                            }
                            C47121t6 c47121t6 = this.LJLJJLL;
                            if (c47121t6 != null) {
                                int i7 = c279917z.LJIILJJIL;
                                if (i7 > 0) {
                                    str = C15380j0.LJIIIIZZ(R.plurals.jz, i7, Integer.valueOf(i7));
                                } else {
                                    str = "";
                                }
                                c47121t6.setText(str);
                            }
                            C29306Beo.LJI(this.LJLJL);
                            C29306Beo.LJI(this.LJLJLJ);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LJLLLL = (ViewGroup) LJIIIIZZ3.findViewById(R.id.ixv);
                            this.LJLLLLLL = C47261Igj.LJJIJIIJI(LJIIIIZZ3.findViewById(R.id.ixs), LJIIIIZZ3.findViewById(R.id.ixt), LJIIIIZZ3.findViewById(R.id.ixu));
                        }

                        @Override // X.C44121oG, X.C36841cW
                        public final void M(C279917z songInfo, int i5, EnumC24230xH payload) {
                            o.LJIIIZ(songInfo, "songInfo");
                            o.LJIIIZ(payload, "payload");
                            super.M(songInfo, i5, payload);
                            if (C260310l.LIZ[payload.ordinal()] == 1) {
                                X(songInfo);
                            }
                        }
                    };
                }
            } else {
                final int i5 = this.LJLIL;
                final View LJIIIIZZ4 = C29306Beo.LJIIIIZZ(R.layout.d_g, parent, false);
                c44121oG = new C36841cW(i5, LJIIIIZZ4) { // from class: X.1oH
                    public final ImageView LJLLI;
                    public final ImageView LJLLILLLL;
                    public final LiveIconView LJLLJ;
                    public final ImageView LJLLL;

                    @Override // X.C36841cW
                    public final void P(C279917z songInfo) {
                        o.LJIIIZ(songInfo, "songInfo");
                        super.P(songInfo);
                        if (this.LJLIL == 1) {
                            C29306Beo.LJI(this.LJLLI);
                            C29306Beo.LJI(this.LJLLILLLL);
                            C29306Beo.LJJLJLI(this.LJLLJ);
                            C29306Beo.LJJLJLI(this.LJLLL);
                        }
                        if (songInfo.LJIILIIL == AnonymousClass017.PLAYING) {
                            LiveIconView liveIconView = this.LJLLJ;
                            if (liveIconView != null) {
                                liveIconView.setIconAttr(R.attr.aur);
                                return;
                            }
                            return;
                        }
                        LiveIconView liveIconView2 = this.LJLLJ;
                        if (liveIconView2 == null) {
                            return;
                        }
                        liveIconView2.setIconAttr(R.attr.av3);
                    }

                    {
                        this.LJLLI = (ImageView) LJIIIIZZ4.findViewById(R.id.fev);
                        this.LJLLILLLL = (ImageView) LJIIIIZZ4.findViewById(R.id.fer);
                        this.LJLLJ = (LiveIconView) LJIIIIZZ4.findViewById(R.id.few);
                        this.LJLLL = (ImageView) LJIIIIZZ4.findViewById(R.id.feu);
                    }

                    @Override // X.C36841cW
                    public final void M(C279917z songInfo, int i6, EnumC24230xH payload) {
                        o.LJIIIZ(songInfo, "songInfo");
                        o.LJIIIZ(payload, "payload");
                        super.M(songInfo, i6, payload);
                        switch (C260210k.LIZ[payload.ordinal()]) {
                            case 1:
                                if (i6 != 0) {
                                    if (i6 != 1) {
                                        C29306Beo.LJIIIZ(this.LJLLL);
                                        C29306Beo.LJIIIZ(this.LJLLJ);
                                        C29306Beo.LJJLJLI(this.LJLLI);
                                        C29306Beo.LJJLJLI(this.LJLLILLLL);
                                    } else {
                                        C29306Beo.LJIIIZ(this.LJLLL);
                                        C29306Beo.LJIIIZ(this.LJLLJ);
                                        C29306Beo.LJIIIZ(this.LJLLI);
                                        C29306Beo.LJJLJLI(this.LJLLILLLL);
                                    }
                                } else {
                                    C29306Beo.LJJLJLI(this.LJLLL);
                                    C29306Beo.LJJLJLI(this.LJLLJ);
                                    C29306Beo.LJIIIZ(this.LJLLI);
                                    C29306Beo.LJIIIZ(this.LJLLILLLL);
                                }
                                if (this.LJLIL != 1) {
                                    C29306Beo.LJI(this.LJLLL);
                                    C29306Beo.LJI(this.LJLLJ);
                                    C29306Beo.LJI(this.LJLLI);
                                    C29306Beo.LJI(this.LJLLILLLL);
                                }
                                ImageView imageView = this.LJLLI;
                                if (imageView != null) {
                                    C29306Beo.LJJJLL(imageView, 500L, new IDqS416S0100000(this, 334));
                                }
                                ImageView imageView2 = this.LJLLILLLL;
                                if (imageView2 != null) {
                                    C29306Beo.LJJJLL(imageView2, 500L, new IDqS416S0100000(this, 335));
                                }
                                LiveIconView liveIconView = this.LJLLJ;
                                if (liveIconView != null) {
                                    C29306Beo.LJJJLL(liveIconView, 500L, new IDqS416S0100000(this, 336));
                                }
                                ImageView imageView3 = this.LJLLL;
                                if (imageView3 == null) {
                                    return;
                                }
                                C29306Beo.LJJJLL(imageView3, 500L, new IDqS416S0100000(this, 337));
                                return;
                            case 2:
                                if (this.LJLIL != 1) {
                                    return;
                                }
                                C29306Beo.LJIIIZ(this.LJLLI);
                                return;
                            case 3:
                                if (this.LJLIL != 1) {
                                    return;
                                }
                                C29306Beo.LJJLJLI(this.LJLLI);
                                return;
                            case 4:
                                LiveIconView liveIconView2 = this.LJLLJ;
                                if (liveIconView2 == null) {
                                    return;
                                }
                                liveIconView2.setIconAttr(R.attr.aur);
                                return;
                            case 5:
                            case 6:
                                LiveIconView liveIconView3 = this.LJLLJ;
                                if (liveIconView3 == null) {
                                    return;
                                }
                                liveIconView3.setIconAttr(R.attr.av3);
                                return;
                            default:
                                return;
                        }
                    }
                };
            }
        } else {
            c44121oG = new C44121oG(this.LJLIL, C29306Beo.LJIIIIZZ(R.layout.d_j, parent, false), new IDqS416S0100000(this, 296));
        }
        if ((c44121oG instanceof C36841cW) && (c36841cW = (C36841cW) c44121oG) != null) {
            if (!C15380j0.LJIIZILJ()) {
                i2 = 3;
            }
            C47121t6 c47121t6 = c36841cW.LJLJJL;
            if (c47121t6 != null) {
                c47121t6.setGravity(i2);
            }
            C47121t6 c47121t62 = c36841cW.LJLJJLL;
            if (c47121t62 != null) {
                c47121t62.setGravity(i2);
            }
            C47121t6 c47121t63 = c36841cW.LJLJL;
            if (c47121t63 != null) {
                c47121t63.setGravity(i2);
            }
        }
        C0AX.LIZ(parent, c44121oG.itemView, R.id.lj7);
        View view = c44121oG.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c44121oG.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c44121oG.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c44121oG.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c44121oG.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c44121oG.getClass().getName();
        return c44121oG;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        EnumC24230xH enumC24230xH;
        C36841cW c36841cW;
        C44121oG c44121oG;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        C0NB.LIZIZ("KaraokeSongListAdapter", "onBind-Payload start");
        if (payloads.isEmpty()) {
            C0NB.LIZIZ("KaraokeSongListAdapter", "onBind-FULL UPDATE");
            onBindViewHolder(holder, i);
            return;
        }
        for (Object obj : payloads) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onBind-Payload: ");
            LIZ.append(obj);
            C0NB.LIZIZ("KaraokeSongListAdapter", X1D.LIZIZ(LIZ));
            if (obj instanceof List) {
                for (Object obj2 : (Iterable) obj) {
                    if ((obj2 instanceof EnumC24230xH) && (enumC24230xH = (EnumC24230xH) obj2) != null && (holder instanceof C36841cW) && (c36841cW = (C36841cW) holder) != null) {
                        c36841cW.M((C279917z) ListProtector.get(getData(), i), i, enumC24230xH);
                    }
                }
            } else if ((obj instanceof Integer) && (holder instanceof C44121oG) && (c44121oG = (C44121oG) holder) != null) {
                c44121oG.U(((Number) obj).intValue());
            }
        }
    }

    public C35671ad(int i, EnumC05740Kk listType, QXX diffCallback, IDqS420S0100000 iDqS420S0100000, IDqS416S0100000 iDqS416S0100000) {
        o.LJIIIZ(listType, "listType");
        o.LJIIIZ(diffCallback, "diffCallback");
        this.LJLIL = i;
        this.LJLILLLLZI = listType;
        this.LJLJI = iDqS420S0100000;
        this.LJLJJI = iDqS416S0100000;
        this.LJLJJL = new C25380z8<>(this, diffCallback);
        this.LJLJJLL = new HashMap<>();
    }
}
