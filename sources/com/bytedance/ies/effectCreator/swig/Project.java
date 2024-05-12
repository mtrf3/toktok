package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class Project {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    /* loaded from: classes34.dex */
    public static class ProjectLoadSettings {
        public transient boolean swigCMemOwn;
        public transient long swigCPtr;

        public synchronized void delete() {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    EffectCreatorJniJNI.delete_Project_ProjectLoadSettings(j);
                }
                this.swigCPtr = 0L;
            }
        }

        public ProjectCreateFrom getECreateFrom() {
            return ProjectCreateFrom.swigToEnum(EffectCreatorJniJNI.Project_ProjectLoadSettings_eCreateFrom_get(this.swigCPtr, this));
        }

        public String getSOnlineMainDraftPath() {
            return EffectCreatorJniJNI.Project_ProjectLoadSettings_sOnlineMainDraftPath_get(this.swigCPtr, this);
        }

        public ProjectLoadSettings() {
            this(EffectCreatorJniJNI.new_Project_ProjectLoadSettings(), true);
        }

        public void finalize() {
            delete();
        }

        public static long getCPtr(ProjectLoadSettings projectLoadSettings) {
            if (projectLoadSettings == null) {
                return 0L;
            }
            return projectLoadSettings.swigCPtr;
        }

        public void setECreateFrom(ProjectCreateFrom projectCreateFrom) {
            EffectCreatorJniJNI.Project_ProjectLoadSettings_eCreateFrom_set(this.swigCPtr, this, projectCreateFrom.swigValue());
        }

        public void setSOnlineMainDraftPath(String str) {
            EffectCreatorJniJNI.Project_ProjectLoadSettings_sOnlineMainDraftPath_set(this.swigCPtr, this, str);
        }

        public ProjectLoadSettings(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_Project(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean canRedo() {
        return EffectCreatorJniJNI.Project_canRedo(this.swigCPtr, this);
    }

    public boolean canUndo() {
        return EffectCreatorJniJNI.Project_canUndo(this.swigCPtr, this);
    }

    public Error commit() {
        return new Error(EffectCreatorJniJNI.Project_commit__SWIG_1(this.swigCPtr, this), true);
    }

    public Version getAMERuntimeVersion() {
        return new Version(EffectCreatorJniJNI.Project_getAMERuntimeVersion(this.swigCPtr, this), true);
    }

    public DataChanges getAccumulatedDataChanges() {
        long Project_getAccumulatedDataChanges = EffectCreatorJniJNI.Project_getAccumulatedDataChanges(this.swigCPtr, this);
        if (Project_getAccumulatedDataChanges == 0) {
            return null;
        }
        return new DataChanges(Project_getAccumulatedDataChanges, true);
    }

    public Version getArtifactVersion() {
        return new Version(EffectCreatorJniJNI.Project_getArtifactVersion(this.swigCPtr, this), true);
    }

    public String getBuiltinAssetEffectPath() {
        return EffectCreatorJniJNI.Project_getBuiltinAssetEffectPath(this.swigCPtr, this);
    }

    public String getBuiltinAssetPath() {
        return EffectCreatorJniJNI.Project_getBuiltinAssetPath(this.swigCPtr, this);
    }

    public Version getBuiltinAssetVersion() {
        return new Version(EffectCreatorJniJNI.Project_getBuiltinAssetVersion(this.swigCPtr, this), true);
    }

    public Canvas getCanvasPtr() {
        long Project_getCanvasPtr = EffectCreatorJniJNI.Project_getCanvasPtr(this.swigCPtr, this);
        if (Project_getCanvasPtr == 0) {
            return null;
        }
        return new Canvas(Project_getCanvasPtr, true);
    }

    public String getClassName() {
        return EffectCreatorJniJNI.Project_getClassName(this.swigCPtr, this);
    }

    public ProjectCreateFrom getCreatedFrom() {
        return ProjectCreateFrom.swigToEnum(EffectCreatorJniJNI.Project_getCreatedFrom(this.swigCPtr, this));
    }

    public Version getDraftVersion() {
        return new Version(EffectCreatorJniJNI.Project_getDraftVersion(this.swigCPtr, this), true);
    }

    public EffectCapabilitiesJson getEffectCapabilitiesJsonPtr() {
        long Project_getEffectCapabilitiesJsonPtr = EffectCreatorJniJNI.Project_getEffectCapabilitiesJsonPtr(this.swigCPtr, this);
        if (Project_getEffectCapabilitiesJsonPtr == 0) {
            return null;
        }
        return new EffectCapabilitiesJson(Project_getEffectCapabilitiesJsonPtr, true);
    }

    public Version getEffectSDKVersion() {
        return new Version(EffectCreatorJniJNI.Project_getEffectSDKVersion(this.swigCPtr, this), true);
    }

    public EffectSubmissionDataJson getEffectSubmissionDataPtr() {
        long Project_getEffectSubmissionDataPtr = EffectCreatorJniJNI.Project_getEffectSubmissionDataPtr(this.swigCPtr, this);
        if (Project_getEffectSubmissionDataPtr == 0) {
            return null;
        }
        return new EffectSubmissionDataJson(Project_getEffectSubmissionDataPtr, true);
    }

    public ProjectState getProjectState() {
        return ProjectState.swigToEnum(EffectCreatorJniJNI.Project_getProjectState(this.swigCPtr, this));
    }

    public String getUUID() {
        return EffectCreatorJniJNI.Project_getUUID(this.swigCPtr, this);
    }

    public DataChanges getUnstagedDataChanges() {
        long Project_getUnstagedDataChanges = EffectCreatorJniJNI.Project_getUnstagedDataChanges(this.swigCPtr, this);
        if (Project_getUnstagedDataChanges == 0) {
            return null;
        }
        return new DataChanges(Project_getUnstagedDataChanges, true);
    }

    public Model getWorkingModel() {
        long Project_getWorkingModel = EffectCreatorJniJNI.Project_getWorkingModel(this.swigCPtr, this);
        if (Project_getWorkingModel == 0) {
            return null;
        }
        return new Model(Project_getWorkingModel, true);
    }

    public String getWorkingPath() {
        return EffectCreatorJniJNI.Project_getWorkingPath(this.swigCPtr, this);
    }

    public void init() {
        EffectCreatorJniJNI.Project_init(this.swigCPtr, this);
    }

    public EEStdLokiInfoList isDraftNeedUpgrade() {
        return new EEStdLokiInfoList(EffectCreatorJniJNI.Project_isDraftNeedUpgrade(this.swigCPtr, this), true);
    }

    public boolean isUseJSScript() {
        return EffectCreatorJniJNI.Project_isUseJSScript(this.swigCPtr, this);
    }

    public Error notifyRecordEnd() {
        return new Error(EffectCreatorJniJNI.Project_notifyRecordEnd(this.swigCPtr, this), true);
    }

    public Error notifyRecordStart() {
        return new Error(EffectCreatorJniJNI.Project_notifyRecordStart(this.swigCPtr, this), true);
    }

    public Error redo() {
        return new Error(EffectCreatorJniJNI.Project_redo(this.swigCPtr, this), true);
    }

    public Error undo() {
        return new Error(EffectCreatorJniJNI.Project_undo(this.swigCPtr, this), true);
    }

    public void unload() {
        EffectCreatorJniJNI.Project_unload(this.swigCPtr, this);
    }

    public Project() {
        this(EffectCreatorJniJNI.new_Project__SWIG_2(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.Project_className();
    }

    public void finalize() {
        delete();
    }

    public Project(String str) {
        this(EffectCreatorJniJNI.new_Project__SWIG_1(str), true);
    }

    public static long getCPtr(Project project) {
        if (project == null) {
            return 0L;
        }
        return project.swigCPtr;
    }

    public void addDataChangeObserver(DataChangeObserver dataChangeObserver) {
        EffectCreatorJniJNI.Project_addDataChangeObserver(this.swigCPtr, this, DataChangeObserver.getCPtr(dataChangeObserver), dataChangeObserver);
    }

    public void addDataEventReceiver(DataEventReceiver dataEventReceiver) {
        EffectCreatorJniJNI.Project_addDataEventReceiver(this.swigCPtr, this, DataEventReceiver.getCPtr(dataEventReceiver), dataEventReceiver);
    }

    public void addEffectMessageObserver(EffectMessageObserver effectMessageObserver) {
        EffectCreatorJniJNI.Project_addEffectMessageObserver(this.swigCPtr, this, EffectMessageObserver.getCPtr(effectMessageObserver), effectMessageObserver);
    }

    public Error commit(String str) {
        return new Error(EffectCreatorJniJNI.Project_commit__SWIG_0(this.swigCPtr, this, str), true);
    }

    public void fireDataEvent(DataEvent dataEvent) {
        EffectCreatorJniJNI.Project_fireDataEvent(this.swigCPtr, this, DataEvent.getCPtr(dataEvent), dataEvent);
    }

    public String getEffectPath(EffectType effectType) {
        return EffectCreatorJniJNI.Project_getEffectPath(this.swigCPtr, this, effectType.swigValue());
    }

    public Element getElement(ElementId elementId) {
        long Project_getElement = EffectCreatorJniJNI.Project_getElement(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
        if (Project_getElement == 0) {
            return null;
        }
        return new Element(Project_getElement, true);
    }

    public void recordAdded(Element element) {
        EffectCreatorJniJNI.Project_recordAdded(this.swigCPtr, this, Element.getCPtr(element), element);
    }

    public void recordRemoved(Element element) {
        EffectCreatorJniJNI.Project_recordRemoved(this.swigCPtr, this, Element.getCPtr(element), element);
    }

    public void removeDataChangeObserver(DataChangeObserver dataChangeObserver) {
        EffectCreatorJniJNI.Project_removeDataChangeObserver(this.swigCPtr, this, DataChangeObserver.getCPtr(dataChangeObserver), dataChangeObserver);
    }

    public void removeDataEventReceiver(DataEventReceiver dataEventReceiver) {
        EffectCreatorJniJNI.Project_removeDataEventReceiver(this.swigCPtr, this, DataEventReceiver.getCPtr(dataEventReceiver), dataEventReceiver);
    }

    public void removeEffectMessageObserver(EffectMessageObserver effectMessageObserver) {
        EffectCreatorJniJNI.Project_removeEffectMessageObserver(this.swigCPtr, this, EffectMessageObserver.getCPtr(effectMessageObserver), effectMessageObserver);
    }

    public Error save(String str) {
        return new Error(EffectCreatorJniJNI.Project_save__SWIG_1(this.swigCPtr, this, str), true);
    }

    public void setBuiltinAssetPath(String str) {
        EffectCreatorJniJNI.Project_setBuiltinAssetPath(this.swigCPtr, this, str);
    }

    public void setProjectState(ProjectState projectState) {
        EffectCreatorJniJNI.Project_setProjectState(this.swigCPtr, this, projectState.swigValue());
    }

    public void setUseSensorOrientationForAlgorithm(boolean z) {
        EffectCreatorJniJNI.Project_setUseSensorOrientationForAlgorithm(this.swigCPtr, this, z);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public Error upgradeDraft(EEStdStringList eEStdStringList) {
        return new Error(EffectCreatorJniJNI.Project_upgradeDraft(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList), true);
    }

    public Project(String str, String str2) {
        this(EffectCreatorJniJNI.new_Project__SWIG_0(str, str2), true);
    }

    public String askForEffectSticker(EffectType effectType, boolean z) {
        return EffectCreatorJniJNI.Project_askForEffectSticker(this.swigCPtr, this, effectType.swigValue(), z);
    }

    public Error exportEffect(String str, EffectType effectType) {
        return new Error(EffectCreatorJniJNI.Project_exportEffect(this.swigCPtr, this, str, effectType.swigValue()), true);
    }

    public Error load(String str, ProjectLoadSettings projectLoadSettings) {
        return new Error(EffectCreatorJniJNI.Project_load(this.swigCPtr, this, str, ProjectLoadSettings.getCPtr(projectLoadSettings), projectLoadSettings), true);
    }

    public void recordModified(Element element, String str) {
        EffectCreatorJniJNI.Project_recordModified(this.swigCPtr, this, Element.getCPtr(element), element, str);
    }

    public Error save(String str, boolean z) {
        return new Error(EffectCreatorJniJNI.Project_save__SWIG_0(this.swigCPtr, this, str, z), true);
    }

    public Project(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static Project create(String str, String str2, String str3, ProjectCreateFrom projectCreateFrom, Error error) {
        long Project_create__SWIG_1 = EffectCreatorJniJNI.Project_create__SWIG_1(str, str2, str3, projectCreateFrom.swigValue(), Error.getCPtr(error), error);
        if (Project_create__SWIG_1 == 0) {
            return null;
        }
        return new Project(Project_create__SWIG_1, true);
    }

    public static Project create(String str, String str2, String str3, ProjectCreateFrom projectCreateFrom, Error error, String str4) {
        long Project_create__SWIG_0 = EffectCreatorJniJNI.Project_create__SWIG_0(str, str2, str3, projectCreateFrom.swigValue(), Error.getCPtr(error), error, str4);
        if (Project_create__SWIG_0 == 0) {
            return null;
        }
        return new Project(Project_create__SWIG_0, true);
    }
}
