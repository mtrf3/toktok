package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.EditAdjustClipsState;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditTrimState;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I6Z implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIII;
    public final C82622Wbi LJLIL;
    public final C82631Wbr LJLILLLLZI;
    public boolean LJLJI;
    public float LJLJJI;
    public final C62822Ol8 LJLJJL;
    public float LJLJJLL;
    public boolean LJLJL;
    public InterfaceC153045zY LJLJLJ;
    public C46069I6f LJLJLLL;
    public OSZ<Integer, Integer> LJLL;
    public MultiEditVideoRecordData LJLLI;
    public MultiEditVideoRecordData LJLLILLLL;
    public MultiEditVideoRecordData LJLLJ;
    public ArrayList<TimeSpeedModelExtension> LJLLL;
    public ArrayList<TimeSpeedModelExtension> LJLLLL;
    public ArrayList<TimeSpeedModelExtension> LJLLLLLL;
    public final C82632Wbs LJLZ;
    public final C82632Wbs LJZ;
    public final C82632Wbs LJZI;
    public final C82631Wbr LJZL;
    public final C82632Wbs LL;
    public final C82632Wbs LLD;
    public final C82632Wbs LLF;
    public final C82632Wbs LLFF;
    public final C82631Wbr LLFFF;
    public float LLFII;
    public OSZ<Long, Long> LLFZ;
    public OSZ<Long, Long> LLI;
    public boolean LLIFFJFJJ;
    public int LLII;

    static {
        TBT tbt = new TBT(I6Z.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(I6Z.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0, c65351Pkp), C61845OOz.LIZJ(I6Z.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(I6Z.class, "editAdjustModel", "getEditAdjustModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0, c65351Pkp), C61845OOz.LIZJ(I6Z.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(I6Z.class, "musicSyncController", "getMusicSyncController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditMusicSyncController;", 0, c65351Pkp), C61845OOz.LIZJ(I6Z.class, "videoImageMixedPresenter", "getVideoImageMixedPresenter()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/videoimagemixed/VideoImageMixedPresenter;", 0, c65351Pkp), C61845OOz.LIZJ(I6Z.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(I6Z.class, "cutVideoSpeedViewModel", "getCutVideoSpeedViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoSpeedViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(I6Z.class, "playerController", "getPlayerController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/IPlayerController;", 0, c65351Pkp), C61845OOz.LIZJ(I6Z.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0, c65351Pkp)};
    }

    public final EditAdjustClipsBottomViewModel LIZJ() {
        return (EditAdjustClipsBottomViewModel) this.LLD.LIZ(this, LLIIII[7]);
    }

    public final I61 LJ() {
        return (I61) this.LJZ.LIZ(this, LLIIII[3]);
    }

    public final VideoPublishEditModel LJFF() {
        return (VideoPublishEditModel) this.LJLZ.LIZ(this, LLIIII[2]);
    }

    public final InterfaceC143855kj LJI() {
        return (InterfaceC143855kj) this.LLFFF.LIZ(this, LLIIII[10]);
    }

    public final List<VideoSegment> LJII() {
        return (List) this.LJLJJL.getValue();
    }

    public final C46072I6i LJIIIZ() {
        return (C46072I6i) this.LJZL.LIZ(this, LLIIII[5]);
    }

    public final I7R LJIIJ() {
        return (I7R) this.LLFF.LIZ(this, LLIIII[9]);
    }

    public final C5KL LJIIL() {
        return (C5KL) this.LL.LIZ(this, LLIIII[6]);
    }

    public final void LIZIZ() {
        String uuid;
        if (!C44384HbQ.LJJLI(LJFF())) {
            return;
        }
        AbstractC46064I6a.LLIILZL.getClass();
        C136195Wd.LIZ("real deleteTimeEffect");
        InterfaceC153045zY interfaceC153045zY = this.LJLJLJ;
        if (interfaceC153045zY != null) {
            C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
            if (LJJI != null) {
                EffectPointModel timeEffect = LJFF().getTimeEffect();
                if (timeEffect != null && (uuid = timeEffect.getUuid()) != null && C78685UuP.LJJJZ(uuid)) {
                    LJJI.LIZLLL().LLIL();
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final MultiEditVideoRecordData LIZLLL() {
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = LJ().LIZLLL;
        if (multiEditVideoStatusRecordData == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) == null) {
            return new MultiEditVideoRecordData();
        }
        return multiEditVideoRecordData;
    }

    public final long LJIIIIZZ() {
        return Math.min(LJIIJJI(), HEL.LIZ());
    }

    public final long LJIIJJI() {
        List<MultiEditVideoSegmentRecordData> list = LIZLLL().segmentDataList;
        ArrayList LIZIZ = s1.LIZIZ(list, "curRecordData.segmentDataList");
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
            if (multiEditVideoSegmentRecordData.enable) {
                LIZIZ.add(multiEditVideoSegmentRecordData);
            }
        }
        Iterator it = LIZIZ.iterator();
        long j = 0;
        while (it.hasNext()) {
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = (MultiEditVideoSegmentRecordData) it.next();
            j += (int) (((float) (multiEditVideoSegmentRecordData2.getEndTime() - multiEditVideoSegmentRecordData2.getStartTime())) / multiEditVideoSegmentRecordData2.getVideoSpeed());
        }
        return j;
    }

    public final void LJIILIIL() {
        EditAdjustClipsState editAdjustClipsState;
        List<MultiEditVideoSegmentRecordData> list;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = LJFF().multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData == null || multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null || C77413UZt.LJIILL(multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList)) {
            return;
        }
        this.LLIFFJFJJ = multiEditVideoStatusRecordData.isMultiEditRetake;
        ArrayList<TimeSpeedModelExtension> arrayList = multiEditVideoStatusRecordData.originalSegments;
        if (arrayList != null) {
            ArrayList<TimeSpeedModelExtension> arrayList2 = multiEditVideoStatusRecordData.editSegments;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>(arrayList);
            }
            this.LJLLLLLL = arrayList2;
            ArrayList<TimeSpeedModelExtension> arrayList3 = multiEditVideoStatusRecordData.restoreSegments;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList<>(this.LJLLLLLL);
            }
            this.LJLLL = arrayList3;
            ArrayList<TimeSpeedModelExtension> arrayList4 = multiEditVideoStatusRecordData.singleRestoreSegments;
            if (arrayList4 == null) {
                ArrayList<TimeSpeedModelExtension> arrayList5 = this.LJLLL;
                o.LJI(arrayList5);
                arrayList4 = new ArrayList<>(arrayList5);
            }
            this.LJLLLL = arrayList4;
            if (multiEditVideoStatusRecordData.segmentSizeChange) {
                this.LJLLLL = this.LJLLLLLL;
            }
        }
        MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData;
        if (multiEditVideoRecordData == null) {
            this.LJLLI = C6BI.LIZIZ(multiEditVideoStatusRecordData.curMultiEditVideoRecordData, null);
        } else {
            this.LJLLI = multiEditVideoRecordData;
        }
        MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData;
        if (multiEditVideoRecordData2 == null) {
            this.LJLLJ = C6BI.LIZIZ(multiEditVideoStatusRecordData.curMultiEditVideoRecordData, null);
        } else {
            this.LJLLJ = multiEditVideoRecordData2;
        }
        this.LJLLILLLL = C6BI.LIZIZ(LIZLLL(), null);
        if (LJFF().creativeModel.uploadPreviewClipModel.hasMediaClipped && (list = LJFF().getCurMultiEditVideoRecordData().segmentDataList) != null && list.size() == 1) {
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) ListProtector.get(list, 0);
            this.LLFZ = new OSZ<>(Long.valueOf(multiEditVideoSegmentRecordData.getStartTime()), Long.valueOf(multiEditVideoSegmentRecordData.getEndTime()));
            this.LLI = new OSZ<>(Long.valueOf(multiEditVideoSegmentRecordData.getStartTime()), Long.valueOf(multiEditVideoSegmentRecordData.getEndTime()));
        }
        if (!LJFF().mIsFromDraft || (editAdjustClipsState = LJFF().multiEditVideoRecordData.adjustClipsState) == null) {
            return;
        }
        OSZ<Long, Long> lastEditBoundary = editAdjustClipsState.getLastEditBoundary();
        if (lastEditBoundary != null) {
            Long first = lastEditBoundary.getFirst();
            Long second = lastEditBoundary.getSecond();
            if (first != null && second != null) {
                this.LLFZ = new OSZ<>(first, second);
            }
        }
        OSZ<Long, Long> viewBoundary = editAdjustClipsState.getViewBoundary();
        if (viewBoundary == null) {
            return;
        }
        Long first2 = viewBoundary.getFirst();
        Long second2 = viewBoundary.getSecond();
        if (first2 == null || second2 == null) {
            return;
        }
        this.LLI = new OSZ<>(first2, second2);
    }

    public final void LJIILL() {
        List<VideoSegment> LJII = LJII();
        if (C65777Prh.LJI(LJII) && LJII != null) {
            LJII.clear();
            LJII.addAll(C46104I7o.LJIILIIL(LIZLLL()));
        }
        LJIILIIL();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public I6Z(C82622Wbi c82622Wbi) {
        this.LJLIL = c82622Wbi;
        UCI.LJI(c82622Wbi, InterfaceC143655kP.class, null);
        this.LJLILLLLZI = UCI.LJII(c82622Wbi, C5XM.class, null);
        this.LJLJJI = 1.0f;
        this.LJLJJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 203));
        this.LJLJJLL = -1.0f;
        this.LJLZ = UCI.LJI(c82622Wbi, VideoPublishEditModel.class, null);
        this.LJZ = UCI.LJI(c82622Wbi, I61.class, null);
        this.LJZI = UCI.LJI(c82622Wbi, CutMultiVideoViewModel.class, null);
        this.LJZL = UCI.LJII(c82622Wbi, C46072I6i.class, null);
        this.LL = UCI.LJI(c82622Wbi, C5KL.class, null);
        this.LLD = UCI.LJI(c82622Wbi, EditAdjustClipsBottomViewModel.class, null);
        this.LLF = UCI.LJI(c82622Wbi, CutVideoSpeedViewModel.class, null);
        this.LLFF = UCI.LJI(c82622Wbi, I7R.class, null);
        this.LLFFF = UCI.LJII(c82622Wbi, InterfaceC143855kj.class, null);
        this.LLFII = 1.0f;
    }

    public final void LJIJ(OSZ<Long, Long> boundary) {
        float videoSpeed;
        o.LJIIIZ(boundary, "boundary");
        if (this.LJLJL) {
            return;
        }
        Integer editState = LIZJ().Ov0().getEditState();
        if (editState == null || editState.intValue() != 2) {
            if (LJ().LIZIZ) {
                videoSpeed = 1.0f;
            } else {
                videoSpeed = ((MultiEditVideoSegmentRecordData) ListProtector.get(LIZLLL().segmentDataList, 0)).getVideoSpeed();
            }
            LJIILLIIL((int) (boundary.getFirst().floatValue() / videoSpeed), (int) (boundary.getSecond().floatValue() / videoSpeed));
            return;
        }
        if (C78946Uyc.LJIJJLI(LJ())) {
            return;
        }
        LJIJI(this.LLII, (int) boundary.getFirst().longValue(), (int) (boundary.getSecond().longValue() - boundary.getFirst().longValue()));
    }

    public final void LJIJJLI(OSZ<Long, Long> osz) {
        MultiEditTrimState multiEditTrimState;
        OSZ<Long, Long> osz2 = osz;
        if (osz2 == null) {
            osz2 = this.LLFZ;
        }
        if (osz2 != null) {
            if (!this.LJLJL) {
                long LJIIJJI = LJIIJJI();
                if (osz2.getFirst().longValue() != 0 || osz2.getSecond().longValue() != LJIIJJI) {
                    C46104I7o.LJJJIL(LIZLLL(), osz2.getFirst().longValue(), osz2.getSecond().longValue());
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = LJFF().multiEditVideoRecordData;
                    if (multiEditVideoStatusRecordData != null) {
                        long longValue = osz2.getFirst().longValue();
                        long longValue2 = osz2.getSecond().longValue();
                        ArrayList<TimeSpeedModelExtension> arrayList = multiEditVideoStatusRecordData.editSegments;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator<TimeSpeedModelExtension> it = multiEditVideoStatusRecordData.editSegments.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                TimeSpeedModelExtension next = it.next();
                                arrayList2.add(Integer.valueOf(i));
                                i += next.getDuration();
                                arrayList3.add(Integer.valueOf(i));
                            }
                            int size = arrayList3.size();
                            int size2 = arrayList3.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 < size2) {
                                    if (((Number) ListProtector.get(arrayList3, i2)).intValue() >= longValue) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                } else {
                                    i2 = 0;
                                    break;
                                }
                            }
                            int size3 = arrayList2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i3 = size3 - 1;
                                    if (((Number) ListProtector.get(arrayList2, size3)).intValue() > longValue2) {
                                        if (i3 < 0) {
                                            break;
                                        } else {
                                            size3 = i3;
                                        }
                                    } else {
                                        size = size3;
                                        break;
                                    }
                                }
                            }
                            o.LJI(multiEditVideoStatusRecordData.editSegments);
                            if (size <= r0.size() - 1) {
                                size++;
                            }
                            ArrayList<TimeSpeedModelExtension> arrayList4 = multiEditVideoStatusRecordData.editSegments;
                            o.LJI(arrayList4);
                            multiEditVideoStatusRecordData.editCutSegments = new ArrayList<>(arrayList4.subList(i2, size));
                        }
                    }
                } else {
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = LJFF().multiEditVideoRecordData;
                    if (multiEditVideoStatusRecordData2 != null && multiEditVideoStatusRecordData2.editSegments != null) {
                        multiEditVideoStatusRecordData2.editCutSegments = new ArrayList<>(multiEditVideoStatusRecordData2.editSegments);
                    }
                }
                C46069I6f c46069I6f = this.LJLJLLL;
                if ((c46069I6f instanceof C46069I6f) && c46069I6f != null) {
                    C46046I5i.LIZ(c46069I6f, false, null, 2);
                }
            } else {
                List<MultiEditVideoSegmentRecordData> list = LIZLLL().segmentDataList;
                o.LJIIIIZZ(list, "curRecordData.segmentDataList");
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                    MultiEditTrimState multiEditTrimState2 = multiEditVideoSegmentRecordData.multiEditTrimState;
                    if (multiEditTrimState2 != null) {
                        multiEditTrimState = MultiEditTrimState.copy$default(multiEditTrimState2, multiEditVideoSegmentRecordData.enable, 0L, 0L, 6, null);
                    } else {
                        multiEditTrimState = null;
                    }
                    multiEditVideoSegmentRecordData.multiEditTrimState = multiEditTrimState;
                }
            }
        }
        long j = 0;
        LIZLLL().startTime = 0L;
        List<MultiEditVideoSegmentRecordData> list2 = LIZLLL().segmentDataList;
        ArrayList LIZIZ = s1.LIZIZ(list2, "curRecordData.segmentDataList");
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 : list2) {
            if (multiEditVideoSegmentRecordData2.enable) {
                LIZIZ.add(multiEditVideoSegmentRecordData2);
            }
        }
        Iterator it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData3 = (MultiEditVideoSegmentRecordData) it2.next();
            j += multiEditVideoSegmentRecordData3.getEndTime() - multiEditVideoSegmentRecordData3.getStartTime();
        }
        LIZLLL().endTime = j;
    }

    public final void LIZ(boolean z, boolean z2) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        ArrayList<TimeSpeedModelExtension> arrayList;
        List list;
        ArrayList<TimeSpeedModelExtension> arrayList2;
        InterfaceC153045zY interfaceC153045zY;
        float f;
        ArrayList<TimeSpeedModelExtension> arrayList3;
        C136195Wd c136195Wd = AbstractC46064I6a.LLIILZL;
        StringBuilder LIZLLL = C00F.LIZLLL("cancelWork,isSingleCancel:", z, ",reInit:", z2, ",isMusicSyncMode:");
        LIZLLL.append(this.LJLJL);
        String LIZIZ = X1D.LIZIZ(LIZLLL);
        c136195Wd.getClass();
        C136195Wd.LIZ(LIZIZ);
        this.LLIFFJFJJ = false;
        if ((z && (multiEditVideoRecordData = this.LJLLJ) != null) || (multiEditVideoRecordData = this.LJLLI) != null) {
            if (!z || (arrayList3 = this.LJLLLL) == null || arrayList3.isEmpty()) {
                arrayList = this.LJLLL;
            } else {
                arrayList = this.LJLLLL;
            }
            boolean z3 = LIZLLL().hasRetake;
            LJFF().multiEditVideoRecordData.curMultiEditVideoRecordData = C6BI.LIZIZ(multiEditVideoRecordData, LIZLLL());
            LJFF().multiEditVideoRecordData.isMultiEditRetake = false;
            LIZLLL().hasRetake = z3;
            if (arrayList != null) {
                list = ORZ.LLJILJILJ(arrayList);
            } else {
                list = null;
            }
            if (list instanceof ArrayList) {
                arrayList2 = (ArrayList) list;
            } else {
                arrayList2 = null;
            }
            this.LJLLLLLL = arrayList2;
            List<VideoSegment> LJII = LJII();
            if (C65777Prh.LJI(LJII) && LJII != null) {
                LJII.clear();
                LJII.addAll(C46104I7o.LJIILIIL(LIZLLL()));
            }
            if (!LJ().LIZIZ) {
                CutVideoSpeedViewModel cutVideoSpeedViewModel = (CutVideoSpeedViewModel) this.LLF.LIZ(this, LLIIII[8]);
                List<MultiEditVideoSegmentRecordData> list2 = LIZLLL().segmentDataList;
                o.LJIIIIZZ(list2, "curRecordData.segmentDataList");
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) ORZ.LJLLLLLL(0, list2);
                if (multiEditVideoSegmentRecordData != null) {
                    f = multiEditVideoSegmentRecordData.getVideoSpeed();
                } else {
                    f = 1.0f;
                }
                EnumC82528WaC fromValue = EnumC82528WaC.fromValue(f);
                o.LJIIIIZZ(fromValue, "fromValue((curRecordData…(0)?.videoSpeed ?: 1.0f))");
                cutVideoSpeedViewModel.Mv0(fromValue);
            }
            if (z2) {
                C46069I6f c46069I6f = this.LJLJLLL;
                if ((c46069I6f instanceof C46069I6f) && c46069I6f != null) {
                    C46046I5i.LIZ(c46069I6f, true, null, 2);
                }
                if (this.LJLJL && (interfaceC153045zY = this.LJLJLJ) != null) {
                    interfaceC153045zY.removeAllVideoSound();
                    return;
                }
                return;
            }
            return;
        }
        o.LJIJI("restoreRecordData");
        throw null;
    }

    public final void LJIILJJIL(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        long j;
        boolean z2;
        List list;
        OSZ<Long, Long> osz;
        if (z) {
            List list2 = null;
            if (this.LLFZ == null) {
                if (interfaceC65784Pro != null) {
                    osz = (OSZ) interfaceC65784Pro.invoke();
                } else {
                    osz = null;
                }
                this.LLFZ = osz;
            }
            OSZ<Long, Long> osz2 = this.LLFZ;
            OSZ<Long, Long> osz3 = this.LLI;
            long j2 = 0;
            if (!this.LJLJL) {
                if (LJ().LIZIZ) {
                    C46104I7o.LJJJLL(LIZLLL(), LJII());
                } else {
                    List<MultiEditVideoSegmentRecordData> list3 = LIZLLL().segmentDataList;
                    o.LJIIIIZZ(list3, "curRecordData.segmentDataList");
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) ORZ.LJLLLLLL(0, list3);
                    if (multiEditVideoSegmentRecordData != null) {
                        multiEditVideoSegmentRecordData.setStartTime(0L);
                        multiEditVideoSegmentRecordData.setEndTime(multiEditVideoSegmentRecordData.videoLength / 1000);
                    }
                }
                C46069I6f c46069I6f = this.LJLJLLL;
                if ((c46069I6f instanceof C46069I6f) && c46069I6f != null) {
                    c46069I6f.LIZIZ(osz2, true);
                }
            }
            if (!this.LLIFFJFJJ) {
                MultiEditVideoRecordData LIZLLL = LIZLLL();
                MultiEditVideoRecordData multiEditVideoRecordData = this.LJLLI;
                if (multiEditVideoRecordData != null) {
                    C6BI.LIZIZ(LIZLLL, multiEditVideoRecordData);
                    ArrayList<TimeSpeedModelExtension> arrayList = this.LJLLLLLL;
                    if (arrayList != null) {
                        list = ORZ.LLJILJILJ(arrayList);
                    } else {
                        list = null;
                    }
                    this.LJLLL = (ArrayList) list;
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = LJFF().multiEditVideoRecordData;
                    ArrayList<TimeSpeedModelExtension> arrayList2 = this.LJLLLLLL;
                    if (arrayList2 != null) {
                        list2 = ORZ.LLJILJILJ(arrayList2);
                    }
                    multiEditVideoStatusRecordData.editSegments = (ArrayList) list2;
                } else {
                    o.LJIJI("restoreRecordData");
                    throw null;
                }
            }
            if (this.LJLJL || osz3 == null) {
                j = 0;
            } else {
                j = osz3.getFirst().longValue();
            }
            if (!this.LJLJL && osz3 != null) {
                j2 = osz3.getSecond().longValue() - osz3.getFirst().longValue();
            }
            EditAdjustClipsBottomViewModel LIZJ = LIZJ();
            if (LJII().size() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            I6C i6c = new I6C(z2, j, j2);
            LIZJ.getClass();
            LIZJ.setStateImmediate(new AqS173S0100000_7(i6c, 110));
            if (osz2 != null) {
                LJIJ(osz2);
            }
        }
    }

    public final void LJIILLIIL(int i, int i2) {
        int i3;
        InterfaceC153045zY interfaceC153045zY = this.LJLJLJ;
        if (interfaceC153045zY != null) {
            C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
            if (LJJI != null) {
                if (LJJI.LJFF().LJJIII() == null || LIZLLL().musicDuration <= 0 || this.LJLJL) {
                    return;
                }
                if (i2 <= 0) {
                    i3 = (int) LJIIIIZZ();
                } else {
                    i3 = i2;
                }
                InterfaceC153045zY interfaceC153045zY2 = this.LJLJLJ;
                if (interfaceC153045zY2 != null && i2 > interfaceC153045zY2.getDuration()) {
                    i3 = interfaceC153045zY2.getDuration();
                }
                int i4 = i3 - i;
                if (i4 > LIZLLL().musicDuration) {
                    i4 = LIZLLL().musicDuration;
                }
                InterfaceC153045zY interfaceC153045zY3 = this.LJLJLJ;
                if (interfaceC153045zY3 != null) {
                    C122034qd LJJI2 = C17N.LJJI(interfaceC153045zY3);
                    if (LJJI2 != null) {
                        C121914qR LJJIII = LJJI2.LJFF().LJJIII();
                        if (LJJIII != null) {
                            LJJIII.LIZJ = LIZLLL().musicTrimIn;
                            LJJIII.LIZLLL = LIZLLL().musicTrimIn + i4;
                            LJJIII.LJ = i;
                            LJJIII.LJIILLIIL = false;
                            LJJI2.LJFF().LJJJJJL(LJJIII);
                            return;
                        }
                        return;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void LJIJJ(OSZ osz, boolean z) {
        C136195Wd c136195Wd = AbstractC46064I6a.LLIILZL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switchMode,current:");
        LIZ.append(this.LJLJL);
        LIZ.append(",target:");
        LIZ.append(z);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c136195Wd.getClass();
        C136195Wd.LIZ(LIZIZ);
        this.LJLJL = z;
        Iterator<VideoSegment> it = LJII().iterator();
        while (it.hasNext()) {
            it.next().isStickPointMode = this.LJLJL;
        }
        C46104I7o.LJJJLL(LIZLLL(), LJII());
        LJIIL().LIZIZ = z;
        LJIIL().LIZIZ(LJII());
        if (z) {
            C46069I6f c46069I6f = this.LJLJLLL;
            if ((c46069I6f instanceof C46069I6f) && c46069I6f != null) {
                C46046I5i.LIZ(c46069I6f, false, null, 3);
            }
            I7S.LIZ(LJIIJ(), 0L, null, 6);
            return;
        }
        C46069I6f c46069I6f2 = this.LJLJLLL;
        if ((c46069I6f2 instanceof C46069I6f) && c46069I6f2 != null) {
            C46046I5i.LIZ(c46069I6f2, false, osz, 1);
        }
        I7S.LIZ(LJIIJ(), -1L, null, 6);
    }

    public static /* synthetic */ void LJIIZILJ(I6Z i6z, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        i6z.LJIILLIIL(0, i);
    }

    public final void LJIJI(int i, int i2, int i3) {
        InterfaceC153045zY interfaceC153045zY = this.LJLJLJ;
        if (interfaceC153045zY != null) {
            C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
            if (LJJI != null) {
                if (LJJI.LJFF().LJJIII() != null && LIZLLL().musicDuration > 0) {
                    this.LLII = i;
                    int i4 = i + LIZLLL().musicTrimIn;
                    if (i4 > LIZLLL().musicDuration) {
                        i4 %= LIZLLL().musicDuration;
                    }
                    InterfaceC153045zY interfaceC153045zY2 = this.LJLJLJ;
                    if (interfaceC153045zY2 != null) {
                        C122034qd LJJI2 = C17N.LJJI(interfaceC153045zY2);
                        if (LJJI2 != null) {
                            C121914qR LJJIII = LJJI2.LJFF().LJJIII();
                            if (LJJIII != null) {
                                LJJIII.LIZJ = i4;
                                LJJIII.LIZLLL = i4 + i3;
                                LJJIII.LJ = i2;
                                LJJIII.LJIILLIIL = false;
                                LJJI2.LJFF().LJJJJJL(LJJIII);
                                return;
                            }
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
